package exercisescontrolflowandcollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListPracticeBonus {
    public static void main(String[] args){
        String seussString = " I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] strSplit = seussString.split(" ");

        // Now convert string into ArrayList
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit));

        // Now print the ArrayList
        for (String s : strList)
            System.out.println(s);

    }
}
