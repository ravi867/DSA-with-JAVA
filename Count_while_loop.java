package com.ravi;

import java.util.Scanner;

public class Count_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n= sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(i+" ");
            i++;
        }
    }
}
