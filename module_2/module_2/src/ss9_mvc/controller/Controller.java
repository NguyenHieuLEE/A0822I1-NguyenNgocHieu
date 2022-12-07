package ss9_mvc.controller;

import ss9_mvc.service.IEmployeeService;
import ss9_mvc.service.IFacilityService;
import ss9_mvc.service.ICustomerService;
import ss9_mvc.service.impl.EmployeeService;
import ss9_mvc.service.impl.CustomerService;
import ss9_mvc.service.impl.FacilityService;

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
                                customerService.display1();
                                break;
                            case 2:
                                System.out.println("Add new customers");
                                customerService.add1();
                                break;
                            case 3:
                                System.out.println("Edit customers");
                                customerService.edit();
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                        }
                    }while(flag);
                    break;
//                case 3:
//                    do{
//                    System.out.println(
//                            "\n 1. Display list facility" +
//                                    "\n 2. Add new facility"+
//                                    "\n 3. Display list facility maintenance" +
//                                    "\n 4. Return main menu");
//                    System.out.println("Chọn chức năng");
//                    int choose3= Integer.parseInt(scanner.nextLine());
//                    switch(choose3){
//                        case 1:
//                            System.out.println("Display list facility");
//                            facilityService.display2();
//                            break;
//                        case 2:
//                            System.out.println("Add new facility");
//                            facilityService.add2();
//                            break;
//                        case 3:
//                            System.out.println("Display list facility maintenance");
//                            facilityService.edit2();
//                            break;
//                        case 4:
//                            System.out.println("Return main menu");
//                            break;
//                    }
//                }while(flag);
//                break;
                case 4:
                    System.out.println("Booking Management");

                    break;
                case 5:
                    System.out.println("Promotion Management");
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
