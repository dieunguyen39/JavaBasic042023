package BaiTap4;

public class Draft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int[] newArray = new int[50];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Số chẵn là: " + array[i]);
                newArray[count] = array[i];
                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println(newArray[i]);
        }

    }
}