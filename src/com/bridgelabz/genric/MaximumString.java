package com.bridgelabz.genric;

import java.util.Scanner;

public class MaximumString {
    public static void main(String[] args) {



    Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 3 Strings :");


    String s1 = sc1.next();
    String s2 = sc1.next();
    String s3 = sc1.next();

		MaximumString.findingMaxString(s1, s2, s3);
}

    public static String findingMaxString(String s1, String s2, String s3) {
        String max = s1;
        if (s2.compareTo(max) > 0) {
            max = s2;
        }
        if (s3.compareTo(max) > 0) {
            max = s3;
        }
        System.out.println(" Max number is : " + max);
        return max;

    }

}

