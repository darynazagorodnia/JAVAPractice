package homeWork3;

public class Conditions {

    // Перевірка віку
    public static void main(String[] args) {
        int age = 71;
        if (age < 18) {
            System.out.println("Доступ заборонено!");
        } else {
            System.out.println("Доступ дозволено!");
        }
// Перевірка температури
        int temp = 20;
        if (temp < 25) {
            System.out.println("Прохолодно!");
        } else if (temp <= 30) {
            System.out.println("Тепло!");
        } else {
            System.out.println("Жарко!");
        }

        int mark = 91;
        if (mark >= 90) {
            System.out.println("Відмінно");
        } else if (mark >= 75) {
            System.out.println("Добре");
        } else if (mark >= 60) {
            System.out.println("Задовільно");
        } else if (mark >=0) {
            System.out.println("Погано");
        }
    }


}
