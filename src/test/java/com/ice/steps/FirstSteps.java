package com.ice.steps;


import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class FirstSteps {

    @When("I make a get call on {string}")
    public void i_make_a_get_call_on(String string) {

        RestAssured.useRelaxedHTTPSValidation();
        System.out.println("calling");
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        RequestSpecification requestSpecification =requestSpecBuilder.build();
//        Response response= RestAssured.get("https://gorest.co.in/public-api/products/");
        ValidatableResponse response1= RestAssured.given().spec(requestSpecification).get("https://gorest.co.in/public-api/products/").then();
        ResponseSpecification statusCheck = new ResponseSpecBuilder().expectStatusCode(200).build();
        ResponseSpecification contentTypeJason = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();

        response1.spec(statusCheck).spec(contentTypeJason);
        System.out.println(response1.extract().response().asString());



        RestAssured.reset();






    }

    @Then("status is {int}")
    public void status_is(Integer int1) {
        System.out.println("200");
    }

    public void setUp() throws Exception {
        try {
            RestAssured.port = 4444;
            RestAssured.useRelaxedHTTPSValidation();
            RestAssured.config().getSSLConfig().with().keyStore("classpath:keystore.p12", "password");
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }


}
