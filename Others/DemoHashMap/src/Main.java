
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("SO1", new Student(1, "Son", "12313", 3.2));
        studentMap.put("S02", new Student(2, "sadsad", "12e1", 3.1));
        studentMap.put("S02", new Student(3, "ưeadsad", "13232", 1.2));
        Student student = studentMap.get("S02");
        System.out.println(student.toString());
        //cach 1 get all elements b key 
        for(String key:studentMap.keySet()){
            System.out.println(studentMap.get(key).toString());
        }
        //get all students by value;
        for(Student s:studentMap.values()){
            System.out.println(s.toString());
        }
        //get all students by entry
        for(Map.Entry<String,Student> entry:studentMap.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue().toString());
        }
        //get all by iterating over the map
        Iterator<Map.Entry<String,Student>> iterator=studentMap.entrySet().iterator();
        while(iterator.hasNext()){
        Map.Entry<String,Student> entry=iterator.next();
            System.out.println(entry.getKey()+"=>"+entry.getValue().toString());
        }
        
        MyHashMap studentMapx=new MyHashMap();
         studentMapx.put("SO1", new Student(1, "Son", "12313", 3.2));
        studentMapx.put("S02", new Student(2, "sadsad", "12e1", 3.1));
        studentMapx.put("S02", new Student(3, "ưeadsad", "13232", 1.2));
        Student highestGpaStudent=studentMapx.findHighestGpaStudent();
        System.out.println("Gpa"+highestGpaStudent.toString());
    }
}
