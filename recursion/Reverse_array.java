package recursion;


import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array=");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int mem:arr)
            System.out.print(mem+" ");
        reversing(arr,n,0);
        System.out.println();
        System.out.println("after reversing the array is =");
        for(int mem:arr)
            System.out.print(mem+" ");
    }

    private static void reversing(int[] arr, int n,int i) {
        if(i>arr.length/2)
            return;
        int temp= arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reversing(arr,n,i+1);
    }



}
