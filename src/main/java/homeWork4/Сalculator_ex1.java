package homeWork4;

public class Сalculator_ex1 {

        public int add ( int a, int b){
            int sum = a + b;
            System.out.println("Результат " + sum);
            return sum;
        }
    public static void main(String[] args) {
            Сalculator_ex1 myCalc = new Сalculator_ex1();
            int result = myCalc.add(5,60);
            System.out.println(result);
    }
}
