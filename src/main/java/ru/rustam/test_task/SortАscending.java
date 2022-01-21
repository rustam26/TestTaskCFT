package ru.rustam.test_task;

public  class SortАscending {

    private static Integer[] merge(Integer[] a, Integer[] b) {

        Integer[] result = new Integer[a.length + b.length];
        int n = a.length;
        int m = b.length;

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;

        }

        while (j < m) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }


    public Integer[] sortMerge(Integer[] arr) {

        if (arr == null) {
            System.out.println("Массив пуст");

            return null;
        }
        if (arr.length < 2) {
            return arr;
        }

        Integer[] arr1 = new Integer[arr.length / 2];
        Integer[] arr2 = new Integer[arr.length - (arr.length / 2)];
        System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, arr2, 0, arr.length - (arr.length / 2));
        arr1 = sortMerge(arr1);
        arr2 = sortMerge(arr2);
        return merge(arr1, arr2);
    }

//    private static Integer[] merge(Integer[] a, Integer[] b) {
//
//        Integer[] result = new Integer[a.length + b.length];
//        int n = a.length;
//        int m = b.length;
//
//        int i = 0, j = 0, k = 0;
//        while (i < n && j < m) {
//            if (a[i] >= b[j]) {
//                result[k] = a[i];
//                i++;
//            } else {
//                result[k] = b[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n) {
//            result[k] = a[i];
//            i++;
//            k++;
//
//        }
//
//        while (j < m) {
//            result[k] = b[j];
//            j++;
//            k++;
//        }
//
//        return result;
//    }

}
