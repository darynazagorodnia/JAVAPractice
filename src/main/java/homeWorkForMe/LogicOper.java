package homeWorkForMe;

public class LogicOper {

    public static void main(String[] args) {

        int a = 15;
        int b = 5;
        int c = 1;

        boolean rezult = c < b;
        System.out.println("Rezult " + rezult);

        boolean rezult2 = a < b;
        System.out.println("Rezult 2 " + rezult2);

        boolean conclusion = rezult || rezult2;
        System.out.println("Conclusion " + conclusion);

        boolean conclusion2 = rezult && rezult2;
        System.out.println("Conclusion " + conclusion2);


    }
}
