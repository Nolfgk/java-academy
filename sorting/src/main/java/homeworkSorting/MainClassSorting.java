package homeworkSorting;
import java.util.Random;
import static homeworkSorting.FirstSortingAlgoritm.sortBubble;


/**
 * Created by timur on 15.10.16.
 */
public class MainClassSorting {

    public static void main(String[] args){

        int[] arrayToSort = GenerateRandomArray.generateRandomArray();
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(i+1 + " element in arrayToSort = " + arrayToSort[i]);
        }

        int[] sortedArray = sortBubble(arrayToSort);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(i+1 + " element in sortedArray = " + sortedArray[i]);
        }






    }
}
