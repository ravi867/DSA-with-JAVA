package com.ravi;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        System.out.println("Your roll no is= "+roll);
        System.out.println("please enter your name");

        String name= sc.next();
        System.out.println("your name is "+name);

        System.out.println("enter the message");
        String message= sc.nextLine();
        System.out.println("the message is "+message);
        int z;
        z='न';
        System.out.println(z);



    }

}
