package com.calculator;

import java.io.IOException;

public class Calculate {
    public static int sum(int a, int b) //сложение
    {
        return a + b;
    }
    public static int difference(int a, int b) //Вычетание
    {
        return a - b;
    }
    public static int multiplication(int a, int b) //Умножение
    {
        return a * b;
    }
    public static int division(int a, int b) //Деление
    {
        return a / b;
    }

    public static int parseArifm(String dd) throws IOException //Присваиваем арифметическому действию числовое значение
    {
        switch (dd)
        {
            case "+" :
                return 1;
            case "-" :
                return 2;
            case "*" :
                return 3;
            case "/" :
                return 4;
            default:
                return Integer.parseInt(String.valueOf(new NumberFormatException()));
        }
    }

    public static void instr(String inp) throws IOException //Конвертируем и выполняем арифметические действия
    {
        String[] dde = inp.split(" ");
        if(Calculate.parseArifm(dde[1]) != 0) {
            if (Arabs.checkArab(dde[0]) || Arabs.checkArab(dde[2])) {
                int rt = Arabs.arabCalculate(Integer.parseInt(dde[0]), Integer.parseInt(dde[2]),Calculate.parseArifm(dde[1]));
                System.out.println(rt);
            } else if (Romes.checkRome(dde[0]) || Romes.checkRome(dde[2])) {
                int rt = Arabs.arabCalculate(Arabs.convertToArab(dde[0]), Arabs.convertToArab(dde[2]), Calculate.parseArifm(dde[1]));
                System.out.println(Romes.convertToRome(rt));
            } else {
                return;
            }
        }
        else
            return;
    }
}
