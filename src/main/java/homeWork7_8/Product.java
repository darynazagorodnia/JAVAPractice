package homeWork7_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Product {
    String name;
    double price;
    boolean availability;

    public Product(String name, double price, boolean availability) {
        this.name = name;
        this.availability = availability;
        if (price >= 0) {
            this.price = price;
        } else if (price <= 0) {
            throw new PriceExceptionEx5HW8("Ціна не може бути від'ємною");
        }
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else if (price < 0) {
            throw new PriceExceptionEx5HW8("Ціна не може бути від'ємною");
        }
    }

    public void printProductInfo() {
        System.out.println("Інформація про товар: \n" +
                "Назва: " + name + "\n" +
                "Ціна: " + price + " грн \n" +
                "В наявності: " + (availability ? "Так" : "Ні"));
    }

    @Override
    public String toString() {
        return " Назва: " + name + '\'' +
                " ціна: " + price +
                " В наявності: " + availability;
    }

    public static void main(String[] args) {
        Product shampoo = new Product("Шампунь", 100.0, true);
        shampoo.printProductInfo();
        Product cellphone = new Product("iPhone", 70000.0, true);
        cellphone.printProductInfo();
        Product laptop = new Product("Lenovo", 35000.0, false);
        laptop.printProductInfo();

        System.out.println();

        ArrayList<Product> goods = new ArrayList<>();
        goods.add(new Product("Motorola", 25000, true));
        goods.add(new Product("Lenovo", 15000, true));
        goods.add(new Product("Samsung", 60000, true));
        goods.add(new Product("LG", 20000, false));
        System.out.println(goods);

        for (Product item : goods) {
            System.out.println(item);
        }

        System.out.println();

        HashSet<String> departments = new HashSet<>();
        departments.add("Електроніка");
        departments.add("Одяг");
        departments.add("Побутова техніка");
        departments.add("Одяг");

        boolean available = departments.contains("Електроніка");
        boolean available1 = departments.contains("Одяг");
        boolean available2 = departments.contains("Побутова техніка");

        System.out.println("Кількість категорій " + departments.size());

        System.out.println("Перелік категорій " + departments);

        System.out.println();

        HashMap<String, Double> categories = new HashMap<String, Double>();
        categories.put("Одяг", 50000.0);
        categories.put("Електроніка", 80000.0);
        categories.put("Побутова техніка", 950000.0);

        for (Map.Entry<String, Double> entry : categories.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        Map<String, Product> store = new HashMap<>();
        store.put("Одяг", new Product("Джемпер", 1750.5, false));
        store.put("Електроніка", new Product("Ноутбук Lenovo", 50000.0, true));
        store.put("Побутова техніка", new Product("Холодильник", 25000, true));
// переробити іншим способом
        try {
            Product targetProduct = store.get("Електроніка");
            targetProduct.setPrice(-100.0);
        } catch (PriceExceptionEx5HW8 e) {
            System.out.println("Тест пройшов: отримано очікувану помилку: " + e.getMessage());
        }

        if (categories.get("Одяг") == 50000.0) {
            System.out.println("Ціна відповідає назві!");
        } else {
            System.out.println("Ціна не збігається!");
        }

        for (Map.Entry<String, Product> entry : store.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}

