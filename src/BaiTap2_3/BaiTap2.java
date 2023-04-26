package BaiTap2_3;

import BaiTap2_3.ToanTu.Calculator;

public class BaiTap2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int total = calculator.getTong2SoNguyen(20, 20);
        System.out.println("Tổng hai số nguyên là: " + total);
        double number = calculator.getTich2SoThuc(-3D,5D);
        System.out.println("Tích 2 số thực là: " + number);
    }
}