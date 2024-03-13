package telran.util;

import java.util.Arrays;

public class ArraysInt {
    public static int[] addNumber(int[] array, int number) {
        //TODO
        int[] copiedArray = Arrays.copyOf(array, array.length + 1);
        copiedArray[copiedArray.length-1] = number;
        return copiedArray;
    }

    public static int[] insertNumber(int[] array, int index, int number) {
        int[] newArray = new int[array.length + 1];
        if (index > -1 && index < array.length + 1){
            newArray[index] = number;
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
        }
        return newArray;
    }

    public static int[] removeNumber(int[] array, int index) {
        int[] newArray = new int[array.length-1];
        if (index > -1 && index < array.length + 1) {
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - 1 - index);
        }
        return newArray;
    }

    public static int[] insertSorted(int[] sortedArray, int number) {
        int[] arrayCopy = Arrays.copyOf(sortedArray, sortedArray.length);
        System.arraycopy(sortedArray, 0, arrayCopy, 0, sortedArray.length);
        Arrays.sort(arrayCopy);
        int index = Arrays.binarySearch(arrayCopy, number);
        if (index < 0) {
            index = -1 * (index + 1);
        }
        return insertNumber(arrayCopy, index, number);
    }
}
