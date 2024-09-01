
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class CustomerList extends TreeSet<Customer>{


    private ArrayList<Customer> customers;
    public void displayAllAsc(){
        for (Customer c : this) {//tro toi dia chi trong thanh phan cuoi cung benb trao data cua set chay tu trai sanng phai cua cay nen theo tang dan
            System.out.println("-------");
            c.output();
            System.out.println("-------");
        }
    }
    //ham nay se xuat tu phai qua trai xuat giam
    public void displayAllDesc(){
        //dung iterator
        Iterator<Customer> it=descendingIterator();//do xep nho hhon thi tra ve -1 nen nam ben trai
        while(it.hasNext()){
           Customer c=it.next();
           c.output();
        }
    
    }
    public Customer searchById(int findid){
         for (Customer c : this) {
             if(c.getCustid()==findid)
                 return c;
            
        }
         return null;
    }
    public int countcustomer(){
    int count = 0;
    for (Customer customer : customers) {
        count++;
    }
    return count;

    }
    // ham nay de dem cac don dat hang trong nam
    //input year
    //output so don hang trog nam
    public int countOrders(){
    return 0;
    // for dau tien quete cay
    // for thu 2 qute cac orderlist neu getyear(function)+1900==inputyear thi count++
    }
    public long getTotalMoney(int year){
    
    return 0;
    }
}
