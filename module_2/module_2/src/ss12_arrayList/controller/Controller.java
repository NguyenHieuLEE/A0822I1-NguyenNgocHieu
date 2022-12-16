package ss12_arrayList.controller;

import ss12_arrayList.service.IProductService;
import ss12_arrayList.service.impl.PtoductService;

import java.util.Scanner;

public class Controller {
    private IProductService productService = new PtoductService();
    public  void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Display" +
                    "\n 2. Add" +
                    "\n 3. Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    System.out.println("chức năng hiện thị");
                    productService.display();
                    break;
                case 2:
                    // code thêm mới
                    productService.add();
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    productService.delete();
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    productService.update();
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    productService.search("iphone14");
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
