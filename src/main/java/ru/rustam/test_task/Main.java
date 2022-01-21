package ru.rustam.test_task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String dataType = args[0];
        String sortingMode = args[1];
        String outputFileName = args[2];
        String[] inputFileNames = Arrays.copyOfRange(args, 3, args.length);


        if (dataType.equals("-i")) {
            sortInteger(sortingMode,outputFileName,inputFileNames);
        } else if (dataType.equals("-s")){
            sortString(sortingMode, outputFileName,inputFileNames);
        }


    }

    public static void sortInteger(String sortingMode,String outputFileName,String[] inputFileNames){
        List<Integer> list = new ArrayList<>();

        for (String fileName : inputFileNames) {
            list.addAll(ReadFileLineByLine.readFileInteger(fileName));

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
    }


    public static void sortString(String sortingMode,String outputFileName,String[] inputFileNames){
        List<String> list = new ArrayList<>();

        for (String fileName : inputFileNames) {
            list.addAll(ReadFileLineByLine.readFileString(fileName));

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
    }

}


