package DataLayer;

// abstract factory interface. Creates data access objects.

import DataLayer.EmployeeDao.IEmployeeDao;
import DataLayer.CustomerDao.ICustomerDao;

// ** GoF Design Pattern: Factory.    
public interface IDaoFactory {
    ICustomerDao customerDao() throws Exception;
    IEmployeeDao employeeDao() throws Exception;  
    //.....
}
