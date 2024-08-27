
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javafx.print.Collation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class MyArrayList extends ArrayList<Student> {

    public Student findHighestGpa() {
        Student highestGpaStudent = null;
        for (Student student : this) {
            if (highestGpaStudent == null || student.getGpa() > highestGpaStudent.getGpa()) {
                highestGpaStudent = student;
            }
        }
        return highestGpaStudent;
    }

    /*vong lap for khac for(int i=0;i<thís.size();i++{
        Student student=this.get(i)
}
hoc them ve thuat toan tim gia tri lon nhat nho nhat trong list hoac màng
  get lay phần tử có index mình truyền vào
    size lấy kích thước 1 canh dác
    tim lớn thứ hai nhỏ thứ hai
     */
    public double getAverageGpa() {
        double sum = 0;
        for (int i = 0; i < this.size(); i++) {
            Student student = this.get(i);
            sum += student.getGpa();
        }
        return sum / this.size();

    }

    public Student findPhoneNum(String phoneNumber) {
        for (int i = 0; i < this.size(); i++) {
            Student student = this.get(i);
            if (student.getPhoneNumber().equals(phoneNumber)) {
                return student;
            }

        }
        return null;
    }

    public List<Student> getListStudentWithGpaAbove3() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            Student student = this.get(i);
            if (student.getGpa() >= 3) {
                students.add(student);
            }
        }
        Collections.sort(students);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // Sử dụng Collections.sort bên ngoài định nghĩa Comparator
        Collections.sort(students, comparator);

        return students;

    }

}
