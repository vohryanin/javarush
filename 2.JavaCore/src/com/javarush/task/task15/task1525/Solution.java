package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.javarush.task.task15.task1525.Statics.*;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static
    {
        try {
            lines.addAll(Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
