package datastructure.chapter03;

public class MyQueue {
    //底层使用数组
    private long[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int front;
    //队尾
    private int end;

    /**
     * 缺省构造方法
     */
    public MyQueue() {
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 有参构造方法
     */
    public MyQueue(int maxsize) {
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }

    /**
     * 添加数据，从队尾插入
     */
    public void insert(long value) {
        if (end == arr.length - 1) {
            end = -1;
        }
        arr[++end] = value;
        elements++;
    }

    /**
     * 删除数据，从队首删除数据
     */
    public long remove() {
        long value = arr[front++];
        if (front == arr.length) {
            front = 0;
        }
        elements--;
        return value;
    }

    /**
     * 查看数据,从队首查看
     */
    public long peek() {
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return elements == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull() {
        return elements == arr.length;
    }
}
