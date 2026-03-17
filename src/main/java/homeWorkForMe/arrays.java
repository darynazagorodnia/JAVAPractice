package homeWorkForMe;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args){
        int [] numbers = {5, 10, 15, 20};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int [] numbers2 = {20, 5, 15, 10};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

    }
}
