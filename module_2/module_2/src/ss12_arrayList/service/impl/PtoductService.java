package ss12_arrayList.service.impl;

import ss12_arrayList.model.Product;
import ss12_arrayList.service.IProductService;

import java.util.Scanner;

public class PtoductService implements IProductService {
    private static Product[] products = new Product[100];

    static {
        products[0] = new Product(1, "iphone14", 1000);
        products[1] = new Product(2, "iphone14promax", 1500);
        products[2] = new Product(3, "iphone14promax", 1200);
    }

    @Override
    public void display() {
        // cần phải lấy dữ liệu và hiển thị ra
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println((i + 1) + "." + products[i]);
            } else {
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
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
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
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
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int j = index; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null;
                break;
            }
        }
    }

    @Override
    public void update() {
        display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn Product muốn sửa");
        int index = Integer.parseInt(scanner.nextLine())-1;
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                System.out.println("chọn trường cần sửa" +
                        "\n 1. name"+
                        "\n 2. Price"+
                        "\n 3.back main menu");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        // sửa name
                        System.out.println("nhập tên cần sửa");
                        String newName = scanner.nextLine();
                        products[i].setName(newName);
                        break;
                    case 2:
                        // sửa address
                        System.out.println("nhập địa chỉ cần sửa");
                        int newPrice = Integer.parseInt(scanner.nextLine());;
                        products[i].setPrice(newPrice);
                        break;
                    default:
                        break;
                }

                break;
            }
        }
    }

    public void search(String name) {
        display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên product cần tìm");
        String name1 = scanner.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(name1)) {
                System.out.println(products[i])
                ;
            }
        }

    }
}
