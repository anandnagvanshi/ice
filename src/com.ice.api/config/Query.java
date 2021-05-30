package com.ice.api.config;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class Query {

    @SerializedName("connection")
    private Connection connection;
    @SerializedName("statement")
    private Statement statement;
}
