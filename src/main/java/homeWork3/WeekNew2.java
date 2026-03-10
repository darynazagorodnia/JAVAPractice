package homeWork3;

public class WeekNew2 {
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";
        switch (dayOfTheWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Робочий день");
            case "Saturday", "Sunday" -> System.out.println("Вихідний день");
        }

    }
}
