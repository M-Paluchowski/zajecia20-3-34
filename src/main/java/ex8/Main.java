package ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 45, 547, 234, 12, 7, 13, 27, 0, -1, 1235, -35, 3, 999};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    // 5, 4, 3, 2, 1
    public static void bubbleSort(int[] numberToSort) {
        for (int i = 1; i < numberToSort.length; i++) {
            for (int j = 1; j < numberToSort.length; j++) {
                int currentNumber = numberToSort[j];
                int previousNumber = numberToSort[j - 1];
                if (currentNumber < previousNumber) {
                    numberToSort[j] = previousNumber;
                    numberToSort[j - 1] = currentNumber;
                }
            }
        }
    }

    //1, 2, 3, 5, 4
    //1, 2, 3, 4, 5
    private static void bubbleSortWhile(int[] numberToSort) {
        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 1; i < numberToSort.length; i++) {
                int currentNumber = numberToSort[i];
                int previousNumber = numberToSort[i - 1];
                if (currentNumber < previousNumber) {
                    numberToSort[i] = previousNumber;
                    numberToSort[i - 1] = currentNumber;
                    hasChanged = true;
                }
            }
        }
    }
}
