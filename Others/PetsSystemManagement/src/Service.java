
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Service implements Comparable<Service> {//so sanh service
    private int id;
    private String name;
    private int price;

    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ",` name=" + name + ", price=" + price + '}';
    }

    @Override
    //tang dan theo id
    public int compareTo(Service o) {
        if( id >o.getId()) return 1;//id cua thang dang trc lon hon thang sau
        // name.compareto(getname)//so sanh name
        else if(id<o.getId()) return -1;//am thi k thuc hien swap
        return 0;
        
        //neu id dung truoc be hon dung dang sau thi compiler tra ve duong thi swap se thanh giam dan
        //phai duong thi moi tim dc compiler moi swap dc
    }
    //anonymous nested class//doc them class nac danh dau vao ben trong (lop long nac danh)
    // comparable (java.lang)
    public static Comparator<Service> tmp=new Comparator<Service>() {
        //class an de service xai
        //sap xep tang theo name
        @Override
        public int compare(Service o1, Service o2) {//sort 2 tham so
            //To change body of generated methods, choose Tools | Templates.
            return o1.getName().compareTo(o2.getName());
        }
    };
    
    
}
