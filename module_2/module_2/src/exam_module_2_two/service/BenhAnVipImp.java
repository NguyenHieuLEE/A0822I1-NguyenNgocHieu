package exam_module_2_two.service;


import exam_module_2_two.model.SPNhapKhau;
import exam_module_2_two.model.SPXuatKhau;
import exam_module_2_two.write_file.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SPXuatKhauImp implements ServiceInterface {
    public static final String DATA_DATA_NK = "/Users/a12345/A0822I1-NguyenNgocHieu/module_2/module_2/src/exam_module_2_two/data/dataq.csv";
    List<SPXuatKhau> xuatKhauList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập id sản phầm : ");
        String idSP = scanner.nextLine();
        System.out.println("Nhập mã sản phẩm : ");
        String maSP = scanner.nextLine();
        System.out.println("Nhập ten sản phẩm : ");
        String tenSP = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm : ");
        double giaSP = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng sản phẩm : ");
        int soLuongSP = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà Sản xuất : ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập giá xuất khẩu : ");
        double giaXuatKhau = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quốc gia nhập khẩu : ");
        String quocGiaNhapSP = scanner.nextLine();
        SPXuatKhau spXuatKhau = new SPXuatKhau(idSP, tenSP, maSP, giaSP, soLuongSP, nhaSanXuat, giaXuatKhau, quocGiaNhapSP);
        xuatKhauList.add(spXuatKhau);
        WriteFile.writer(DATA_DATA_NK, xuatKhauList, false);

    }

    public boolean remove(SPXuatKhau maSP) {
        return this.xuatKhauList.remove(maSP);
    }

    @Override
    public void display() {
        WriteFile.read(DATA_DATA_NK);

//        for (SPXuatKhau spXuatKhau : xuatKhauList
//        ) {
//            System.out.println(spXuatKhau);
//        }
        }

    @Override
    public void search(String name) {
        boolean isFlag = false;
        for (SPXuatKhau spXuatKhau : xuatKhauList
        ) {
            if (spXuatKhau.getMaSP().contains(name)) {
                System.out.println(spXuatKhau);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println(" Không tìm thấy sp này ");
        }

    }
}
