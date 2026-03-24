package homeWork4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cites_ex3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Київ");
        cities.add("Харків");
        cities.add("Одеса");
        cities.add("Ужгород");
        System.out.println(cities);

        cities.remove(1);
        System.out.println(cities);

        if (cities.contains("Одеса")) {
            System.out.println("Так, Одеса э у списку!");
            int index = cities.indexOf("Одеса");
            System.out.println("Вона знаходиться під індексом: " + index);
        } else {
            System.out.println("Одеси в списку не знайдено.");
        }

        HashMap<String, Integer> cityAreas = new HashMap<>();
        cityAreas.put("Київ", 839);
        cityAreas.put("Харків", 350);
        cityAreas.put("Одеса", 237);
        cityAreas.put("Ужгород", 42);
        System.out.println("Площа Києва: " + cityAreas.get("Київ") + "км2");
        System.out.println("Площа Харкова: " + cityAreas.get("Харків") + "км2");
        System.out.println("Площа Одеси: " + cityAreas.get("Одеса") + "км2");
        System.out.println("Площа Ужгорода: " + cityAreas.get("Ужгород") + "км2");

        Map<String, CitesEx3> cityInfo = new HashMap<>();
        cityInfo.put("Київ", new CitesEx3(839, 3.0));
        cityInfo.put("Харків", new CitesEx3(350, 1.5));
        cityInfo.put("Одеса", new CitesEx3(237, 1.0));
        cityInfo.put("Ужгород", new CitesEx3(42, 0.5));
        CitesEx3 kyivData = cityInfo.get("Київ");
        CitesEx3 kharkivData = cityInfo.get ("Харків");
        CitesEx3 odesaData = cityInfo.get ("Одеса");
        CitesEx3 uzhhorodData = cityInfo.get ("Ужгород");
        System.out.println("Київ: площа - " + kyivData.area + ", населення - " +kyivData.population);
        System.out.println("Харків: площа - " + kharkivData.area + ", населення - " + kharkivData.population);
        System.out.println("Одеса: площа - " + odesaData.area + ", населення - " + odesaData.population);
        System.out.println("Ужгород: площа - " + uzhhorodData.area + ", населення - " + uzhhorodData.population);


    }
}



