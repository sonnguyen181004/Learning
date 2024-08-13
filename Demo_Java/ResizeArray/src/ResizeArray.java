/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ResizeArray {
    public void printArray(int[]arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
        System.out.println();
    }
    public int[] resize(int[]arr,int capacity){
    int[]temp=new int[capacity];
    for(int i=0;i<arr.length;i++){
    temp[i]=arr[i];
    }
    arr=temp;
    return arr;
    } 
    public static void main(String[] args) {
        ResizeArray arrutil=new ResizeArray();
        int[]original=new int[]{5,1,2,9,10};
        System.out.println("The size of original array"+original.length);
        original=arrutil.resize(original,10);
        System.out.println("The size after resize"+original.length);
    }
}
