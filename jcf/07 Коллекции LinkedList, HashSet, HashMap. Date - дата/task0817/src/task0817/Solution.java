package task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("Иванов", "Иван");
        map.put("Андреев", "Андрей");
        map.put("Петров", "Петр");
        map.put("Васильев", "Иван");
        map.put("Артемьев", "Петр");
        map.put("Викторов", "Виктор");
        map.put("Максимов", "Максим");
        map.put("Владимиров", "Владимир");
        map.put("Медведев", "Максим");
        map.put("Белкин", "Николай");
        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List list = new ArrayList(map.values());
        System.out.println(map);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    removeItemFromMapByValue(map, (String) list.get(i));
                }
            }
        }
        System.out.println(map);
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
