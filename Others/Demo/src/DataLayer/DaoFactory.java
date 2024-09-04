package DataLayer;
 // Data access object factory
 // ** Factory Patte
import DataLayer.EmployeeDao.IEmployeeDao;
import DataLayer.EmployeeDao.EmployeeDao;
import DataLayer.CustomerDao.ICustomerDao;
import DataLayer.CustomerDao.CustomerDao;

public class DaoFactory implements IDaoFactory{
   
    IFileManager fileManager;

    public DaoFactory() {
    }    
    
    public DaoFactory(String inputDataFile) {       
        this.fileManager = new FileManager(inputDataFile);
    }
    
    @Override
    public ICustomerDao customerDao() throws Exception{
        return new CustomerDao(fileManager);
    }

    @Override
    public IEmployeeDao employeeDao() throws Exception{
        return new EmployeeDao(fileManager);
    }

  
}
