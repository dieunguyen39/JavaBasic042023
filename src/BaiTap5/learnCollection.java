package BaiTap5;

import java.util.ArrayList;

public class learnCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Java");
        arrayList.add("Selenium");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> arrayList1 = new ArrayList<String>();

        arrayList.addAll(arrayList);
        arrayList1.add("Android");
        arrayList1.add("iOS");

        for (int j = 0; j < arrayList1.size(); j++) {
            System.out.println(arrayList1.get(j));
        }
    }
}
