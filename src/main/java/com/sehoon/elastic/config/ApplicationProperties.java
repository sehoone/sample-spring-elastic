package com.sehoon.elastic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Properties specific to sample-spring-elastic.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private String customPropertiesValue;
}
