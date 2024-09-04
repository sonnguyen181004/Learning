package Application.UI;

import Application.Utilities.DataInput;
import BussinessLayer.Entity.Employee;
import BussinessLayer.Service.IService;

/**
 *
 * @author SwordLake
 */
public class EmployeeMenu {

    IService<Employee> service;

    //--------------------------------------------------  
    public EmployeeMenu(IService<Employee> service) {
        this.service = service;
    }

    //--------------------------------------------------  
    public void processMenuForEmployee() {
        boolean stop = true;
        try {
            do {
                Menu.print("******Employee Management******|1.Add Employee|2.Update Employee|3.Remove Employee"
                        + "|4.Find Employee|5.Print Employee List|6.Export to file|7.Back to main menu|Select :");
                int choice = Menu.getUserChoice();
                switch (choice) {
                    case 1 -> {
                        addNewEmployee();
                    }
                    case 2 -> {
                        System.out.println(">>Customer updated successfully.");
                    }
                    case 3 -> {
                        System.out.println(">>Customer removed successfully.");
                    }
                    case 4 -> {
                        System.out.println(">>Customer found.");
                    }
                    case 5 -> {
                        System.out.println(">>Employee List:");
                        service.printList();
                    }
                    case 6 -> {
                        System.out.println(">>Employee list exported successfully.");
                    }
                    case 7 ->
                        stop = false;
                    default ->
                        System.out.println(">>Choice invalid");
                }
            } while (stop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //--------------------------------------------------    
    public Employee getEmployee(boolean isAddNew) throws Exception {
        String id = DataInput.getString("Enter employee id:");
        String name = DataInput.getString("Enter employee name:");
        String email = DataInput.getString("Enter employee email:");
        return new Employee(id, name, email);
    }

    //--------------------------------------------------  
    public void addNewEmployee() {
        try {
            Employee newEmployee = getEmployee(true);
            service.add(newEmployee);
            System.out.println(">>Employee added successfully.");
        } catch (Exception e) {
            System.out.println(">>" + e.getMessage());
        }
    }
    //--------------------------------------------------  
    //To do here..........
}
