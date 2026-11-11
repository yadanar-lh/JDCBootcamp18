package com.jdc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileStreamExample {
    static void main() throws IOException {
        try(Stream<String> lines = Files.lines(Path.of("test.txt"))){
            lines.forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();


        }
    }
}
