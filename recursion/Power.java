package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base=");
        int base= in.nextInt();
        System.out.println("enter the power=");
        int pow= in.nextInt();
        System.out.println("the ans is "+power(base,pow));
    }
// in this case the time complexity of our program is O(N).
    //because we use power function up to  N times and each time the time complexity is O(4)
    // we have an optimize solution for that where we reduce the time complexity upto O(logN).
    static int power(int base, int pow) {
        if(pow==0)
            return 1;
        return power(base,pow-1)*base;
    }
}
