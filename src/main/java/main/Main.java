package main;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static final String level = "level1";

    @SneakyThrows
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            try (var reader = new BufferedReader(new FileReader(level + "/in" + i + ".txt"))) {

            }

        }
    }
}
