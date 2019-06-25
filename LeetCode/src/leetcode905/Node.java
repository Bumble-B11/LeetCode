package leetcode905;

/**
 * Created by bumblebee on 2019/1/27.
 */
public class Node {
    private Node next;
    private int data;

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {

        return next;
    }

    public int getData() {
        return data;
    }
}
