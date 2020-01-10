package datastructure.chapter01;

public class MyArray {
    private int[] array;
    //有效数据的长度
    private int elements;

    public MyArray() {
        array = new int[50];
    }

    public MyArray(int maxsize) {
        array = new int[maxsize];
    }

    /**
     * 插入数据
     *
     * @param value 插入值
     */
    public void insert(int value) {
        array[elements] = value;
        elements++;
    }

    /**
     * 查找数据
     *
     * @param value 查找的值
     * @return
     */
    public int search(int value) {
        int flag = -1;
        for (int i = 0; i < elements; i++) {
            if (value == array[i]) {
                flag = i;
                break;
            }
        }
        return flag;
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
