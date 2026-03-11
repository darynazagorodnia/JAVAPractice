package homeWork3;

public class Week {
    // Перевірка дня тижня
    public static void main(String[] args) {
        String dayOfTheWeek = "Sunday";
        switch (dayOfTheWeek) {
            case "Monday": System.out.println("Робочий день");break;
            case "Tuesday": System.out.println("Робочий день");break;
            case "Wednesday": System.out.println("Робочий день");break;
            case "Thursday": System.out.println("Робочий день");break;
            case "Friday": System.out.println("Робочий день");break;
            case "Saturday": System.out.println("Вихідний день");break;
            case "Sunday": System.out.println("Вихідний день");break;
        }
        //   Перевірка місяця
        String mounth = "July";
        switch (mounth) {
            case "January": System.out.println("Winter");break;
            case "February": System.out.println("Winter");break;
            case "March": System.out.println("Sprin");break;
            case "April": System.out.println("Sprin");break;
            case "May": System.out.println("Sprin");break;
            case "June": System.out.println("Summer");break;
            case "July": System.out.println("Summer");break;
            case "August": System.out.println("Summer");break;
            case "September": System.out.println("Autumn");break;
            case "October": System.out.println("Autumn");break;
            case "November": System.out.println("Autumn");break;
            case "Desember": System.out.println("Winter");break;
        }
    }
}
