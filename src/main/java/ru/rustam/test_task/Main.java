package ru.rustam.test_task;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String dataType;
        String sortingMode;
        String outputFileName;
        String[] inputFileNames;

        dataType = args[0];
        sortingMode = args[1];
        outputFileName = args[2];
        inputFileNames = Arrays.copyOfRange(args, 3, args.length);


        if (dataType == null || sortingMode == null || outputFileName == null || inputFileNames == null) {
            System.out.println("Вы ввели неправильно команду, проверьте все, пожалуйста");
            System.exit(0);
        }

        if (!dataType.equals("-i") && !dataType.equals("-s")) {
            System.out.println("Вы ввели неправильную команду типа данных");
            System.exit(1);
        }

        if (!sortingMode.equals("-a") && !sortingMode.equals("-d")) {
            System.out.println("Вы ввели неправильную команду режима сортировки");
            System.exit(1);
        }

        ReadAndWriteFile.file = new File(outputFileName);


        try {
            ReadAndWriteFile.fr = new FileWriter(ReadAndWriteFile.file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (dataType.equals("-i")) {
            Integer[] resultInteger = sortInteger(sortingMode, outputFileName, inputFileNames);
            ReadAndWriteFile.writeUsingFileWriter(resultInteger);

        } else if (dataType.equals("-s")) {
            String[] resultString = sortString(sortingMode, outputFileName, inputFileNames);
            ReadAndWriteFile.writeUsingFileWriter(resultString);
        }


    }

    static Integer[] sortInteger(String sortingMode, String outputFileName, String[] inputFileNames) {
        List<Integer> list = new ArrayList<>();

        for (String fileName : inputFileNames) {
            list.addAll(ReadAndWriteFile.readFileInteger(fileName));

        }
        Integer[] result = list.toArray(new Integer[0]);

        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sort sort = null;
        if (sortingMode.equals("-d")) {
            sort = new SortDescending();
        } else if (sortingMode.equals("-a")) {
            sort = new SortАscending();
        }
        result = sort.sortMerge(result);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
        return result;
    }


    static String[] sortString(String sortingMode, String outputFileName, String[] inputFileNames) {
        List<String> list = new ArrayList<>();

        for (String fileName : inputFileNames) {
            list.addAll(ReadAndWriteFile.readFileString(fileName));

        }
        String[] result = list.toArray(new String[0]);

        for (String i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sort sort = null;
        if (sortingMode.equals("-d")) {
            sort = new SortDescending();
        } else if (sortingMode.equals("-a")) {
            sort = new SortАscending();
        }
        result = sort.sortMerge(result);
        for (String i : result) {
            System.out.print(i + " ");
        }
        return result;
    }

}


