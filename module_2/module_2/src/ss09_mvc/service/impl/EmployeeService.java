package ss09_mvc.service.impl;

import ss09_mvc.model.Employee;
import ss09_mvc.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Employee[]  employees= new Employee[100];

    static {
        employees[0] = new Employee(1, "chanh", "QN");
        employees[1] = new Employee(2, "chanh1", "QN");
        employees[2] = new Employee(3, "chanh2", "QN");
    }

    @Override
    public void display() {
        // cần phải lấy dữ liệu và hiển thị ra
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println((i + 1) + "." + employees[i]);
            } else {
                break;
            }
        }
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập address");
        String address = scanner.nextLine();
        Employee student = new Employee(id, name, address);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete() {
        display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn Student muốn xoá");
        int index = Integer.parseInt(scanner.nextLine())-1;
        for (int i = 0; i < employees.length; i++) {
            if (i == index) {
                for (int j = index; j < employees.length - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[employees.length - 1] = null;
                break;
            }
        }
    }

    @Override
    public void update() {
        display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn Student muốn sửa");
        int index = Integer.parseInt(scanner.nextLine())-1;
        for (int i = 0; i < employees.length; i++) {
            if (i == index) {
                System.out.println("chọn trường cần sửa" +
                        "\n 1. name"+
                        "\n 2. address"+
                        "\n 3.back main menu");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        // sửa name
                        System.out.println("nhập tên cần sửa");
                        String newName = scanner.nextLine();
                        employees[i].setName(newName);
                        break;
                    case 2:
                        // sửa address
                        System.out.println("nhập địa chỉ cần sửa");
                        String newAddress = scanner.nextLine();
                        employees[i].setAddress(newAddress);
                        break;
                    default:
                        break;
                }

                break;
            }
        }
    }

    @Override
    public void search() {

    }
}
