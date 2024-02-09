package com.ravi;

import java.util.Scanner;

public class Digit_Occourance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number=");
        int num = sc.nextInt();
        System.out.println("enter the digit=");
        int digit= sc.nextInt();
        int count=0;
        while(num>0)
        {
            int rem= num%10;
            if(rem==digit)
                count++;
            num=num/10;

        }
        System.out.println("the occureance of "+digit+" in the number is "+count);

    }
}
