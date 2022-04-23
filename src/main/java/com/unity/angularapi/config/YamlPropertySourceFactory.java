package com.unity.angularapi.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Properties;

public class YamlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource)
            throws IOException {
    //we use the YamlPropertySourceFactory bean to convert the resources in YAML Format
    // to java util format.
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(encodedResource.getResource());
        Properties properties = factoryBean.getObject();
        return new PropertiesPropertySource(encodedResource.getResource().getFilename(),properties);
    }
}
