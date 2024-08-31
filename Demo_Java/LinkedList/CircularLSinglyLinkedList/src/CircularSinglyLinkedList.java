/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {

        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularSinlyLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(12);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int data) {
        ListNode tmp = new ListNode(data);
        if (last == null) {
            last = tmp;
        } else {
            tmp.next = last.next;
        }
        last.next = tmp;
        length++;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.insertFirst(10);
        cll.insertFirst(4);
        cll.insertFirst(5);
        cll.display();
    }

}
