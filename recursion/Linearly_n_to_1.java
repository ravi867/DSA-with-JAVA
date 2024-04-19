package recursion;

import java.util.Scanner;


public class Linearly_n_to_1 {
    static  int a =1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range=");
        int n = sc.nextInt();
        line(n);
    }

    private static void line(int n) {
        if(a==n)
        {
            System.out.print(a+" ");
            return;
            
        }
        System.out.print(n+" ");
        n--;
        line(n);


    }
}
