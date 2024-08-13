/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC//
 */
public class FindSecondMax {
    public static int findsecondmax(int []arr){
    int max=Integer.MIN_VALUE;
    int secondmax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
     secondmax=max;
     max=arr[i];
    }
    else if (arr[i]<max&&arr[i]!=max){
     secondmax=arr[i];
    }
    }
    return secondmax;
    }
    
    public static void main(String[] args) {
        int[]arr={1,3,9,10,1999,3451};
        int secondmax=findsecondmax(arr);
        System.out.println(secondmax);
        
    }
}
