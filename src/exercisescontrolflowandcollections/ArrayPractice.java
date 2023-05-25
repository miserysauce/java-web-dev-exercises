package exercisescontrolflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] practiceValues = {1, 1, 2, 3, 5, 8};
//print each array value
//        for (Integer value : practiceValues
//             ) {
//            System.out.println(value);
//        }
        //print only odd numbers
        for (Integer value : practiceValues)
            if (value % 2 != 0) {
                System.out.println(value);
            }
        //string exercise
        String seussString = " I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayOfSeussString = seussString.split("\\.");
//        String[] arrayOfSeussString = seussString.split(" ");
        System.out.println(Arrays.toString(arrayOfSeussString));


    }
}
