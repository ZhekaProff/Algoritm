package Lection;

import java.util.ArrayList;
import java.util.List;

public class lec01 {
    public static void main(String[] args) {
        List<Integer> divider = findSimpleNumbers(12);
        for (int diver: divider) {
            System.out.print(diver + " ");
        }
    }

    public static List<Integer> findAvailableDivider(int number){ // поиск делителей числа
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max ; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    simple = false;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        return result;
    }
}
