package com.ravi;

public class TypeCasting {
    public static void main(String[] args) {
        // type conversion is automatically done by the compiler
        int a =23;
        float b=a;
        System.out.println(b); // automatically convert the type from int to float
        /* float a=20;
        int b=a;
        // it will gives an error because int is smaller then the float
         */
        /*
        Rules for the automatic type conversion
        1. The two types are compatible.
        2• The destination type is larger than the source type.
         */
        /* typeCasting Incompatible Types
        Although the automatic type conversions are helpful, they will not fulfill all needs. For example, what if you want to
        assign an int value to a byte variable? This conversion will not be performed automatically, because a byte is smaller
        than an int. This kind of conversion is sometimes called a narrowing conversion, since you are explicitly making the
        value narrower so that it will fit into the target type.
        */
        float z =20;
        int y= (int)(z);
        System.out.println(z);


    }
}
