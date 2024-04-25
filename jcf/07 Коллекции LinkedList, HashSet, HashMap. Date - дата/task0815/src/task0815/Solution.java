package task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("Иванов", "Иван");
        map.put("Андреев", "Андрей");
        map.put("Петров", "Петр");
        map.put("Васильев", "Иван");
        map.put("Петров", "Петр");
        map.put("Викторов", "Виктор");
        map.put("Максимов", "Максим");
        map.put("Владимиров", "Владимир");
        map.put("Медведев", "Максим");
        map.put("Белкин", "Николай");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
                count++;
        }
        System.out.println(count);// по условию на экран ничего выводиться не должно,просто для себя проверку написал
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //Напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName))
                count++;
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {
        getCountTheSameFirstName(createMap(), "Иван");
        getCountTheSameLastName(createMap(), " Петров");
    }
}
