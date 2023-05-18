package BaiTap4;

public class Array {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //System.out.println("min " + min + " vị trí " + arr[i]);
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    static void max (int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[] = {33, 3, 4, 5};
        min(a);
        max(a);
    }
}
