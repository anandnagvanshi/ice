package com.primary.connect.commons;

import com.primary.connect.config.ApplicationConfiguration;
import com.typesafe.config.Config;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariables {
    private static EnvironmentVariables instance = null;
    private Map<String, String > variables = new HashMap<>();
    private EnvironmentVariables(){
        Config config= ApplicationConfiguration.loadTestProperties();
        config.entrySet().forEach(entry ->{
                variables.put(entry.getKey().replace("\"",""), entry.getValue().unwrapped().toString());
        });
        getBrowserTypeResolved();
    }

    public static EnvironmentVariables getInstance(){
        if (instance == null) {
            instance = new EnvironmentVariables();
        }
        return instance;
    }


    public String getVariable(String key) {
        return variables.get(key);
    }

    public Map<String,String> getAllVariables() {
        return variables;
    }

    public void setVariable(String key, String value) {
        variables.put(key, value);

    }
    public void setAllVariable(Map<String, String> environmentVariables) {
        variables.putAll(environmentVariables);
    }

    private void getBrowserTypeResolved(){

        System.getProperty("browser.type");
        if(!System.getProperty("browser.type").isEmpty()){
                    variables.replace("browser.type",System.getProperty("browser.type"));
        }
    }

}
