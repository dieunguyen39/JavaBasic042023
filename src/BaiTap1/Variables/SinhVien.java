package BaiTap1.Variables;

public class SinhVien {
    int age = 26;
    static String address = "Nguyễn Thành Ý, Điện Bàn, Quảng Nam";

    private String name;

    public int getAge() {
        return age;
    }
    public static String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void showThongTin() {
        setName("Nguyễn Thị Thuý Diệu");
        System.out.println("Họ và Tên:" + name);
        System.out.println("Nơi làm việc: " + getAddress());
        System.out.println("Năm sinh: " + getAge());
    }
}
