/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
//--------------------TRIEN KHAI 1 Doubly Linked List----------------
public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {

        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }

        
        }
    public DoublyLinkedList(){
    this.head=null;
    this.tail=null;
    this.length=0;
    }
    public boolean isEmpty(){
    return length==0;
    }
    public int length(){
    return length;
    }
    }

