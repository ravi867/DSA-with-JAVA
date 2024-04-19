package recursion;

import java.util.Scanner;

public class Backtrack_n_to_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range=");
        int a = sc.nextInt();
        Back(1,a);

    }

    private static void Back(int a, int a1) {
        if(a==a1){
            System.out.print(a+" ");
            return;

        }

        Back(a+1,a1);
        System.out.print(a+" ");
    }
}
