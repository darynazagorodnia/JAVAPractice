package homeWorkForMe;

public class Mas {
    public static void main(String[] args) {

        int[] grades = {5, 4, 3, 2, 1};
        System.out.println("Список оцінок");
        System.out.println("_____");

        for (int currentGrade : grades) {
            System.out.println("Сьогодні отримана оцінка: " + currentGrade);
        }
    }
}

