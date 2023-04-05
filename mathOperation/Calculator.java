package org.example.mathOperation;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("делаем умножение на 2 числа?:");
        String doIt = in.nextLine();
        if (doIt.equals("да")) {
            System.out.println("Ожидание числа x...");
            int xMulti = in.nextInt();
            System.out.println("Ожидание числа y...");
            int yMulti = in.nextInt();
            BinaryOperator<Integer> multiplication = (x, y) -> (x * y);
            System.out.println(multiplication.apply(xMulti, yMulti));
        }
    }

}
