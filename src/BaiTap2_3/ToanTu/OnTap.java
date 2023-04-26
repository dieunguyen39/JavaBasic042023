package BaiTap2_3.ToanTu;

public class OnTap {
    public int diemToan = 9;

    public int diemVan = 7;

    public int diemAnh = 10;

    private int number = 100;

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(int diemVan) {
        this.diemVan = diemVan;
    }

    public int getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(int diemAnh) {
        this.diemAnh = diemAnh;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void quanHe() {
        if (diemToan > 8)
            System.out.println("Diệu học giỏi môn Toán");
        if (diemVan < 8)
            System.out.println("Diệu học kém môn Văn");
        if (diemAnh == 10)
            System.out.println("Diệu học xuất sắc môn Anh");
    }

    public void logic() {
        if (diemToan >= 9 && diemVan >= 7 && diemAnh > 9)
            System.out.println("Diêu học giỏi toàn diện 3 môn");
        if (diemToan > 8 || diemVan > 7)
            System.out.println("Diệu học giỏi 1 trong 2 môn");

    }

    public void showNumber(int n) {
        if (n == number)
            System.out.println("Số n là 100");
        else if (n < number)
            System.out.println("Số n bé hơn 100");
        else System.out.println("Số n lớn hơn 100");
    }
}