package baitap1;

import thuchanh1.MyList;

public class MyListTest {
    public static void main(String[] args) {
        thuchanh1.MyList<Integer> listInterger = new MyList<>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("............");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println("..................");
        System.out.println(listInterger.get(3));
        System.out.println(".....................");
    }
}
