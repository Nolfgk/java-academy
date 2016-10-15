package homeworkSorting;

/**
 * Created by timur on 15.10.16.
 */
public class SecondSorting {


    static int[] sortSilly(int[] arrayToSort) {
//ваш код
        int i = 0;
        while (i < (arrayToSort.length-1)) {
            if (arrayToSort[i]> arrayToSort[i+1]){
                int buffer = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i+1];
                arrayToSort[i+1] = buffer;
                i = 0;
            } else { i++; }
        }
        return arrayToSort;
    }
}
