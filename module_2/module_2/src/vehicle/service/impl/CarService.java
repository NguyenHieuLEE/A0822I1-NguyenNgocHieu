package vehicle.service.impl;

import vehicle.model.Car;
import vehicle.service.ICarService;
import java.util.Scanner;
public class CarService implements ICarService {

    private static Car[] cars = new Car[100];

    static {
        cars[0] = new Car(123,"Mec",2022,4,"thể thao");
        cars[1] = new Car(234,"Audi",2022,4,"thể thao");
        cars[2] = new Car(345,"Toyota",2022,4,"thể thao");
    }

    @Override
    public void display() {
        // cần phải lấy dữ liệu và hiển thị ra
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println((i + 1) + "." + cars[i]);
            } else {
                break;
            }
        }
    }

    @Override
    public Car findById(int id) {
        return null;
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển kiểm xoát");
        int seaControl = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên hảng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số chỗ ngồi");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu xe");
        String type= scanner.nextLine();
        Car student = new Car(seaControl,manufacturer,year,seats,type);
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = student;
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
        for (int i = 0; i < cars.length; i++) {
            if (i == index) {
                for (int j = index; j < cars.length - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[cars.length - 1] = null;
                break;
            }
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }

//    @Override
//    public void update() {
//        display();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chọn Student muốn sửa");
//        int index = Integer.parseInt(scanner.nextLine())-1;
//        for (int i = 0; i < cars.length; i++) {
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
//                        cars[i].setName(newName);
//                        break;
//                    case 2:
//                        // sửa address
//                        System.out.println("nhập địa chỉ cần sửa");
//                        String newAddress = scanner.nextLine();
//                        cars[i].setAddress(newAddress);
//                        break;
//                    default:
//                        break;
//                }
//
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void search() {
//
//    }
}
