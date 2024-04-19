package recursion;

import java.util.Scanner;


public class Backtrack_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range=");
        int n = sc.nextInt();
        Backtrack(n,n);
    }

    private static void Backtrack(int n, int n1) {
        if(n<1)
            return;
        Backtrack(n-1,n1);
        System.out.print(n+" ");
    }
}
