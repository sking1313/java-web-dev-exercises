package exercises;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayPractice {
    public static void main(String [] args) {
        int nums[] = {1, 1, 2, 3, 5, 8};
        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
                continue;
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not, with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        // String[] seussArray = seuss.split(" ");
        String[] seussArray = seuss.split("\\.");

        System.out.println(Arrays.toString(seussArray));



    }
}
