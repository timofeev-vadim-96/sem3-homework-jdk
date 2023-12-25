package org.example;

import org.example.task.ArrayComparator;
import org.example.task.Calculator;
import org.example.task.Pair;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1. Калькулятор разных типов
         */
        int intN = 30;
        short shortN = 30;
        long longN = Long.parseLong("3709551615");
        byte byteN = 30;
        double doubleN = 30.0d;
        float floatN = 30.0f;
        Number firstCase = Calculator.sum(byteN, floatN);
        Number secondCase = Calculator.multiply(longN, doubleN);
        Number thirdCase = Calculator.divide(doubleN, floatN);
        Number fourthCase = Calculator.subtract(byteN, longN);
        System.out.printf("Задача 1. \n" +
                "Sum: %d + %f = %s (type: %s)\n", byteN, floatN, firstCase, firstCase.getClass().getSimpleName());
        System.out.printf(
                "Multiply: %d * %f = %s (type: %s)\n", longN, doubleN, secondCase, secondCase.getClass().getSimpleName());
        System.out.printf(
                "Divide: %f / %f = %s (type: %s)\n", doubleN, floatN, thirdCase, thirdCase.getClass().getSimpleName());
        System.out.printf(
                "Subtract: %d - %d = %s (type: %s)\n", byteN, longN, fourthCase, fourthCase.getClass().getSimpleName());


        /*
        Задача 2.
         */
        System.out.printf("Задача 2. \n" +
                "Первый случай сравнения массивов: %s\n", ArrayComparator.compareArrays(
                new Number[]{intN, shortN, byteN, floatN},
                new Number[]{intN, shortN, byteN, floatN}));

        System.out.printf("Второй случай сравнения массивов: %s\n", ArrayComparator.compareArrays(
                new Number[]{intN, shortN, byteN, floatN},
                new Number[]{intN, shortN, byteN, doubleN}));

        System.out.printf("Третий случай сравнения массивов: %s\n", ArrayComparator.compareArrays(
                new Number[]{intN, shortN, byteN, floatN},
                new Number[]{intN, shortN, byteN}));

        /*
        Задача 3.
         */
        Pair<Short, Float> pair = new Pair<>(shortN, floatN);
        System.out.printf("Задача 3. \n %s\n", pair);
    }
}