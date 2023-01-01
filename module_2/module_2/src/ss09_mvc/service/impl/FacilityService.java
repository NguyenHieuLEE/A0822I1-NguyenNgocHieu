package ss09_mvc.service.impl;

import ss09_mvc.model.Facility;
import ss09_mvc.service.IFacilityService;

import java.util.Scanner;

public class FacilityService implements IFacilityService{
    private static Facility[]  facilitys= new  Facility[100];

    static {
        facilitys[0] = new Facility(1, "hieu", "QN");
        facilitys[1] = new Facility(2, "hieu1", "QN");
        facilitys[2] = new Facility(3, "hieu2", "QN");
    }

    public void display2() {
        // cần phải lấy dữ liệu và hiển thị ra
        for (int i = 0; i < facilitys.length; i++) {
            if ( facilitys[i] != null) {
                System.out.println((i + 1) + "." + facilitys[i]);
            } else {
                break;
            }
        }
    }

    public  Facility findById2(int id) {
        return null;
    }

    public void add2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập address");
        String address = scanner.nextLine();
        Facility customer = new Facility(id, name, address);
        for (int i = 0; i <  facilitys.length; i++) {
            if ( facilitys[i] == null) {
                facilitys[i] = customer;
                break;
            }
        }
    }
    public void displayMaintenance() {
        // cần phải lấy dữ liệu và hiển thị ra
        for (int i = 0; i < facilitys.length; i++) {
            if ( facilitys[i] != null) {
                System.out.println((i + 1) + "." + facilitys[i]);
            } else {
                break;
            }
        }
    }
}
