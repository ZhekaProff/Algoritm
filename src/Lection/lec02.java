package Lection;
/*
Урок 2. Структуры данных. Массивы. Алгоритмы массивов
 */

public class lec02 {
    public static void main(String[] args) {
        int[] array = new int[]{
                1, 2, 3, 5, 4, 7, 6, 8, 9};
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();

        // bubbleSort(array);
        // directSort(array);
        insertSort(array);
        for (int arr : array) {
            System.out.print(arr + " ");
        }

        System.out.println();
        System.out.println(binarySearch(array, 5));
    }
// --------------- Простые сортировки O(n^2)----------------------------

    public static void bubbleSort(int[] array) { // сортировка позырьком
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

    public static void directSort(int[] array) { // сортировка выбором
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }

            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }

        }
    }

    public static void insertSort(int[] array) { // сортировка вставкой
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


            }

        }
    }
    // ------------------------------------------------------------
    // --------------- Продвинутые сортировки ---------------------






    // ================== Поиск ===================================
    public static int binarySearch(int[] array, int value){
        return binarySearch(array,value, 0, array.length - 1);
    }
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint + 1, max);
        }else {
            if(array[midPoint] > value){
                return binarySearch(array,value, min, midPoint - 1);
            }else {
                return midPoint;
            }
        }

    }

}
