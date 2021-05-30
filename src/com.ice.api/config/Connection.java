package com.ice.api.config;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Connection {
private String id;
private String server;
private String database;
private String user;
private String password;
}
