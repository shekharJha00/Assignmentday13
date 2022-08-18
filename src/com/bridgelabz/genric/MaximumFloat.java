package com.bridgelabz.genric;

import java.util.Scanner;

public class MaximumFloat {
    public static void main(String[] args) {

    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter 3 Float numbers :");

   Float num1 = sc1.nextFloat();
    Float num2 = sc1.nextFloat();
    Float num3 = sc1.nextFloat();

    MaximumFloat.findingMaxNumber(num1, num2, num3);
}

    public static Float findingMaxNumber(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.println(" Max number is : " + max);
         return max;

    }

}

