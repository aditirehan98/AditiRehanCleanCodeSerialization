package org.example;

import java.io.IOException;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        Interest interest = new Interest();
        System.out.write("Enter amount\n".getBytes());
        interest.amount=sc.nextDouble();
        System.out.write("Enter the no. of years\n".getBytes());
        interest.t=sc.nextDouble();
        System.out.write("Enter the rate of interest\n".getBytes());
        interest.rate=sc.nextDouble();
        interest.simpleInterest();
        interest.compoundInterest();
    }
}
