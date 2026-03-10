package homeWork3;

public class WeekNew {
    // Перевірка дня тижня
    public static void main(String[] args) {
        String dayOfTheWeek = "Sunday";
        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
        }

        //   Перевірка місяця
        String month = "July";
        switch (month) {
            case "Deсember":
            case "January":
            case "February":
                System.out.println("Зима");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Весна");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Літо");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Осінь");
                break;
        }
    }
}


