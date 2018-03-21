package epam.com.java_basics.ht4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arraySize = 50;
        int determinedNumber = 25;

        int[] array = getArrayOfRandomIntegers(arraySize);
        int sum = findSumOfMultipleToDeterminedNumber(determinedNumber, array);
        printResultSum(determinedNumber, sum);
    }

    private static int findSumOfMultipleToDeterminedNumber(int determinedNumber, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % determinedNumber == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int[] getArrayOfRandomIntegers(int arraySize) {
        int[] array = new Random().ints(arraySize, 1, 300).toArray();
        return array;
    }

    private static void printResultSum(int determinedNumber, int sum) {
        System.out.println("The sum of multiple to \'" + determinedNumber + "\' in array is \'" + sum + "\'");
    }


}
