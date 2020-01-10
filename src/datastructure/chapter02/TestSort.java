package datastructure.chapter02;

public class TestSort {
    public static void display(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = -3;
        display(arr);
        InsertSort.sort(arr);
        display(arr);
    }
}
