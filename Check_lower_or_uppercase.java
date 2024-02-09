package com.ravi;

import java.util.Scanner;

public class Check_lower_or_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet=");
        char c= sc.next().trim().charAt(0);
        if(c<='z' && c>='a')
            System.out.println("it is a lower case letter");
        else
            System.out.println("it is a uppercase letter");
    }
}
