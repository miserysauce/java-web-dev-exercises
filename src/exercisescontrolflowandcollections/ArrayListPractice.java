package exercisescontrolflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    //    public static int sumEven(ArrayList<Integer> numbers) {
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//        int total = 0;
//        for (int integer : numbers) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
////        System.out.println(total);
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fiveLetters;
        String userSearchResults;

        Integer numberOfLetters;

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        System.out.println("Please enter letter count to search for: ");
        numberOfLetters = input.nextInt();
        input.close();

        for (String i : planets) {
            if (i.length() == numberOfLetters) {
                userSearchResults = i;
                System.out.println(userSearchResults);
            }
//            if ( i.length() == 5){
//                fiveLetters = i;
//                System.out.println(fiveLetters);
//            }

        }


    }


}
