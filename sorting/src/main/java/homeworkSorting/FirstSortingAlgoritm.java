package homeworkSorting;

import java.util.Random;

/**
 * Created by timur on 15.10.16.
 */
public class FirstSortingAlgoritm {

    public static int[] sortBubble(int[] arrayToSort) {

        for (int j = 1; j < arrayToSort.length; j++){
            for (int i = 0; i < (arrayToSort.length - j); i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int buffer = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = buffer;
                }
                //заполняем новый массив
            }
        }


//просто комментарий для гита

        return arrayToSort;
    }
}
