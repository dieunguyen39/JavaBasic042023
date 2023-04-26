import Variables.SinhVien;
public class BaiTap1 {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        System.out.println("Họ và tên: " + sinhVien.showName());
        System.out.println("Số Tuổi: " + sinhVien.showAge());
        System.out.println("Địa chỉ: " + sinhVien.showAddress());
        sinhVien.showThongTin();

    }
}