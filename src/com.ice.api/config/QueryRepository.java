package com.ice.api.config;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class QueryRepository {

    @SerializedName("connection")
    private List<Connection> connections;
    @SerializedName("statement")
    private List<Statement> statements;
}
