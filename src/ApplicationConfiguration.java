package com.primary.connect.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ApplicationConfiguration {

    public static Config loadTestProperties() {
        return ConfigFactory.parseResources("test.conf");
    }

}
