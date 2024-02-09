package com.ravi;

import java.util.Scanner;

public class Count_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range=");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
