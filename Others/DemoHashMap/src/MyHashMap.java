
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class MyHashMap extends HashMap<String, Student>{
    Student findHighestGpaStudent(){
        Student highestStudentGpa=null;
    double highestGpa=-1;
  for(Student s:this.values())
    if(s.getGpa()>highestGpa){
    highestGpa=s.getGpa();
    highestStudentGpa=s;
    }
  return highestStudentGpa;
      }
}
