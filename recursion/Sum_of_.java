package recursion;

import java.util.Scanner;
// sum of first n whole numbers using the recursion

public class Sum_of_ {
//    this is a parameterized way where recursion function take parameter.
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the range=");
//        int n= sc.nextInt();
//        Sum(n,0);
//    }
//
//    private static void Sum(int n, int i) {
//        if(n<0)
//        {
//            System.out.println("the sum is "+i);
//            return;
//
//        }
//        Sum(n-1,i+n);
//    }

    // there is a functional way where fun return itself value.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range=");
        int n= sc.nextInt();
        System.out.println("the ans is "+Sum(n));
    }

    private static int  Sum(int n) {
        if(n==1)
        {
            return 1;
        }
        return Sum(n-1)+n;


    }



}