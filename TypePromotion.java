package com.ravi;

public class TypePromotion {
    /* int a = 257;
        byte b = (byte)a;
        When the value 257 is cast into a byte variable, the result is the remainder of the division of 257 by 256
        (the range of a byte), which is 1 in this case.
    */
    /*
    * Type Promotion Rules:
        Java defines several type promotion rules that apply to expressions.
        They are as follows: First, all byte, short, and char values are promoted to int, as just described.
        Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float,
        the entire expression is promoted to float. If any of the operands are double, the result is double.
        *
*/

    public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
