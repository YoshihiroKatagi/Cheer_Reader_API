package com.katagi.cheer_reader.controller;

import com.katagi.cheer_reader.dto.ExampleResponse;
import com.katagi.cheer_reader.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping
    public ExampleResponse getRandomNumber() {
        int randomValue = exampleService.generateRandomNumber();
        return new ExampleResponse(randomValue);
    }
}
