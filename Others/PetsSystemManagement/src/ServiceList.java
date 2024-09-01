
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
public class ServiceList extends ArrayList<Service> {
    // Ham nay de xuat danh sach cac service ra man hinh
    // do thua ke arraylist nen co mang va ham cua cha
    public void displayAllService(){
      for(int i=0;i<size();i++){//ham size cua ham ArrayList//framework
          Service s=get(i);//get cua array
          System.out.println(s);
          // cach 1// chi dung  voi aarayy list
          //cach 2
          
    }
     /* for(Service s : this){
          System.out.println(s);
      }
      //cach 3
      Iterator<Service> it=iterator();
      while(it.hasNext()){// con phan tu khong de tim gia tri de xoa
          Service s=it.next();//doc service
          System.out.println(s);
      */
      }
      
      
      
    //}
    //ham nay de tim service dua vao name
    //input dau vao id name can tim
    //output dau ra danh sach cac service chua cac ten do
    //k dc xai ham void chi co xuat ra thi moi void
    public ArrayList<Service> searchByName(String findname){
        ArrayList<Service> result=new ServiceList();
        for(Service s:this){// sot buffer nhat ra cac service thoa dieu kien
         if(s.getName().contains(findname)){
           result.add(s);
         }//ham de tim gan dung name
       }
        return result;
    }
    //ham nay de tim service dua vao id
    //input id cua service can tim
    //out put service tim thay hoac tra ve null neu k thay
    public Service seachById(int findId){
      Service result=null;
      for(Service s:this){//quet tat cac phan tu trong mang
        if(s.getId()==findId){
            result=s;
            break;
        
        }
      }
      
      return result;
    }
    
    // ham nay de sua thong tin,gia cua service
    //input service id can suas
    //out put true/false
    public boolean updateService(int updateid){
       Service result=seachById(updateid);
       if(result!=null){
       Scanner sc=new Scanner(System.in);
           System.out.println("enter service name");
           String name=sc.nextLine();
           System.out.println("Enter price");
           int price=sc.nextInt();
           result.setName(name);
           result.setPrice(price);
           return true;
       }
       return false;
    }
    //sort by id tang(sapxep)
    public void sortByid(){
     Collections.sort(this);//phai co ham compare to bat buoc phai co nguyen lieu cho ham sort chay duoc
     // de ham sort chay duoc compiler phai su dung ham compare to trong list lien tuc su dung de doi vi tri
     // khi compiler goi compare to de swap theo id hoac gia thi dua vao do de compare
     //
        
    }
    //sort by price
    public void sortByName(){
        Collections.sort(this,Service.tmp);//ham sort 2 tham so
    }
    //ham nay de dem so dich vu ma khach hang su dung ouput tra ve 1 cai array cac so int
    public ArrayList<Integer> countserviceused(){
        ArrayList<Integer> count=new ArrayList();
        //dem cac service co trong orderdetail cua cac khach hang (3 vong for 1 vong quet cay 1 vong quet orderlist 1 vong de quet orderdetail)
        return count;
    }
    // ham nay de hien thi cac servicechua su dung
    //input aaraay sau khi dem so service co trong ordertaisls
    public void displayNotUsedSevice(ArrayList<Integer>count){
          for (int i = 0; i < count.size(); i++) {
            if (count.get(i) == 0) {
                System.out.println("Service: " + i); // In ra chỉ số của dịch vụ
            }
          }
    // neu count =- tthi vi tri i=0
    // thi xuat serice trong servicelist 
    }
    public void displayMostUsedService(ArrayList<Integer>counts){
    // tim max trong mang count s
    int max=Collections.max(counts);
    
    /*for (int i = 0; i < counts.size(); i++) {
     if(counts.get(i)==max){
         System.out.println("");
     }
    }
*/
   
    }

    
}
