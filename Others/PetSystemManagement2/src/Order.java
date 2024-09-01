
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
    private long id;
    private Date orderdate;
    private ArrayList<OrderDetail> list;

    public Order() {
        id=System.currentTimeMillis();
        orderdate=new Date();
        list=new ArrayList<>();
    }

    public Order(long id, Date orderdate, ArrayList<OrderDetail> list) {
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

    public ArrayList<OrderDetail> getList() {
        return list;
    }

    public void setList(ArrayList<OrderDetail> list) {
        this.list = list;
    }
    
    
    
}
