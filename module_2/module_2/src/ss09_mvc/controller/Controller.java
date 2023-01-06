package ss09_mvc.controller;

import ss09_mvc.service.IEmployeeService;
import ss09_mvc.service.IFacilityService;
import ss09_mvc.service.ICustomerService;
import ss09_mvc.service.impl.EmployeeService;
import ss09_mvc.service.impl.CustomerService;
import ss09_mvc.service.impl.FacilityService;

import java.util.Scanner;

public class Controller {
    private IEmployeeService  employeeService= new EmployeeService();
    private ICustomerService customerService= new CustomerService();
    private IFacilityService facilityService= new FacilityService();
    public  void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management " +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    do{
                        System.out.println(
                            "\n 1. Display list employees" +
                            "\n 2. Add new employee"+
                            "\n 3. Edit employee" +
                            "\n 4. Return main menu");
                        System.out.println("Chọn chức năng");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch(choose1){
                            case 1:
                                System.out.println("Display list employees");
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("Add new employee");
                                employeeService.add();
                                break;
                            case 3:
                                System.out.println("Edit employee");
                                employeeService.update();
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                        }
                    }while(flag);
                    break;
                case 2:
                    do{
                        System.out.println(
                                "\n 1. Display list customers" +
                                        "\n 2. Add new customers"+
                                        "\n 3. Edit customers" +
                                        "\n 4. Return main menu");
                        System.out.println("Chọn chức năng");
                        int choose2= Integer.parseInt(scanner.nextLine());
                        switch(choose2){
                            case 1:
                                System.out.println("Display list customers");
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("Add new customers");
                                customerService.add();
                                break;
                            case 3:
                                System.out.println("Edit customers");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                        }
                    }while(flag);
                    break;
                case 3:
                    do{
                    System.out.println(
                            "\n 1. Display list facility" +
                                    "\n 2. Add new facility"+
                                    "\n 3. Display list facility maintenance" +
                                    "\n 4. Return main menu");
                    System.out.println("Chọn chức năng");
                    int choose3= Integer.parseInt(scanner.nextLine());
                    switch(choose3){
                        case 1:
                            System.out.println("Display list facility");
                            facilityService.display2();
                            break;
                        case 2:
                            System.out.println("Add new facility");
                            facilityService.add2();
                            break;
                        case 3:
                            System.out.println("Display list facility maintenance");
                            facilityService.displayMaintenance();
                            break;
                        case 4:
                            System.out.println("Return main menu");
                            break;
                    }
                }while(flag);
                break;
                case 4:
                    do{
                        System.out.println(
                                "\n1. Add new booking\n" +
                                        "\n2. Display list booking\n" +
                                        "\n3. Create new constracts\n" +
                                        "\n4. Display list contracts\n" +
                                        "\n5. Edit contracts\n" +
                                        "\n6. Return main menu\n");
                        System.out.println("Chọn chức năng");
                        int choose4= Integer.parseInt(scanner.nextLine());
                        switch(choose4){
                            case 1:
                                System.out.println("Add new booking");
                                facilityService.display2();
                                break;
                            case 2:
                                System.out.println("Display list booking");
                                facilityService.add2();
                                break;
                            case 3:
                                System.out.println("Create new constracts");
                                facilityService.displayMaintenance();
                                break;
                            case 4:
                                System.out.println("Display list contracts");
                                break;
                            case 5:
                                System.out.println("Return main menu");
                                break;
                        }
                    }while(flag);

                    break;
                case 5:
                    do{
                        System.out.println(
                                "\n1. Display list customers use service\n" +
                                        "\n2. Display list customers get voucher\n" +
                                        "\n3. Return main menu\n");
                        System.out.println("Chọn chức năng");
                        int choose5= Integer.parseInt(scanner.nextLine());
                        switch(choose5){
                            case 1:
                                System.out.println("Display list customers use service");
                                facilityService.display2();
                                break;
                            case 2:
                                System.out.println("Display list customers get voucher");
                                facilityService.add2();
                                break;
                            case 3:
                                System.out.println("Return main menu");
                                facilityService.displayMaintenance();
                                break;
                        }
                    }while(flag);
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
