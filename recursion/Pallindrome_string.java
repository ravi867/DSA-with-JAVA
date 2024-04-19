package recursion;

import java.util.Scanner;

public class Pallindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ->");
        String a= sc.next();
        if(is_pallindrome(a,a.length(),0))
            System.out.println("string-> "+a+" is pallindrome");
        else
            System.out.println("string-> "+a+" is not pallindrome");
    }

    private static boolean is_pallindrome(String a,int n,int i) {
        if(i==n/2)
            return true;
        if(a.charAt(i)!=a.charAt(n-i-1))
            return false;
        return (is_pallindrome(a,n,i+1));

    }

}
