package com.ice.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        features = "src/test/resources/feature/",
        glue = "com.ice.steps",
        tags="@1",
        plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"
                //        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
          )

public class Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }



}
