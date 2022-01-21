package ru.rustam.test_task;

  class SortDescending extends Sort{
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

}
