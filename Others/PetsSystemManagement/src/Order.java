    
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Order {
    private long id;//de xai random
    private Date orderdate;
    private ArrayList<OrderDetails> list;
    public Order(){
     id=System.currentTimeMillis();
     orderdate=new Date();//tra ve ngay thang nam
     list=new ArrayList<>();
    }

    public Order(long id, Date orderdate, ArrayList<OrderDetails> list) {
        this.id = id;
        this.orderdate = orderdate;
        this.list = list;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public ArrayList<OrderDetails> getList() {
        return list;
    }

    public void setList(ArrayList<OrderDetails> list) {
        this.list = list;
    }
    public void output(){
        System.out.println("Order:");
        System.out.println("id:"+id);
        System.out.println("order date "+orderdate.toString());
        System.out.println("Order details");
        /*for(int i=0;i<list.size();i++){//duyetcac phan tu trong array list
         OrderDetails s=list.get(i);
        }*///cach 1
        for(OrderDetails orderDetail:list){
            System.out.println(orderDetail);
        }
        System.out.println("Tong tien thanh toan cho don hang"+GetTotalMoney());
        
    }
    //ham nay de them 1 order detail vao fiedlists
    //input orderdetail
    //output true.falls
    public boolean addOrderDetail(OrderDetails o){
     return list.add(o);
    }
    public long GetTotalMoney(){
        long total=0;
        for (OrderDetails orderDetails : list) {
            total=total+orderDetails.getService().getPrice();
        }
     return total;
    }//tinh tien 1 order
    
    
}
