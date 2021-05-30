package com.ice.api.config;


import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseService {

    private String getQueryResourcePath() {
        return getClass().getClassLoader().getResource("queries.json").getPath();
    }

    public QueryRepository getQuery() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(getQueryResourcePath());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return new Gson().fromJson(fileReader, QueryRepository.class);
    }


    public Query getConnectionAndStatementById(String id){

        QueryRepository queryRepository = getQuery();
        List<Statement> requiredStatement = queryRepository.getStatements().stream().filter(statement -> statement.getId().equalsIgnoreCase(id) ).collect(Collectors.toList());
        List<Connection> connectionString =          queryRepository.getConnections().stream().filter(connection -> connection.getId().equalsIgnoreCase(requiredStatement.get(0).getConnection())).collect(Collectors.toList());

        return new Query(connectionString.get(0),requiredStatement.get(0));

    }
  }
