package homeWorkForMe;

public class Ternar {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int result = (a > b) ? a : b;
        System.out.println(result);

        // умова ? вираз_якщо_true : вираз_якщо_false;

        boolean isLoggedIn = false;
        String message;

        /*  if (isLoggedIn){
            message = "Welcome";
        } else {
            message = "Login please";
        }
        System.out.println(message);*/

        String message1 = isLoggedIn ? "Welcome" : "Login please";
        System.out.println(message1);

        int x = 2;
        int sign;

        sign = (x >= 0) ? 1 : -1;
        System.out.println(sign);
    }


}
