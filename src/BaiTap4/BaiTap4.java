package BaiTap4;

public class BaiTap4 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                System.out.println(i);
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            System.out.println(arr[j]);
        }
    }
}
