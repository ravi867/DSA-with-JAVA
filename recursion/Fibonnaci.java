package recursion;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        System.out.println("the fibbonaci is "+fib(n));

    }

    private static int  fib(int n) {
        if(n==0 || n==1)
            return  n;
        return (fib(n-1)+fib(n-2));
    }
}
