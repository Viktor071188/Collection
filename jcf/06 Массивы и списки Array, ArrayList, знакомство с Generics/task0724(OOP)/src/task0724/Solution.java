package task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/

public class Solution {
    public static void main(String[] args) {
        Human grandMa1 = new Human("Marina", false, 65);
        Human grandMa2 = new Human("Irina", false, 60);
        Human grandPa1 = new Human("Mihail", true, 70);
        Human grandPa2 = new Human("Fedor", true, 75);
        Human father = new Human("Andrey", true,45, grandPa1, grandMa1);
        Human mather = new Human("Galya", false,42, grandPa2, grandMa2);
        Human child1 = new Human("Andrey", true,13, father, mather);
        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(child1);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;// напишите тут ваш код
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}