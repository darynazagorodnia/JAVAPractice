package homeWork7_8;

public abstract class User {
    public abstract String getRole();

    public static void main(String[] args){
        User admin = new Admin();
        User customer = new Customer();
        User randomUser = new Admin();

        if (admin instanceof Admin){
            System.out.println("Це адміністратор");

        } if (customer instanceof Customer){
            System.out.println("Це користувач");
        }
        if (randomUser instanceof Admin){
            System.out.println("Це адмін");
        }
       // System.out.println("Користувач №1 " + admin.getRole());
        //System.out.println("Користувач №2 " + customer.getRole());

    }
}
