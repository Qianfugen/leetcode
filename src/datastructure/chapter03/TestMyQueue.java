package datastructure.chapter03;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
        mq.insert(3);
        mq.insert(1);
        mq.insert(2);
        mq.insert(9);
        System.out.println(mq.isEmpty());
        System.out.println(mq.isFull());

        System.out.println(mq.peek());
        System.out.println(mq.peek());

        while (!mq.isEmpty()){
            System.out.print(mq.remove()+" ");
        }
    }

}
