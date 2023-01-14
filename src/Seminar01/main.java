package Seminar01;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        System.out.println(sumAllCount(5));
//        System.out.println(findAllVariants(6));
//        System.out.println(fib(5));
//        System.out.println(fib2(5));

        Date starDate = new Date();
        fib(100);
        Date endDate = new Date();
        System.out.println(starDate.getTime());

        long result = endDate.getTime() - starDate.getTime();
        System.out.println(result);

    }

    public static int sumAllCount(int n) { // 1e задание сумма от 1 до n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> findSimpleCount(int n) { // 2е задание все простые числа
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean count = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = false;
                }
            }

            if (count) {
                result.add(i);
            }
        }
        return result;
    }

    public static int findAllVariants(int facets) { // 3е поиск к-ва вариантов для 4х кубиков
        int count = 0;
        for (int i = 1; i <= facets; i++) {
            for (int j = 1; j <= facets; j++) {
                for (int k = 1; k <= facets; k++) {
                    for (int l = 1; l <= facets; l++) {
                        count++;
                        //                      System.out.println("[" + i + " " + j + " " + k + " " + l + "]");
                    }
                }
            }
        }
        return count;
    }

    public static int fib(int position) {  // поиск рекурсией числа фибоначчи 0,1,1,2,3,5,8,13
        if (position <= 2) {
            return 1;
        } else
            return fib(position - 1 - 1) + fib(position - 2 - 1);
    }

    public static int fib2(int position) {// поиск циклом числа фибоначчи 0,1,1,2,3,5,8,13
        if (position <= 2) {
            return 1;
        } else {
            int[] fib = new int[position];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < fib.length; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[position - 1];
        }
    }

}


/* Ахо, Ульман, Хопкрофт: Структуры данных и алгоритмы */
