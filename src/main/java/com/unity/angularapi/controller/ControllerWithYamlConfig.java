package com.unity.angularapi.controller;

import com.unity.angularapi.config.YamlPropertySourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "classpath:application.yaml", factory = YamlPropertySourceFactory.class)
@RequestMapping(path = "/yaml")
public class ControllerWithYamlConfig {

    @Value("${spring.profiles.active}")
    private String message;

    @GetMapping(path = "/prop")
    public String read() {
        return "HELLO WORLD " + message;
    }
}
