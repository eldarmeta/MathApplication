package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 65000;
        int garySalary = 99000;

        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        System.out.println("__________________________");

        int carPrice = 25000;
        int truckPrice = 150000;

        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        System.out.println("__________________________");

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle is " + area);

        System.out.println("__________________________");

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is " + squareRoot);

        System.out.println("__________________________");

        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance = " + distance);

        System.out.println("__________________________");

        double value = -3.8;
        double absoluteValue = Math.abs(value);

        System.out.println("Absolute value is " + absoluteValue);

        System.out.println("__________________________");

        double randomValue = Math.random();
        System.out.println("Random number = " + randomValue);

        System.out.println("__________________________");

        int days = 24;
        long minutes = (days * 24) * 60;
        long milliSeconds = (minutes * 60) * 60;

        System.out.println("Total minutes in " + days + " days is " + minutes);
        System.out.println("Total milliseconds in " + days + " days is " + milliSeconds);


    }
}
