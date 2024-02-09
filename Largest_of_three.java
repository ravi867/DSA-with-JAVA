package com.ravi;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number=");
        int a = sc.nextInt();
        System.out.println("enter the second number=");
        int b = sc.nextInt();
        System.out.println("enter the third number=");
        int c = sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+"is greatest number");
        else if(b>a && b>c)
            System.out.println(b+"is greatest number");
        else
            System.out.println(c+"is greatest number");

    }
}
