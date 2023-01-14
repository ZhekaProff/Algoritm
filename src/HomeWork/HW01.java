package HomeWork;

/*
Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел Фибоначчи и определить,
какой из них работает быстрее.
Так различия начнутся уже с 40 члена последовательности
 */

import javax.xml.crypto.Data;
import java.util.Date;

public class HW01 {
    public static void main(String[] args) {
        Date startDateFib = new Date();
        fibRec(75);
        Date endDateFib = new Date();
        long resultRec = endDateFib.getTime() - startDateFib.getTime();
        System.out.println(resultRec);

        Date startDateCycle = new Date();
        fibCycle(750000000);
        Date endDateCycle = new Date();
        long resultCycle = endDateCycle.getTime() - startDateCycle.getTime();
        System.out.println(resultCycle);

        Date startDateBine = new Date();
        fibBine(750000000);
        Date endDateBine = new Date();
        long resultBine = endDateBine.getTime() - startDateBine.getTime();
        System.out.println(resultBine);


    }


    public static int fibRec(int position) {  // поиск рекурсией числа фибоначчи 0,1,1,2,3,5,8,13
        if (position <= 2) {
            return 1;
        } else
            return fibRec(position - 1 - 1) + fibRec(position - 2 - 1);
    }

    public static int fibCycle(int position) { // поиск циклом числа фибоначчи 0,1,1,2,3,5,8,13
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

    public static int fibBine(int position) { // поиск Бине числа фибоначчи 0,1,1,2,3,5,8,13
        double squareRootOf5 = Math.sqrt(5);
        double phi = (1 + squareRootOf5) / 2;
        int nthTerm = (int) ((Math.pow(phi, position - 1) - Math.pow(-phi, -position + 1)) / squareRootOf5);
        return nthTerm;
    }
}
