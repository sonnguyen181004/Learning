/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
// Cach trien khai mot danh sach don lien ket don trong java
public class SinglyLinkedList {// tạo ra danh sách liên kết đơn.
    private ListNode head;// là một đối tượng của lớp ListNode, dùng để lưu trữ nút đầu tiên trong danh sách liên kết.
    private static class ListNode{//  Lớp ListNode là một lớp con bên trong SinglyLinkedList. Lớp này dùng để định nghĩa cấu trúc của một nút (node) trong danh sách liên kết.
    private int data;// Generic type luu tru gia tri cua nut(node)
    private ListNode next;//dùng để lưu trữ địa chỉ của nút kế tiếp trong danh sách liên kết. 
    //Nếu next là null, nghĩa là nút đó là nút cuối cùng trong danh sách.
    public ListNode(int data){//ạn có thể truyền vào giá trị data.

    this.data=data;
    this.next=null;//Khi tạo một nút mới, nút này chưa liên kết với nút nào khác, vì vậy next được gán là null.
    }
    }
    
    //---------------PRINT ELEMENTS IN SINGLY LINKED LIST----------
    public void display(){
     ListNode current=head;
     while(current!=null){
         System.out.print(current.data+"-->");
         current=current.next;
     }
        System.out.println("null");
    }
    //---------------------------Find Length Of SINGLY LINKED LIST------
    public int length(){
    int count=0;
    ListNode current=head;
    while(current!=null){
        count++;
        current=current.next;
            
    }
    return count;
    }
    //-------------------------Insert First Node--------
    public void insertFirst(int value){
    ListNode newNode=new ListNode(value);
    newNode.next=head;
    head=newNode;
    
    }
    //------------Insert Last Node---------
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
        head=newNode;
        return;
        }
        ListNode current=head;
        while(null!=current.next){
        current=current.next;
    }
        current.next=newNode;
    }
    //-----------Insert At Given Position-------
    public void insert(int position,int value){
    ListNode node=new ListNode(value);
    if(position==1){
     node.next=head;
     head=node;
    }
    else{
        ListNode previous=head;
        int count=1;
        while(count<position-1){
         previous=previous.next;
         count++;
        }
        ListNode current=previous.next;
        previous.next=node;
        node.next=current;
    }
    }
    //-------------Delete First Node
    public ListNode deleteFirst(){
    if(head==null){
    return null;
    }
    ListNode temp=head;
    head=head.next;
    temp.next=null;
    return temp;
    }
    //------------------Delete Node At Given Position---
    public void delete(int position){
    if(position==1){
    head=head.next;
    }
    else{
       ListNode previous=head;
       int count=1;
       while(count<position-1){
       previous=previous.next;
       count++;
       
       }
       ListNode current=previous.next;
       previous.next=current.next;
       
    }
    }
    
    
    
    
    //----------Delete Last Node----------
    public ListNode deleteLast(){
    if(head==null&&head.next==null){
    return head;
    }
    ListNode current=head;
    ListNode previous=null;
    while(current.next!=null){
     previous=current;
     current=current.next;
    }
    previous.next=null;//break the chain
    return current;
    }
    //-------------------------
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth =new ListNode(11);
        // now we connect them together
        sll.head.next=second;//10--->1
        second.next=third;//10-->1--->8
        third.next=fourth;//10--->1--->8---->11---->null;x
        sll.insertFirst(14);
        sll.insertLast(4);
        sll.insertLast(12);
        sll.insert(1,100);
        sll.display();
        System.out.println("Delete First");
        System.out.println(sll.deleteFirst().data);
        
        sll.display();
        System.out.println("Delete Last");
        System.out.println(sll.deleteLast().data);
        sll.display();
        System.out.println("Delete Position");
        sll.delete(3);
        sll.display();
        
        System.out.println("Length is"+sll.length());
        
    }
    
    
}
