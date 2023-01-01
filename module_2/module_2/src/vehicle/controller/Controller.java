package vehicle.controller;

import vehicle.service.ICarService;
import vehicle.service.impl.CarService;

import java.util.Scanner;

public class Controller {
    private ICarService carService = new CarService();
    public  void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n  1. Thêm mới phương tiện." +
                    "\n  2. Hiện thị phương tiện" +
                    "\n  3. Xóa phương tiện" +
                    "\n  4. Tìm kiếm theo biển kiểm soát" +
                    "\n  5. Thoát");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Thêm mới phương tiện");
                        System.out.println("Chọn xe bạn muốn thêm " +
                                "\n  1. Thêm xe tải" +
                                "\n  2. Thêm ôtô" +
                                "\n  3. Thêm xe máy");
                            int choose1 = Integer.parseInt(scanner.nextLine());

                        switch (choose1) {
                            case 1:
                                System.out.println("Thêm xe tải");

                            case 2:
                                System.out.println("Thêm ô tô");
                                carService.add();
                                break;
                            case 3:
                                System.out.println("Thêm xe máy");
                            default:
                                flag=false;
                        }
                    break;
                case 2:
                    System.out.println("chức năng hiện thị");
                    carService.display();
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
