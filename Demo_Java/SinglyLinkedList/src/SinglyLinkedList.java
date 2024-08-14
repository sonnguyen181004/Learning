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
        sll.insertFirst(11);
        sll.insertFirst(9);
        sll.display();
        System.out.println("Length is"+sll.length());
        
    }
    
    
}
