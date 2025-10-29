package com.back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
                <h1>Weare0.site</h1>
                <p>This is a Demo</p>
                """;
    }
}
