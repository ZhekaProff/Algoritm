package Seminar;

public class sem02 {
    public static void main(String[] args) {
        int[] array = new int[]{
                9, 2, 6, 5, 3, 7, 4, 8, 1};
        for (int arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
        sortBubble(array);
        for (int arr : array) {
            System.out.print(arr + " ");

        }

    }

    public static void sortBubble(int[] array) { // 1 задание
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
}
