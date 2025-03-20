import java.util.Arrays;

public class SelectionSort {

    public static void selectedSort(int[] arrayNumbs) {
        for (int i = 0; i < arrayNumbs.length; i++) {
            for (int j = i + 1; j < arrayNumbs.length; j++) {
                if (arrayNumbs[j] < arrayNumbs[i]) {
                    int temp = arrayNumbs[i];
                    arrayNumbs[i] = arrayNumbs[j];
                    arrayNumbs[j] = temp;
                }
            }
        }
     //   System.out.println(Arrays.toString(arrayNumbs));
    }
}
