package com.ravi;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check=");
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not a Prime Number");
        else
            System.out.println("Prime Number");

    }
}
