package task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date datNew = new Date(date);
        Date startYear = new Date(date);
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);
        startYear.setDate(1);
        startYear.setMonth(0);
        long d = datNew.getTime() - startYear.getTime();
        long ms = 1000*60*60*24;
        int dayCount = (int)(d/ms);
        if (dayCount%2==0)  {
            return true;
        }
        else            return false;
    }
}
