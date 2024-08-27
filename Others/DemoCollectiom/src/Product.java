/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Product {
    public String id;
    public String name;
    public double price;
    public int year;

    public Product() {
    }

    public Product(String id, String name, double price, int year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", year=" + year + '}';
    }
    
    
}
