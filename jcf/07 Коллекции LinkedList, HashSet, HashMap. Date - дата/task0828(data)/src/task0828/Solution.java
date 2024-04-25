package task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();

        Map<String, Integer> mapMonths = new HashMap<String, Integer>();

        mapMonths.put("January", 1);
        mapMonths.put("February", 2);
        mapMonths.put("March", 3);
        mapMonths.put("April", 4);
        mapMonths.put("May", 5);
        mapMonths.put("June", 6);
        mapMonths.put("July", 7);
        mapMonths.put("August", 8);
        mapMonths.put("September", 9);
        mapMonths.put("October", 10);
        mapMonths.put("November", 11);
        mapMonths.put("December", 12);

        for (Map.Entry<String, Integer> pair : mapMonths.entrySet())
        {
            if (pair.getKey().contains(monthName)) //перебирает ключи каждой пары и в случае contains совпадения с именем месяца введенным с клавиатуры выводит сообщение
            {
                System.out.println(monthName + " is " + pair.getValue() + " month");
            }
        }
    }//напишите тут ваш код
}
