package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius = input.nextDouble();
        input.close();

        double answer = Circle.getArea(radius);
        System.out.println("The area of your circle is: " + answer);

//        System.out.println("The area of your circle is: " + (3.14 * radius * radius));
//        while (radius < 0) {
//            System.out.println("What is the radius of your circle?");
//
//        } this is do an infinite loop
    }
}
