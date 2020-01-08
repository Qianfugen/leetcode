package datastructure.chapter01;

public class ArrayTest {
    //声明整型数组
    private int[] array;
    //元素个数
    private int elements;

    /**
     * 缺省构造方法
     */
    public ArrayTest() {
        array = new int[50];
    }

    /**
     * 有参构造方法
     *
     * @param size
     */
    public ArrayTest(int size) {
        array = new int[size];
    }

    /**
     * 有序插入
     *
     * @param value
     */
    public void insert(int value) {
        int i = 0;
        //找到第一个大于插入值的数的下标
        for (; i < elements; i++) {
            if (array[i] > value) {
                break;
            }
        }
        //从尾部开始，数组元素往后挪一位
        for (int j = elements; j > i; j--) {
            array[j] = array[j - 1];
        }
        //插入值
        array[i] = value;
        //数组元素+1
        elements++;
    }

    /**
     * 删除元素
     *
     * @param index
     */
    public void delete(int index) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < elements; i++) {
                array[i] = array[i + 1];
            }
            elements--;
        }
    }

    /**
     * 获取元素
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index >= elements) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    /**
     * 二分法查元素下标
     *
     * @param value
     * @return
     */
    public int search(int value) {
        int low = 0;
        int middle = 0;
        int pow = elements;

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
     * 打印数组
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < elements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        ArrayTest array = new ArrayTest();
        array.insert(3);
        array.insert(1);
        array.insert(0);
        array.insert(2);
        array.insert(4);
        array.display();
        array.delete(1);
        array.display();
        System.out.println(array.get(1));
        System.out.println(array.search(5));
    }
}
