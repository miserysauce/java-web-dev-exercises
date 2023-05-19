package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] arg){
        double milesDriven;
        double gallonsConsumed;
        double milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven: ");
        milesDriven = input.nextDouble();
        System.out.println("Please enter how many gallons of gas have been consumed: ");
        gallonsConsumed = input.nextDouble();
        input.close();
        milesPerGallon = (milesDriven / gallonsConsumed);
        System.out.println("Your miles per gallon: " + milesPerGallon);

    }
}
