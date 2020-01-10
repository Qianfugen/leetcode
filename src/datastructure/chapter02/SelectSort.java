package datastructure.chapter02;

/**
 * 选择排序
 */

public class SelectSort {
    public static void sort(int[] arr) {
        //最小数的下标
        int k = 0;
        //交换中间值
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            k = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
