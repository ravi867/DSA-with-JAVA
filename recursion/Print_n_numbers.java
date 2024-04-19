package recursion;

import java.util.Scanner;

public class Print_n_numbers {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the range=");
        int n= in.nextInt();
        printing(n);

    }
    static void printing(int n)
    {
        if(n==1){
            System.out.print(1+",");
            return;}
        else
            printing(n-1);
            System.out.print(n+",");
    }
}

