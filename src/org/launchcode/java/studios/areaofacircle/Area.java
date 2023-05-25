package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
        radius = input.nextDouble();
        input.close();
        if (radius < 0) {
            System.out.println("Error: please enter a valid number.");
        } else {
//        area = (pi * radius * radius);
            area = Circle.getArea(radius);
            System.out.println("The area of the circle is " + area);

        }
    }
}

