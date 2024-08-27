
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class MyArrayList extends ArrayList<Product> {

    public List<Product> getProductByYear(int year) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            Product product = this.get(i);
            if (product.getYear() == year) {
                result.add(product);
            }

        }

        //dung comparator de sap xep price giam dan khi nhap year
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        };
        Collections.sort(result, productComparator);

        return result;

    }
// sap xep theo ten abc khi nhap gia giam dan
    public List<Product> getProductUnderPrice(double price) {
        List<Product> result = new ArrayList() {
        };
        for (int i = 0; i < this.size(); i++) {
            Product product = this.get(i);
            if (product.getPrice() == price) {
                result.add(product);
            }
        }
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(result, productComparator);
    return result;
    }
    
}
