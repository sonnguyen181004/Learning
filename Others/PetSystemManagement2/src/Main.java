
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
public class Main {
    public static void main(String[] args) {
        int choice=0;
        do{
            System.out.println("Health Cente System");
            System.out.println("--------------------");
            System.out.println("1.Quan Ly Service");
            System.out.println("2.Quan Ly Customers và Orders");
            System.out.println("3.Report");
          
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            ServiceList ListofService=new ServiceList();
            ListofService.add(new Service(100,"spa",1000));
            ListofService.add(new Service(101,"tia long",2000));
            ListofService.add(new Service(102,"chich ngua",3000));
           
            

            
            switch(choice){
                case 1:
                    int choice2=0;
                    do{
                         
                    
                    System.out.println("1.Add New Service");
                    System.out.println("2.Display All Service");
                    System.out.println("3.Search Service By Name,ID");
                     System.out.println("4.Update Service By Id");
                    
                    System.out.println("Enter Your Choice...");
                    choice2=sc.nextInt();
                    switch(choice2){
                        case 1:
                            int serviceid;
                            String servicename;
                            int serviceprice;
                            sc=new Scanner(System.in);
                            System.out.println("Enter Id");
                            serviceid=sc.nextInt();
                            sc=new Scanner(System.in);
                            System.out.println("Enter Name");
                            servicename=sc.nextLine();
                            sc=new Scanner(System.in);
                            System.out.println("Enter Price");
                            serviceprice=sc.nextInt();
                            Service s=new Service(serviceid,servicename,serviceprice);
                            if(ListofService.searchById(serviceid)==null&&ListofService.add(s))
                                System.out.println("Đã Thêm Service");
                            
                            else
                                System.out.println("Không Thể Thêm Service");
                            
                            
                            break;
      
                        case 2:
                            ListofService.displayAllService();
                            break;
                        case 3:
                            int choice3=0;
                            
                            System.out.println("1.Find By Name");
                            System.out.println("2.Find By ID");
                            choice3=sc.nextInt();
                            if(choice3==1){
                                String findname;
                                System.out.println("Enter A Name To Search:...");
                                sc=new Scanner(System.in);
                                findname=sc.nextLine();
                                ArrayList<Service> result=ListofService.searchByName(findname);
                                if(result!=null&&result.size()>0)
                                    System.out.println("Đã Tìm Thấy");
                                    System.out.println("Kết Quả Tìm:");
                                    ((ServiceList)result).displayAllService();
                               
                            }
                             else if (choice3==2)
                                    System.out.println("Enter Id To Search");
                                    int findid=sc.nextInt();
                                    Service result2=ListofService.searchById(findid);
                                    if(result2==null){
                                        System.out.println("Không Tìm Thấy");
                                    }
                                    else
                                        System.out.println("Đã Tìm Thấy");
                                        System.out.println("Kết Quả Tìm");
                                        System.out.println(result2);
                            
                            break;
                        case 4:
                            int updateid;
                            System.out.println("Enter Id to Update");
                            updateid=sc.nextInt();
                            boolean result3=ListofService.updateId(updateid);
                            if (result3){
                                System.out.println("Update Succesfully");
                            }
                            else{
                                System.out.println("Update Fail!!!!!");
                            }
                            
                            break;
                    }
                    }while(choice2<=4);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        
        
        
        
        
        }while(choice<=3);
    }     
 }
    
