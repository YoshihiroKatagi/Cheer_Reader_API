package com.katagi.cheer_reader.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExampleService {
    private final Random random = new Random();

    public int generateRandomNumber() {
        return random.nextInt(100); // 0～99のランダムな整数を返す
    }
}
