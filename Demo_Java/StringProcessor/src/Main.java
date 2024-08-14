
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        System.out.println("1 Test match patern");
        System.out.println("2 Test format camel");
        System.out.println("3.Reverse String");
        System.out.println("Enter your choice 1 or 2");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                sc=new Scanner(System.in);
                System.out.println("Enter a student id");
                String id=sc.nextLine();
                System.out.println("OUTPUT\n"+StringProcessor.match_student_id(id));
                break;
            case 2:
                sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String s=sc.nextLine();
                System.out.println("OUTPUT\n`"+StringProcessor.format_camel(s));
            case 3:
                sc=new Scanner(System.in);
                System.out.println("Enter A String");
                String s2=sc.nextLine();
                System.out.println(StringProcessor.reverseAll(s2));
            case 4:
                int count=StringProcessor.countPalidromeWord("madam is pep");
                System.out.println(count);
        }
    }
    
}