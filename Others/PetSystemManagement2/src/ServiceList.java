
import java.util.ArrayList;
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
public class ServiceList extends ArrayList<Service>{
    //ham de xuat danh sach service ra man hình
    public void displayAllService(){
      for(Service s:this){
          System.out.println(s);
      }
    }
    
    //ham nay de tim service dua vao name
    public ArrayList<Service> searchByName(String findname){
        ArrayList<Service> result=new ServiceList();
        for(Service s:this){
        if(s.getName().contains(findname)){
         result.add(s);
        }
        break;
        }
        return result;
    }
    //ham nay de tim service dua vao id
    public Service searchById(int findid){
      
       Service result=null;
      for(Service s:this){//quet tat cac phan tu trong mang
        if(s.getId()==findid){
            result=s;
            break;
        
        }
      }
      
      return result;
    }
    public boolean updateId(int updateid){
    Service result=searchById(updateid);
    Scanner sc=new Scanner(System.in);
    if(result!=null){
            System.out.println("Enter New Name");
            String name=sc.nextLine();
            System.out.println("Enter New price");
            int price=sc.nextInt();
            result.setName(name);
            result.setPrice(price);
            return true;}
    return false;
    }
    
    
}
