package Assignment2;

import java.util.*;
import java.util.Scanner;

public class duplicateArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x =sc.nextInt();
        int arr[]=new int[x];
        int i,count=0;
            for(i=0;i<x;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Array: ");
            for(i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Duplicate elements: ");
        for(i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}