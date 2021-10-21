package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the cost of the meal?");
        double cost = scan.nextDouble();
        System.out.println("You are paying $" + cost + " for the meal.");
        System.out.println("Your tip at 15% is: " + cost * .15);
        double tip = cost * .15;
        tip = Math.round(tip * 100.0) / 100.0;
        System.out.println("Your total cost is: " + (cost + tip));




    }
}
