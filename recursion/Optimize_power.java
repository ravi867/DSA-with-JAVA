package recursion;

import java.util.Scanner;

public class Optimize_power {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base ");
        int base = sc.nextInt();
        System.out.println("enter the power=");
        int power= sc.nextInt();
        System.out.println("the ans is "+pow(base,power));
    }

    static int  pow(int base, int power) {
        int temp;
        if(base==0)
            return 0;
        if(power==0)
            return 1;
        temp=pow(base,power/2);
        if(power%2==0)
        {

            return temp*temp;
        }
        else
            return temp*temp*base;

    }
}