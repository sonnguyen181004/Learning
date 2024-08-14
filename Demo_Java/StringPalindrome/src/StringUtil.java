/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class StringUtil {
    public boolean isPalidrome(String word){
    char[] charArray=word.toCharArray();
    int start=0;
    int end=word.length()-1;
    while(start<end){
    if(charArray[start]!=charArray[end]){
    return false;
    }
    start++;
    end--;
    
    }
    return true;
    }
    public static void main(String[] args) {
        StringUtil stringUtil= new StringUtil();
        if(stringUtil.isPalidrome("madam")){
            System.out.println("The String Is Palidrome");
        }
        else{
            System.out.println("The String Is not Palidrome");}
    }
    
}
