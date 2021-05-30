package com.ice.api.config;

import org.hibernate.Session;

import java.io.IOException;

public class Temp {
    public static void main(String[] args) {

        DatabaseService databaseService = new DatabaseService();
//        System.out.println(databaseService.getQuery().getStatements().get(0).getConnection());

        Query query = databaseService.getConnectionAndStatementById("selectCustomer");
        System.out.println(query.getConnection().toString());
        System.out.println(query.getStatement().getQuery());

        Session session = HibernateUtil.getSessionFactory(",","","","","").openSession();
        session.beginTransaction();

        // Check database version
        String sql = "select version()";

        String result = (String) session.createSQLQuery("").toString() ;
        System.out.println(result);

        session.getTransaction().commit();
        session.close();


        HibernateUtil.shutdown();

    }

}
