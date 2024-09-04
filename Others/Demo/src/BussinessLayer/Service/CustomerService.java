package BussinessLayer.Service;

import BussinessLayer.Entity.Customer;
import DataLayer.CustomerDao.ICustomerDao;
import DataLayer.DaoFactory;
import DataLayer.IDaoFactory;
import java.util.List;

/**
 *
 * @author SwordLake
 */
public class CustomerService implements IService<Customer> {

    ICustomerDao customerAction;
    IDaoFactory cutomerDaoFactory;

    public CustomerService() {
    }
    //--------------------------------------------------

    public CustomerService(String inputDataFile) throws Exception {
        cutomerDaoFactory = new DaoFactory(inputDataFile);
        this.customerAction = cutomerDaoFactory.customerDao();
    }
    //--------------------------------------------------
    @Override
    public void printList() throws Exception {
        customerAction.getList().forEach(obj -> System.out.println(obj));
//        for(var obj : customerAction.getList()){
//            System.out.println(obj);
//        }
    }
    //--------------------------------------------------
    public List<Customer> getList() throws Exception {
        return customerAction.getList();
    }
    //--------------------------------------------------
    public void add(Customer obj) throws Exception {
        customerAction.addNew(obj);
    }

    //To do here    
}
