package com.cloudtechmasters.realtimeprojectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    //endpoint for health check
    @GetMapping("/health")
    public String checkHealth(){
        return  "App is up and running healthy!";
    }
}
