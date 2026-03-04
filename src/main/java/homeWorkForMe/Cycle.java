package homeWorkForMe;

public class Cycle {
    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Поїхали!");

        int percent = 100;
        do {
            System.out.println("Завантаження гри: " + percent + "%");
        } while (percent < 100);

        int target = 1000;
        int currentAmount = 0;

        while (currentAmount < target) {
            currentAmount += 50;
            System.out.println("У скарбничці вже: " + currentAmount);
        }
        System.out.println("Ціль досягнута!");

    }

}
