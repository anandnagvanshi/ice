package com.primary.connect.response;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationService {
    public static RequestSpecification getShipmentRequestSpec(){
        QueryPayload query = new QueryPayload();
        query.setQuery("query { shipments { shipmentTrackingNumber}}");
        RequestSpecBuilder reqSpecBuilder = new RequestSpecBuilder();
        reqSpecBuilder.setContentType("application/json; charset=UTF-8");
        reqSpecBuilder.setBody(query);
        return RestAssured.given(reqSpecBuilder.build());
    }
}
