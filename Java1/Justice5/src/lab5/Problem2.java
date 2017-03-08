/*
 * Author: Cameron Justice
 * Program Title: 
 * Program Summary: 
 */
package lab5;

import java.util.Scanner;
import java.lang.Math;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side 1 length: ");
        double sideOne = input.nextDouble();

        System.out.println("Enter side 2 length: ");
        double sideTwo = input.nextDouble();

        System.out.println("Enter side 3 length: ");
        double sideThree = input.nextDouble();

        if (isValidTriangle(sideOne, sideTwo, sideThree)) {
            System.out.println("This shape is a trangle.");
            System.out.println("The area of this triangle is: " + area(sideOne, sideTwo, sideThree));
        } else {
            System.out.println("This shape is not a triangle.");
        }

    }

    public static boolean isValidTriangle(double sOne, double sTwo, double sThree) {
        double check = sOne + sTwo;
        if (check > sThree) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double sOne, double sTwo, double sThree) {
        double s = (sOne + sTwo + sThree) / 2;

        double area = Math.sqrt(s*(s - sOne) * (s - sTwo) * (s - sThree));

        return area;
    }
}
