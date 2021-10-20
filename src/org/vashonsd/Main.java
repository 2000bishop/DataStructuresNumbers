package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
             System.out.println("give number of dollars");
            int dollars = scan.nextInt();
            System.out.println("give number of cents");
            int cents = scan.nextInt();
           System.out.println((double) dollars + (double) cents * 0.01 +"is your total");

     // System.out.print( 30 / 60 );



    }
}
