package ss09_mvc.service.impl;
import ss09_mvc.model.Customer;
import ss09_mvc.service.ICustomerService;
import ss09_mvc.util.ReadAndWrite;
import ss9_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class CustomerService  implements ICustomerService {
    private final String CUSTOMER_FILE = "/Users/a12345/A0822I1-NguyenNgocHieu/module_2/module_2/src/ss09_mvc/data/student.csv";

    @Override
    public void display() {
        // cần phải lấy dữ liệu và hiển thị ra
        List<Customer> customerList = ReadAndWrite.readCustomerFromCSV(CUSTOMER_FILE);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i+1) + "." + customerList.get(i));
        }
    }public Customer findById1(int id) {
        return null;
    }

    public void add() {
        List<Customer> customerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập address");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, address);
        customerList.add(customer);
        // ghi file csv
        // ghi tiếp
        ReadAndWrite.writeCustomerListToCSV(CUSTOMER_FILE, customerList, true);

    }
//    public void edit() {
//        display1();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chọn Student muốn sửa");
//        int index = Integer.parseInt(scanner.nextLine())-1;
//        for (int i = 0; i < custumers.length; i++) {
//            if (i == index) {
//                System.out.println("chọn trường cần sửa" +
//                        "\n 1. name"+
//                        "\n 2. address"+
//                        "\n 3.back main menu");
//                int choose = Integer.parseInt(scanner.nextLine());
//                switch (choose){
//                    case 1:
//                        // sửa name
//                        System.out.println("nhập tên cần sửa");
//                        String newName = scanner.nextLine();
//                        custumers[i].setName(newName);
//                        break;
//                    case 2:
//                        // sửa address
//                        System.out.println("nhập địa chỉ cần sửa");
//                        String newAddress = scanner.nextLine();
//                        custumers[i].setAddress(newAddress);
//                        break;
//                    default:
//                        break;
//                }
//
//                break;
//            }
//        }
//    }
       public void create( Customer customer) {

       }

}
