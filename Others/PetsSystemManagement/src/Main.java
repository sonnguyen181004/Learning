
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
        CustomerList custset=new CustomerList();
        ServiceList ListofService=new ServiceList();

        
        do{
            System.out.println("Health Center");
            System.out.println("1.Quan ly Service");
            System.out.println("2.Quan ly customer va orders");
            System.out.println("3.Report");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter choice");
            choice =sc.nextInt();
            ListofService.add(new Service (200,"spa",100));
            ListofService.add(new Service (101,"chich ngua",200));
            ListofService.add(new Service (230,"tialong",300));

            switch(choice){
                case 1:
                    int choice2=0;
                    //ServiceList ListofService=new ServiceList();
                   // ListofService.add(new Service (100,"spa",100));
                    //ListofService.add(new Service (101,"chich ngua",200));
                    //ListofService.add(new Service (102,"tialong",300));


                    do{
                        System.out.println("1.Add new Servie");
                        System.out.println("2. Display All Service");
                        System.out.println("3.Search a service by name,id");
                        System.out.println("4.Update a service by id");
                        System.out.println("Enter choice");
                        choice2=sc.nextInt();
                        switch(choice2){
                            case 1:
                                int serviceid;
                                int price;      
                                String name;
                                sc=new Scanner(System.in);
                                System.out.println("Enter Service id");
                                serviceid=sc.nextInt();
                                sc=new Scanner(System.in);
                                System.out.println("Enter service name");
                                name=sc.nextLine();
                                System.out.println("Enter price");
                                price=sc.nextInt();
                                Service s=new Service(serviceid,name,price);
                                if(ListofService.seachById(serviceid)==null&&ListofService.add(s))
                                System.out.println("Da them service moi");
                                else{
                                System.out.println("service id ís duplicated");
                                        }
                                break;
                                
                            case 2:
                                System.out.println("1.sort by id");//sap sep  theo id
                                System.out.println("2.sort by Name");
                                System.out.println("Enter choice");
                                int choice5=sc.nextInt();
                                if(choice5==1){
                                    ListofService.sortByid();
                                }
                                else if(choice5==2){
                                    ListofService.sortByName();
                                }
                                
                                ListofService.displayAllService();
                                break;
                            case 3:
                                System.out.println("1.Search by name");
                                System.out.println("2.Search by id");
                                System.out.println("Enter 1,2");
                                int choice3=sc.nextInt();
                                if(choice3==1){
                                    System.out.println("Enter a name to search");
                                    sc=new Scanner(System.in);
                                    String findname=sc.nextLine();
                                   ArrayList<Service> result =ListofService.searchByName(findname);
                                   if(result!=null&& result.size()>0){
                                       System.out.println("KEt qua tim");
                                       ((ServiceList)result).displayAllService();
                                     }
                                  // System.out.println("Ket qua tim theo ten");

                                   //((ServiceList)result).displayAllService();//ep kieu tuong minh vi result dang new cua arraylist la cua cha ma o arrlist thi k goi ham display cua thg con dc
                                    
                                }
                                else if(choice3==2){
                                    System.out.println("Enter Service Id to find");
                                    int findId=sc.nextInt();
                                    Service result2=ListofService.seachById(findId);
                                    if(result2==null){
                                        System.out.println("Not Found");
                                    }
                                    else{
                                        System.out.println("Tim thay");
                                        System.out.println(result2);
                                    }
                                //xem tim theo gia va tim theo ten hai dk thoa man
                                }
                                break;
                            case 4:
                                int updateid;
                                System.out.println("enter id to update");
                                updateid=sc.nextInt();
                                boolean result3=ListofService.updateService(updateid);
                                if(result3){
                                    System.out.println("Update!!!");
                                }
                                else{
                                    System.out.println("Update Fail!!!S");
                                }
                                break;
                        
                        }
                    
                    }while(choice2<=4);
                    break;
                case 2://quan ly customers va order
                    int choice4=0;
                    
                    do{
                        System.out.println("1.Add a new customer");
                        System.out.println("2. Display all customer");
                        System.out.println("3.Search a customer by id");
                        System.out.println("enter choice");
                        choice4=sc.nextInt();
                        switch(choice4){
                            case 1:
                                Customer m=new Customer();
                                System.out.println("ener id");
                                int custid=sc.nextInt();
                                System.out.println("enter custname");
                                sc=new Scanner(System.in);
                                String custname=sc.nextLine();
                                m.setCustid(custid);
                                m.setCustname(custname);
                                //code nay de them 1 pet vao cho m
                                String cont="Y";
                                
                              do{  
                                  System.out.println("Ener Pet Infor");
                                System.out.println("Enter Pet id");
                                int petid=sc.nextInt();
                                System.out.println("enter pet name");
                                sc=new Scanner(System.in);
                                String petname=sc.nextLine();
                                Pet p=new Pet(petid, petname);
                                if(m.addPet(p)){
                                    System.out.println("Add Pet Succesfullly!!");
                                }
                                else{
                                    System.out.println("Add Pet Fail");
                                }
                                  System.out.println("Add continue(Y/N)");
                                  sc=new Scanner(System.in);
                                  cont=sc.nextLine();
                                  
                              } while(cont.equalsIgnoreCase("Y"));
                                String ans="Y";
                              do{
                                System.out.println("Enter order infor");
                                Order ord=new Order();
                                cont="Y";
                                
                               do{
                                System.out.println("DS Pet cua customer");
                                m.displayAllPets();
                                System.out.println("enter pet id to order");
                                int petid_order=sc.nextInt();
                                Pet p=m.searchPet(petid_order);
                                System.out.println("DS service");
                                ListofService.displayAllService();
                                System.out.println("enrter service id to order");
                                int serviceid_order=sc.nextInt();
                                Service s=ListofService.seachById(serviceid_order);
                                
                                if(p!=null&&s!=null){
                                 OrderDetails detail=new OrderDetails(p,s);
                                 ord.addOrderDetail(detail);
                                    System.out.println("Done");
                                }
                                else
                                    System.out.println("pet or service is not valif");
                                System.out.println("add anymore y/n");
                                sc=new Scanner(System.in);
                                cont=sc.nextLine();
                               }while(cont.equalsIgnoreCase("Y"));
                               m.addOrder(ord);
                                System.out.println("add a new order more Y/N");
                                sc=new Scanner(System.in);
                                ans=sc.nextLine();
                        }while(ans.equalsIgnoreCase("y"));
                              m.output();
                              //add m vao custset
                              if(custset.add(m))//ham nay chi run duoc khi co ham compare compare to
                                System.out.println("da add customer");
                              else 
                                System.out.println("add customer fail");  
                                break;
                            case 2:
                                //xuat cac customer
                                System.out.println("Danh Sach Khach Hang     Cua He Thong");
                                custset.displayAllAsc();
                                break;
                            case 3:
                                //search cust by id
                                System.out.println("Enter cust id to search");
                                int findcustid=sc.nextInt();
                                Customer rs=custset.searchById(findcustid);
                                if(rs!=null){
                                    System.out.println("Customer Duoc Tim Thay");
                                    rs.output();
                                        
                                }
                                
                                else
                                    System.out.println("Not Found");
                                break;
                                
                        }
                    
                    }while(choice4<=3);
                    break;
            
            
                case 3:
                     sc=new Scanner(System.in);
                    System.out.println("dem so khach hang cua he thong");//
                    System.out.println("dem so don hang trong natm");//
                    System.out.println("hienthi khang co nhieu don hang nhat");
                    
                    System.out.println("cac dich vu chua duoc su dung");//dung mang count
                    System.out.println("cac dich vu duoc su dung nhieu nhat");
                    System.out.println("hien thi doanhthu cua he thong trong quy");
                    int choice5=sc.nextInt();
                    
                    switch(choice5){
                        case 1:
                            int cuscount=custset.countcustomer();
                            System.out.println("So luong khach hang trong  he thong"+cuscount);
                            break;
                        case 2:
                            System.out.println("Nhap nam can dem don");
                            int year=sc.nextInt();
                            Customer c=new Customer();
                            int ordcount=c.countOrders(year);
                            break;
                        /*case 3:
                            System.out.println(" danh sach dich vu chua duoc su dung");
                            Customer c2=new Customer();
                            c2.getCustwithMostOrders(customer);
                         */   
                    }
                    
                   
            }
        
        
        }while(choice<=3);
    }
}// them vao xuat tim kiem 3 colletion quant trong
