package ru.rustam.test_task;

public abstract class Sort {

    public Integer[] sortMerge(Integer[] arr) {

        Integer[] tmp;
        Integer[] currentSrc = arr;
        Integer[] currentDest = new Integer[arr.length];

        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }

        return currentSrc;

    }

    public String[] sortMerge(String[] arr) {

        String[] tmp;
        String[] currentSrc = arr;
        String[] currentDest = new String[arr.length];

        int size = 1;
        while (size < arr.length) {
            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;
        }

        return currentSrc;

    }

    protected abstract void merge(String[] src1, int src1Start, String[] src2,
                                  int src2Start, String[] dest, int destStart, int size);

    protected abstract void merge(Integer[] src1, int src1Start, Integer[] src2,
                                  int src2Start, Integer[] dest, int destStart, int size);


//    public  Integer[] sortMerge(Integer[] arr) {
//
//        if (arr == null) {
//            System.out.println("Массив пуст");
//
//            return null;
//        }
//        if (arr.length < 2) {
//            return arr;
//        }
//
//        Integer[] arr1 = new Integer[arr.length / 2];
//        Integer[] arr2 = new Integer[arr.length - (arr.length / 2)];
//        System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
//        System.arraycopy(arr, arr.length / 2, arr2, 0, arr.length - (arr.length / 2));
//        arr1 = sortMerge(arr1);
//        arr2 = sortMerge(arr2);
//        return merge(arr1, arr2);
//    }
//
//    public String[] sortMerge(String[] arr) {
//
//        if (arr == null) {
//            System.out.println("Массив пуст");
//
//            return null;
//        }
//        if (arr.length < 2) {
//            return arr;
//        }
//
//        String[] arr1 = new String[ arr.length / 2];
//        String[] arr2 = new String[ arr.length - (arr.length / 2)];
//        System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
//        System.arraycopy(arr, arr.length / 2, arr2, 0, arr.length - (arr.length / 2));
//        arr1 = sortMerge(arr1);
//        arr2 = sortMerge(arr2);
//        return merge(arr1, arr2);
//    }
//
//
//    abstract Integer[] merge(Integer[] a, Integer[] b);
//
//    abstract String[] merge(String[] a, String[] b);
}
