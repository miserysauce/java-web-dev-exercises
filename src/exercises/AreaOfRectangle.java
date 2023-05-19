package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of rectangle: ");
        length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        width = input.nextDouble();
        input.close();
        area = (length * width);
        System.out.println("The area of the rectangle is " + area);

    }
}
