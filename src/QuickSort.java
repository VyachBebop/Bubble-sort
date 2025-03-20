public class QuickSort {

    //TODO: Реализация сортировки методом быстрой сортировки
    public static void quickSort(int[] ArrayName) {
        if (ArrayName.length <= 1) {
            return;
        }

        int pivot = ArrayName[ArrayName.length - 1];
        int countOver = 0;
        int countUnder = 0;

        for (int i = 0; i < ArrayName.length - 1; i++) {
            if (ArrayName[i] > pivot) {
                countOver++;
            } else {
                countUnder++;
            }
        }
        int[] ArrayUnder = new int[countUnder];
        int[] ArrayOver = new int[countOver];

        int indexOver = 0;
        int indexUnder = 0;

        for (int j = 0; j < ArrayName.length - 1; j++) {
            if (ArrayName[j] > pivot) {
                ArrayOver[indexOver] = ArrayName[j];
                indexOver++;
            } else {
                ArrayUnder[indexUnder] = ArrayName[j];
                indexUnder++;
            }
        }
        quickSort(ArrayUnder);
        quickSort(ArrayOver);

        int n = 0;
        for(int i = 0; i < ArrayUnder.length; i++) {
            ArrayName[n] = ArrayUnder[i];
            n++;
        }
        ArrayName[n] = pivot;
        n++;
        for(int i = 0; i < ArrayOver.length; i++) {
            ArrayName[n] = ArrayOver[i];
            n++;
        }
        //System.out.println("Массив после сортировки: " + Arrays.toString(ArrayName));
    }
}
