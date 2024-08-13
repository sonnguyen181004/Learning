/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */s

/**
 *
 * @author PC
 */
public class MoveZeroes {
   public void printArray(int[]arr){
 int n=arr.length;
 for(int i=0;i<n;i++){
     System.out.print(arr[i]+" ");
 }
       System.out.println(" ");
}
   public void arrayDemo(){
   int []arr={8,1,0,2,1,0,3};
       printArray(arr);
       moveZeros(arr,arr.length);
       printArray(arr);
   }
   public void moveZeros(int[]arr,int n){
   int j=0;
   for(int i=0;i<n;i++){
   if(arr[i]!=0&&arr[j]==0){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    
   }
   if(arr[j]!=0){
   j++;
   }
   }
   
  
   }
    public static void main(String[] args) {
        MoveZeroes arr1=new MoveZeroes();
        arr1.arrayDemo();
    }

}
