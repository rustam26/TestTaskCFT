package ru.rustam.test_task;

 abstract class Sort {

    protected Integer[] sortMerge(Integer[] arr) {

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

    protected String[] sortMerge(String[] arr) {

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


}
