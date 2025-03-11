import java.util.Arrays;

public class BubbleSort {
    //TODO Пузырьковая Сортировка
    public static void main(String[] args) {

        int[] array = {1, 6, 3, 9, 5, 2, 4, 8, 7, 10};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
