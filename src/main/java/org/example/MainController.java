package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final ConfigMapConfigurationProperties props;

    @GetMapping("/{key}")
    public String value(@PathVariable String key) {
        return props.getData().get(key);
    }
}
