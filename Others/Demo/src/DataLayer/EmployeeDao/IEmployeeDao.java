package DataLayer.EmployeeDao;

import BussinessLayer.Entity.Employee;
import DataLayer.IUserDao;

/**
 *
 * @author SwordLake
 */
public interface IEmployeeDao extends IUserDao<Employee>{   
    void loadDataFromFile() throws Exception ;   
    //--------------------------------------------------  
    //To do here..........
}
