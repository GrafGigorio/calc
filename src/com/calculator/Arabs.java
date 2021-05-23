package com.calculator;//

public class Arabs {
    public static boolean checkArab(String ddd) //Проверяем наличие арабских символов
    {
        String arabCont = "10123456789";
        if(arabCont.contains(ddd))
            return true;
        else
            return false;
    }

    public static int arabCalculate(int a, int b, int arifm) //Выполняем калюкуляцию арабсикх символов
    {
        switch (arifm)
        {
            case 1:
                return Calculate.sum(a,b);
            case 2:
                return Calculate.difference(a,b);
            case 3:
                return Calculate.multiplication(a,b);
            case 4:
                return Calculate.division(a,b);
            default:
                return -1;
        }
    }

    public static int convertToArab(String dd) //Конвертируем римские в арабские символы
    {
        int [] arab =       {10,    1,      2,      3,       4,     5,      6,      7,       8,     9};
        String [] rome =    {"X",  "I",    "II",   "III",  "IV",    "V",    "VI",   "VII",  "VIII", "IX"};
        for (int i = 0; i < rome.length; i++) {
            if(dd.equals(rome[i]))
            {
                return arab[i];
            }
        }
        return -1;
    }
}
