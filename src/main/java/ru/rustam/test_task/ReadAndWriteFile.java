package ru.rustam.test_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    static File file = null;
    static FileWriter fr = null;

    static List<Integer> readFileInteger(String fileName) {
        try {
            List<Integer> list = new ArrayList<>();
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            try {
                while (line != null) {

                    list.add(Integer.parseInt(line));
                    line = reader.readLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("В файле неправильно введено число");

            }


            fr.close();
            reader.close();
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл с указанным именем пути не существует не существует или недоступен по какой-либо причине");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    static List<String> readFileString(String fileName) {
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
            fr.close();
            reader.close();
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл с указанным именем пути не существует не существует или недоступен по какой-либо причине");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    static void writeUsingFileWriter(Integer[] data) {

        try {

            for (Integer i : data) {
                fr.write(i.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    static void writeUsingFileWriter(String[] data) {
        try {

            for (String s : data) {
                fr.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
