package recursion;

import java.util.Scanner;

public class Linearly_1_to_n {
    static  int a =1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range=");
        int n= sc.nextInt();
        linearly(n);

    }

    private static void linearly(int n) {
        if(a==n){
            System.out.print(a+" ");
            return;
        }
        System.out.print(a+" ");
        a++;
        linearly(n);

    }
}
