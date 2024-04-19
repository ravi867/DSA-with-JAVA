package recursion;

import java.util.Scanner;
// print any name 6 times
public class Name {
    static int cnt=0;
    public  static  void name(String a)
    {
        if(cnt==6)
            return;
        System.out.println(a);
        cnt++;
        name(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String a = sc.next();
        name(a);

    }
}
