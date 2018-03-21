package epam.com.java_basics.ht4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double[] randomSequenceOfRealNumbers = getRandomSequenceOfDoubles(7);
        double[] determinedSequenceOfRealNumbers = {-7, 2, 3.5, 6, 8, 23, 40};

        printResultForSequence(randomSequenceOfRealNumbers);
        printResultForSequence(determinedSequenceOfRealNumbers);
    }

    private static void printResultForSequence(double[] sequence) {
        if (checkIfSequenceIsIncreasing(sequence)) {
            System.out.println("The following sequence : " + Arrays.toString(sequence) + " is increasing");
        } else {
            System.out.println("The following sequence : " + Arrays.toString(sequence) + " is not increasing");
        }
    }

    private static boolean checkIfSequenceIsIncreasing(double[] randomSequenceOfRealNumbers) {
        boolean isIncreasing = true;
        for (int i = 0; i < randomSequenceOfRealNumbers.length-1; i++) {
            if (!(randomSequenceOfRealNumbers[i] < randomSequenceOfRealNumbers[i + 1])) {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }

    public static double[] getRandomSequenceOfDoubles(int arraySize) {
        double[] array = new Random().doubles(arraySize, 1, 10).toArray();
        return array;
    }
}
