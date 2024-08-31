
import java.util.EmptyStackException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class Stack {

    private ListNode top;
    private int length;

    public class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode tmp = new ListNode(data);
        tmp.next = top;
        top = tmp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;

    }

    public int peek() {
        return top.data;

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
