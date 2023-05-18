package BaiTap4;

import java.util.Scanner;

public class SwitchCase {

    static void quarterByMonth(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Tháng " + month + " là quý 1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Tháng " + month + " là quý 2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Tháng " + month + " là quý 3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Tháng " + month + " là quý 4");
                break;
            default:
                System.out.println("Tháng không tồn tại");
                break;
        }
    }

    public static void main(String[] args) {
        quarterByMonth(6);
    }
}
