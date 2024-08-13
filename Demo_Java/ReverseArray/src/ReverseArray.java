/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ReverseArray {
    public static void reverse(int[]numbers,int start,int end){
     while(start<end){
     int temp=numbers[start];
     numbers[start]=numbers[end];
     numbers[end]=temp;
     start++;
     end--;
     }
    }
    public static void printArray(int [] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]numbers={2,4,5,7,8,4};
        printArray(numbers);
        reverse(numbers,0,numbers.length-1);
        System.out.println("Array Reverse");
        printArray(numbers);
    }
    
}
