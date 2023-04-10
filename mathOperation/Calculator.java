package org.example.mathOperation;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("делаем умножение на 2 числа и после сумму 2 чисел?:");
        String doIt = in.nextLine();
        if (doIt.equals("да")) {
            System.out.println("Ожидание числа x1...");
            int xMulti = in.nextInt();
            System.out.println("Ожидание числа y1...");
            int yMulti = in.nextInt();
            System.out.println("Ожидание числа x2...");
            int xPlus = in.nextInt();
            System.out.println("Ожидание числа y2...");
            int yPlus = in.nextInt();
            BinaryOperator<Integer> multiplication = (x, y) -> (x * y);
            BinaryOperator<Integer> plus = Integer::sum;
            System.out.println(multiplication.apply(xMulti, yMulti) + plus.apply(xPlus, yPlus));
        }
    }

}
