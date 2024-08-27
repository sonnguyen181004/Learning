
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        // Create a MyArrayList instance
        MyArrayList productList = new MyArrayList();
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
        // Add some Product objects to the list
        productList.add(new Product("P001", " A", 202011, 2010));
        productList.add(new Product("P002", " B", 202123, 2020));
        productList.add(new Product("P003", " F", 20210, 2020));
        productList.add(new Product("P004", " c", 123, 2020));
        productList.add(new Product("P005", " g", 10, 2020));

        // Test getProductByYear method
       System.out.println("Product by year");
       List<Product> produductsByYear=productList.getProductByYear(year);
 for(Product product:produductsByYear){
         System.out.println(product.toString());
     }
        // Test getProductUnderPrice method
      
    }
}
    

