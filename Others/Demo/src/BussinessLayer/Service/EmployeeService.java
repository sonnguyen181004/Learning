package BussinessLayer.Service;

import BussinessLayer.Entity.Employee;
import DataLayer.DaoFactory;
import DataLayer.EmployeeDao.IEmployeeDao;
import DataLayer.IDaoFactory;
import java.util.List;

/**
 *
 * @author SwordLake
 */
public class EmployeeService implements IService<Employee> {

    IEmployeeDao employeeAction;
    IDaoFactory employeeDaoFactory;

    public EmployeeService() {
    }

    //--------------------------------------------------
    public EmployeeService(String inputDataFile) throws Exception {
        employeeDaoFactory = new DaoFactory(inputDataFile);
        this.employeeAction = employeeDaoFactory.employeeDao();
    }
    //--------------------------------------------------

    @Override
    public void printList() throws Exception {

        employeeAction.getList().forEach(obj -> System.out.println(obj));
//        for(var obj : employeeAction.getList()){
//            System.out.println(obj);
//        }
    }

    //--------------------------------------------------
    public List<Employee> getList() throws Exception {
        return employeeAction.getList();
    }

    //--------------------------------------------------
    public void add(Employee obj) throws Exception {
        employeeAction.addNew(obj);
    }
    //--------------------------------------------------  
    //To do here..........
}
