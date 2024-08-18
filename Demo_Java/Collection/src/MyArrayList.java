
import java.util.ArrayList;

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

}
