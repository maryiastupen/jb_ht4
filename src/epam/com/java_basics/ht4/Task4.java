package epam.com.java_basics.ht4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] sequenceOfIntegers = {0, 5, 10, 6, 0, 26, 35, 78, 326, 0, 0};
        int[] nullNumbersArray = createNullNumbersArray(sequenceOfIntegers);
        printResultArray(nullNumbersArray);
    }

    private static int[] createNullNumbersArray(int[] sequenceOfIntegers) {
        int[] nullNumbersArray;
        int counterOfNullElements = 0;
        for (int i = 0; i < sequenceOfIntegers.length; i++) {
            if (sequenceOfIntegers[i] == 0) {
                counterOfNullElements++;
            }
        }
        nullNumbersArray = new int[counterOfNullElements];
        int j = 0;
        for (int i = 0; i < sequenceOfIntegers.length; i++) {
            if (sequenceOfIntegers[i] == 0) {
                nullNumbersArray[j++] = i;
            }
        }
        return nullNumbersArray;
    }

    private static void printResultArray(int[] nullNumbersArray) {
        System.out.println("The result array is " + Arrays.toString(nullNumbersArray));
    }
}
