package homeWork3;

public class WeekNew {
    // Перевірка дня тижня
    public static void main(String[] args) {
        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String targetDay = "Saturday";

        for (String day : dayOfTheWeek) {
            if (day.equals(targetDay)) {
                if (day.equals("Saturday") || day.equals("Sunday")) {
                    System.out.println("Вихідний день " + targetDay);
                } else {
                    System.out.println("Робочий день " + targetDay);
                }
                break;
            }
        }
        //   Перевірка місяця
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String targetMonths = "June";

        for (String season : months) {
            if (season.equals(targetMonths)) {
                if (season.equals("January") || season.equals("February") || season.equals("December")) {
                    System.out.println("Зима");
                } else if (season.equals("March") || season.equals("April") || season.equals("May")) {
                    System.out.println("Весна");
                } else if (season.equals("June") || season.equals("July") || season.equals("August")) {
                    System.out.println("Літо");
                } else {
                    System.out.println("Осінь");
                }
                break;
            }
        }
    }
}