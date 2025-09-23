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

    }
}
