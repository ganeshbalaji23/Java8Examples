package com.stream.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileAndPathsExample {

    public static void main(String[] args) throws IOException {

        List<String> linesList = Files.lines(Paths.get("/Users/GANESH/Downloads/test.txt"))
                .filter(line->line.contains("Stream")).map(line -> line.trim())
                .collect(Collectors.toList());

        linesList.forEach(line-> System.out.println(line));

        System.out.println(linesList.size());

    }
}
