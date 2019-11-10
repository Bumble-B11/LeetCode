package data;

/**
 * Created by bumblebee on 2019/11/10.
 */
public class ComplexListNode {

    public int val;
    public ComplexListNode next;
    public ComplexListNode random;

    public ComplexListNode() {}

    public ComplexListNode(int _val,ComplexListNode _next, ComplexListNode _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
