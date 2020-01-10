package datastructure.chapter01;

public class MyArrayTest {
    public static void main(String[] args) {
//        MyArray array = new MyArray(10);
//        array.insert(16);
//        array.insert(9);
//        array.insert(13);
//        array.display();
//        System.out.println(array.search(8));
//        System.out.println(array.get(0));
//
//        array.delete(2);
//        array.display();

        MyOrderArray myOrderArray=new MyOrderArray(10);
        myOrderArray.insert(5);
        myOrderArray.insert(1);
        myOrderArray.insert(2);
        myOrderArray.insert(8);
        myOrderArray.insert(9);
        myOrderArray.display();
        System.out.println(myOrderArray.search(5));
    }
}
