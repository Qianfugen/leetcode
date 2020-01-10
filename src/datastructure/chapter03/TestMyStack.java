package datastructure.chapter03;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack ms=new MyStack(4);
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());

        System.out.println(ms.peek());
        System.out.println(ms.peek());

        while (!ms.isEmpty()){
            System.out.print(ms.pop()+",");
        }
    }
}
