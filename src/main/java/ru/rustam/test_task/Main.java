package ru.rustam.test_task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String dataType = args[0];
        String outputFileName = args[2];
        String[] inputFileNames = Arrays.copyOfRange(args, 3, args.length);


        List<Integer> list = new ArrayList<>();
        for (String fileName : inputFileNames) {
            list.addAll(ReadFileLineByLine.readFile(fileName));

        }
        Integer[] result = list.toArray(new Integer[0]);

        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sort sort = new Sort();
        result = sort.sortMerge(result);
        for (Integer i : result) {
            System.out.print(i + " ");
        }


    }


}


