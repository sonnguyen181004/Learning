
import java.util.ArrayList;
import java.util.List;
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
        Student st1 = new Student(1, "son", "01239112", 4.9);
        Student st2 = new Student(2, "son2", "123214", 4.0);
        Student st3 = new Student(3, "son3", "192323", 1.9);
        Student st4 = new Student(4, "son4", "12313", 2.9);

        MyArrayList myArratList = new MyArrayList();
        myArratList.add(new Student(5, "choi", "sdadad", 3.7));//faster solution adding
        myArratList.add(st1);
        myArratList.add(st2);
        myArratList.add(st3);
        myArratList.add(st4);
        for (int i = 0; i < myArratList.size(); i++) {//size get number elements of list
            Student student = myArratList.get(i);
            if (student.getGpa() > 3.5) {
                System.out.println(student.toString());
            }
        }
        System.out.println("Highest GPA" + myArratList.findHighestGpa());
        System.out.println("Average GPA" + myArratList.getAverageGpa());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PhoneNumber");
        String phoneNumer = sc.nextLine();
        System.out.println("Student Found" + myArratList.findPhoneNum(phoneNumer));

        /* ArrayList studentList2 =new ArrayList();
     studentList.add("Hello");//1 list nen de 1 kieu du lieu
     studentList.add(st1);
     
     
     List<Student> studentList3=new ArrayList<Student>();//soltution3 <> kieu du lieu generic type giup minh ép collection chứa dữ liêuj mình mong muốn
     ArrayList<Student> studentList4=new ArrayList<>();//solution 4 khai bao cac kieu du lieu minh muon trong mang
         */
    }

}
