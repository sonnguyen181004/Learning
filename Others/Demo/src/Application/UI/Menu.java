package Application.UI;

import Application.Utilities.DataInput;
import BussinessLayer.Service.IService;
import java.util.Arrays;

/**
 *
 * @author SwordLake
 */
public class Menu {

    public static void print(String str) {
        var menuList = Arrays.asList(str.split("\\|"));
        menuList.forEach(menuItem -> {
            if (menuItem.equalsIgnoreCase("Select")) {
                System.out.print(menuItem);
            } else {
                System.out.println(menuItem);
            }

        });
    }

    public static int getUserChoice() {
        int number = 0;
        try {
            number = DataInput.getIntegerNumber();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    public static void manageEmployee(IService service) {
        EmployeeMenu empMenu = new EmployeeMenu(service);
        empMenu.processMenuForEmployee();
    }

    public static void manageCustomer(IService service) {
        CustomerMenu cusMenu = new CustomerMenu(service);
        cusMenu.processMenuForCustomer();
    }
}
