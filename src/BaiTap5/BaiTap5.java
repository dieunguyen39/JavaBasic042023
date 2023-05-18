package BaiTap5;

import java.util.ArrayList;

public class BaiTap5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(50);

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.addAll(arrayList1);

        for (int j = 0; j < arrayList2.size(); j++) {
            System.out.println(arrayList2.get(j));
        }

        BaiTap5 bt5 = new BaiTap5();
        bt5.inThongTin();
    }

    public void inThongTin() {
        ArrayList<String> ThongTinNhanVien = new ArrayList<String>();
        ThongTinNhanVien.add("Họ và Tên: Nguyễn Thị Thuý Diệu");
        ThongTinNhanVien.add("Chức vụ: Tester");
        ThongTinNhanVien.add("Quê quán: Nguyễn Thành Ý - Quảng Nam");
        ThongTinNhanVien.add("Làm việc tại: 99B Núi Thành");

        for (int l = 0; l < ThongTinNhanVien.size(); l++) {
            System.out.println(ThongTinNhanVien.get(l));
        }
    }
}