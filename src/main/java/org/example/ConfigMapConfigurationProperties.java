package org.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "config-map")
@Data
public class ConfigMapConfigurationProperties {
    private Map<String, String> data;
}
