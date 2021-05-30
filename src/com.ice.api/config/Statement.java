package com.ice.api.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Statement {

private String id;
private String connection;
private String query;
}
