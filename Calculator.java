package com.ravi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice what do you calculate");
        char ch = sc.next().trim().charAt(0);
        if(ch=='+'|| ch=='-'||ch=='*'|| ch=='/' ||ch=='%')
        {
            System.out.println("enter the first operand=");
            int a= sc.nextInt();
            System.out.println("enter the second operand=");
            int b= sc.nextInt();
            if(ch=='+')
                System.out.println("the result is "+(a+b));
            else if(ch=='-')
                System.out.println("the result is "+(a-b));
            else if(ch=='*')
                System.out.println("the result is "+(a*b));
            else if(ch=='/')
                System.out.println("the result is "+(a/b));
            else if(ch=='%')
                System.out.println("the result is "+(a%b));

        }
        else
            System.out.println("enter the valid choice");

    }
}
