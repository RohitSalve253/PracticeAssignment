package net.engineeringdigest.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
//Creating a method
    @GetMapping("/health-check")
    public String healthCheck(){
        return "OK";
    }
}
