package BaiTap1;

import BaiTap1.Variables.SinhVien;
import BaiTap1.Variables.ThongTin;

public class BaiTap1 {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.showThongTin();
        thongTin();

    }
    private static void thongTin(){
        System.out.println("Năm sinh: " + ThongTin.birthday);
        System.out.println("Địa chỉ: " + ThongTin.address_work);
        System.out.println("Số Điện Thoại: " + ThongTin.phone);

    }
}