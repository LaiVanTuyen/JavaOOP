package com.ptit.customproperties.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {
    private String from;
    private String to;
    private String defaultObject;
}
