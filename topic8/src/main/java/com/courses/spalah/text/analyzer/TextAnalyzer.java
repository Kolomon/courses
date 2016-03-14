package com.courses.spalah.text.analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ievgen Tararaka
 */
public class TextAnalyzer {
    public static String[] readLineFromFile() {
        try {

            BufferedReader reader = new BufferedReader(new FileReader("E:\\111\\courses\\topic8\\src\\main\\resources"));

            String line;
            List<String> lines = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
//если нужен массив то список можно запросто преобрпзовать
            String[] linesAsArray = lines.toArray(new String[lines.size()]);
            return linesAsArray;
        } catch (IOException e) {
            e.getMessage();
            System.out.println("CAN NOT READ FILE:");
            return new String[]{""};
        }
    }
    public static void main(String[] args) {

    }
}
