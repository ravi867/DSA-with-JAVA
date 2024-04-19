package recursion;

import java.util.Scanner;

public class Factorial {
    /*public static void main(String[] args)
    {
        System.out.print("enter the number =");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("the factorial of the number is "+fact(n));

    }
    static  int fact(int n)
    {
        if(n==0)
            return 1;
        return fact(n-1)*n;
    }

     */

    // there is a parameterized way to do that
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        int n= sc.nextInt();
        fact(n,1);
    }

    private static void fact(int n, int i) {
        if(n==1)
        {
            System.out.println("the ans is "+i);
            return;

        }
        fact(n-1,n*i);

    }
}
