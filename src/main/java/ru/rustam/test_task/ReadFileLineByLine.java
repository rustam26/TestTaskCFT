package ru.rustam.test_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileLineByLine {

    public static List<Integer> readFileInteger(String fileName) {
        try {
            List<Integer> list = new ArrayList<>();
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = reader.readLine();
            }


            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> readFileString(String fileName) {
        try {
            List<String> list = new ArrayList<>();
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
