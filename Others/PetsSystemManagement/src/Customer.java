
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
public class Customer implements Comparable<Customer>{
    private int custid;
    private String custname;
    private ArrayList <Pet> petlist;// field nayf ddeer quanr lys cacs con pet cua khach hang
    private ArrayList<Order> orderlist;// danh scach cac order

    public Customer() {
        custid=0;
        custname="khach le";
        petlist=new ArrayList<>();
        orderlist=new ArrayList<>();
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public ArrayList<Pet> getPetlist() {
        return petlist;
    }

    public void setPetlist(ArrayList<Pet> petlist) {
        this.petlist = petlist;
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
    
    
    //ham nay de add 1 pet vao petlist
    public boolean addPet(Pet p){
     return petlist.add(p);
    }
    // ham nat de add order vao orderlist
    public boolean addOrder(Order ord){
     return orderlist.add(ord);
    }
    //ham nay de inb danh sach petlist ra man hinh
    public void displayAllPets(){
     for(Pet pet:petlist){
         System.out.println(pet);
     }
    }
    //ham nay tim pet trong pet list bang cach tim id
    //input pet id
    //output tra ve pet tim thay hoac null
    public Pet searchPet(int petid){
     for(Pet pet:petlist){
     if(pet.getId()==petid)
       return pet;
     }
     return null;
    }
    //ham nay de in daanh orderlist
    public void displayAllOrders(){
     for(Order ord:orderlist){
         ord.output();
     }
    }
    public void output(){
        System.out.println("cust id"+custid);
        System.out.println("cust name"+custname);
        displayAllPets();
        displayAllOrders();
    }

    //tim customer k dc trung id
    @Override
    public int compareTo(Customer o) {
        if(custid>o.custid) return 1;
        else if(custid<o.custid) return-1;
        return 0; //neu id trung thi set loai ptu trung
    }
    public long GetTotalMoneyOfOrders(int month,int year){
     return 0;//tim kiem cac order trong thang va nam de tinh tong cac order
    }
    public int countOrders(int year){
        int count=0;
        for (Order order : orderlist) {
            int ordyear=order.getOrderdate().getYear()+1900;
            if(ordyear==year){
            count++;
            }
            return count;
            
            
        }
    return 0;//duyet mang order lay order dat cat year so voi cai nay count++
    }
    /*public Customer getCustwithMostOrders(ArrayList<Customer>customers){
      Customer customerWithMostOrders = customers.get(0); // Giả sử khách hàng đầu tiên có số lượng đơn hàng lớn nhất ban đầu
    
    // Duyệt qua danh sách khách hàng để tìm khách hàng có số lượng đơn hàng nhiều nhất
    for (int i = 1; i < customers.size(); i++) {
        Customer currentCustomer = customers.get(i);
        if (currentCustomer.countOrders() > customerWithMostOrders.countOrders()) {
            customerWithMostOrders = currentCustomer;
        }
    }
    
    return customerWithMostOrders;
    }*/
}
