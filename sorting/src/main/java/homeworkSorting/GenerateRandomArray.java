package homeworkSorting;

import java.util.Random;

/**
 * Created by timur on 15.10.16.
 */
public class GenerateRandomArray {

    public static int[] generateRandomArray() {
        final Random random = new Random();
        int arraySize = random.nextInt(100) + 1;
        System.out.println("arraySize = " + arraySize);
        int numbersArray[] = new int[arraySize];

        for (int i = 0; i<arraySize; i++) {
            numbersArray[i] = random.nextInt(100) + 1;
        }
        return numbersArray;
    }
}
