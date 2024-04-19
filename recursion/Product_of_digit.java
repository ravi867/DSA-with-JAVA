package recursion;

import java.util.Scanner;

public class Product_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number=");
        int number = sc.nextInt();
        System.out.println("the sum of the digits of the number is= "+digitSum(number));
    }

    private static int digitSum(int number) {
        if(number==0)
            return 1;
        return digitSum(number/10)*(number%10);
    }
}
