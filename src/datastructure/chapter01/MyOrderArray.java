package datastructure.chapter01;

public class MyOrderArray {
    private int[] array;
    //有效数据的长度
    private int elements;

    public MyOrderArray() {
        array = new int[50];
    }

    public MyOrderArray(int maxsize) {
        array = new int[maxsize];
    }

    /**
     * 插入数据
     *
     * @param value 插入值
     */
    public void insert(int value) {
        int i = 0;
        for (; i < elements; i++) {
            if (array[i] > value) {
                break;
            }
        }

        for (int j = elements; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = value;
        elements++;
    }

    /**
     * 二分法查找数据
     *
     * @param value 查找的值
     * @return
     */
    public int search(int value) {
        int low = 0;
        int pow = elements;
        int middle = 0;

        while (true) {
            middle = (low + pow) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (low > pow) {
                return -1;
            } else {
                if (value < array[middle]) {
                    pow = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
    }

    /**
     * 获取数据
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index > elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException("越界了...");
        } else {
            return array[index];
        }
    }

    /**
     * 删除数据
     *
     * @param index
     */
    public void delete(int index) {
        if (index > elements || index < 0) {
            throw new ArrayIndexOutOfBoundsException("越界了...");
        } else {
            for (int i = index; i < elements; i++) {
                array[i] = array[i + 1];
            }
            elements--;
        }
    }


    /**
     * 显示数据
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
