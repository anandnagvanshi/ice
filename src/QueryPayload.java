package com.primary.connect.response;

import lombok.Data;

@Data
public class QueryPayload {
    private String query;
    private Object variables;
}
