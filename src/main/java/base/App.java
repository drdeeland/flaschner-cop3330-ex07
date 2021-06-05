/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    final float imperialToMetric = 0.09290304f;

    public static void main(String[] args) {
        App myApp = new App();

        String lengthString = myApp.setLength();
        String widthString = myApp.setWidth();

        int length = Integer.parseInt(lengthString);
        int width = Integer.parseInt(widthString);

        myApp.printDimensions(length, width);

        int area = myApp.calculateArea(length, width);
        float areaMetric = myApp.areaMetric(area);

        myApp.printArea(area, areaMetric);
    }

    public String setLength() {
        System.out.print("What is the length of the room in feet? ");
        return input.nextLine();
    }

    public String setWidth() {
        System.out.print("What is the width of the room in feet? ");
        return input.nextLine();
    }

    public void printDimensions(int length, int width) {
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public float areaMetric(int area) {
        return area * imperialToMetric;
    }

    public void printArea(int area, float areaMetric) {
        System.out.printf("The area is%n%d square feet%n%.3f square meters", area, areaMetric);
    }
}
