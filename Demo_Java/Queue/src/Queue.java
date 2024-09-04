/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public Queue(){
    this.front=null;
    this.rear=null;
    this.length=0;
    }
    public class ListNode{
    private int data;
    private ListNode next;
    
    public ListNode(int data){
    this.data=data;
    this.next=null;
    }
    }
    public int length(){
    return length;}
    public boolean isEmpty(){
    return length== 0;
    }
    public void enqueue(int data){
    ListNode tmp= new ListNode(data);
    if(isEmpty()){
    front=tmp;
    }else{
    rear.next=tmp;
    }
    rear=tmp;
    length++;
    }
    public void print(){
    if(isEmpty()){
    return;
    }
    ListNode current=front;
    while(current!=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Queue queue =new Queue();
        queue.enqueue(10);
        queue.enqueue(40);
        queue.print();
    }
}
