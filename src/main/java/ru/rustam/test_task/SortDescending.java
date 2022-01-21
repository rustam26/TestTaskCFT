package ru.rustam.test_task;

public  class SortDescending extends Sort{
    @Override
    protected void merge(String[] src1, int src1Start, String[] src2, int src2Start, String[] dest, int destStart, int size) {

        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);


        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++){
            if (index1 < src1End && (index2 >= src2End || src1[index1].compareTo(src2[index2]) > 0 )){
                dest[i] = src1[index1];
                index1++;
            }else {
                dest[i] =src2[index2];
                index2++;
            }
        }
    }

    @Override
    protected void merge(Integer[] src1, int src1Start, Integer[] src2, int src2Start, Integer[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);


        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++){
            if (index1 < src1End && (index2 >= src2End || src1[index1] > src2[index2] )){
                dest[i] = src1[index1];
                index1++;
            }else {
                dest[i] =src2[index2];
                index2++;
            }
        }
    }


//    @Override
//     Integer[] merge(Integer[] a, Integer[] b) {
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
//
//    @Override
//    String[] merge(String[] a, String[] b) {
//
//        String[] result = new String[a.length + b.length];
//        int n = a.length;
//        int m = b.length;
//
//        int i = 0, j = 0, k = 0;
//        while (i < n && j < m) {
//            if (a[i].compareTo(b[j]) >= 0) {
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
