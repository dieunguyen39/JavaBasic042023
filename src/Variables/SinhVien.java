package Variables;

public class SinhVien {
    int age = 26;
    static String address = "Nguyễn Thành Ý, Điện Bàn, Quảng Nam";
    public String showName() {
        String name = "Nguyễn Thị Thuý Diệu";
        return name;
    }
    public int showAge() {
        return age;
    }
    public String showAddress() {
        return address;
    }
    public void showThongTin() {
        String addressWork = ThongTin.address_work;
        int birthday = ThongTin.birthday;
        String phone = ThongTin.phone;
        System.out.println("Nơi làm việc: " + addressWork);
        System.out.println("Năm sinh: " + birthday);
        System.out.println("Số điện thoại: " + phone);
    }
}
