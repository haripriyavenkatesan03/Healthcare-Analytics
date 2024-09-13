package com.example.healthcare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import py4j.GatewayServer;

@RestController
public class AnalyticsController {

    private GatewayServer gatewayServer;

    public AnalyticsController() {
        gatewayServer = new GatewayServer(new PythonEntryPoint());
        gatewayServer.start();
    }

    @GetMapping("/predict")
    public String predictOutcome(@RequestParam("age") int age, @RequestParam("condition") String condition) {
        PythonEntryPoint pythonEntryPoint = (PythonEntryPoint) gatewayServer.getPythonServerEntryPoint(new Class[]{PythonEntryPoint.class});
        return pythonEntryPoint.predict(age, condition);
    }
}
