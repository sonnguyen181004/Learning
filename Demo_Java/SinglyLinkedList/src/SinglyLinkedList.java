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

    private static class ListNode {//  Lớp ListNode là một lớp con bên trong SinglyLinkedList. Lớp này dùng để định nghĩa cấu trúc của một nút (node) trong danh sách liên kết.

        private int data;// Generic type luu tru gia tri cua nut(node)
        private ListNode next;//dùng để lưu trữ địa chỉ của nút kế tiếp trong danh sách liên kết. 
        //Nếu next là null, nghĩa là nút đó là nút cuối cùng trong danh sách.

        public ListNode(int data) {//ạn có thể truyền vào giá trị data.

            this.data = data;
            this.next = null;//Khi tạo một nút mới, nút này chưa liên kết với nút nào khác, vì vậy next được gán là null.
        }
    }

    //---------------PRINT ELEMENTS IN SINGLY LINKED LIST----------
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //---------------------------Find Length Of SINGLY LINKED LIST------
    public int length() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    //-------------------------Insert First Node--------
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    //------------Insert Last Node---------
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    //-----------Insert At Given Position-------
    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    //-------------Delete First Node
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //------------------Delete Node At Given Position---
    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;

            }
            ListNode current = previous.next;
            previous.next = current.next;

        }
    }

    //----------Delete Last Node----------
    public ListNode deleteLast() {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;//break the chain
        return current;
    }

    //------------------Revere Linked List-------------
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //---------------Get Middle Node-----------
    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    //---------getNthNode From The end
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid Value n" + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than  number of  nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;

    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        // now we connect them together
        sll.head.next = second;//10--->1
        second.next = third;//10-->1--->8
        third.next = fourth;//10--->1--->8---->11---->null;x

        sll.insertFirst(14);
        sll.insertLast(4);
        sll.insertLast(12);
        sll.insert(1, 100);

        sll.display();
        System.out.println("FInd The middle" + " " + sll.getMiddleNode().data);
        ListNode nthFromEnd=sll.getNthNodeFromEnd(2);
        System.out.println("2nd Node from End Is"+nthFromEnd.data);
        System.out.println("Delete First");
        System.out.println(sll.deleteFirst().data);

        sll.display();
        System.out.println("Delete Last");
        System.out.println(sll.deleteLast().data);
        sll.display();
        System.out.println("Delete Position");
        sll.delete(3);
        sll.display();
        System.out.println("REverse");
        sll.head = sll.reverse(sll.head);
        sll.display();
        /*
        Khi sử dụng sll.reverse(head) thay vì sll.reverse(sll.head),  gặp lỗi vì head không được định nghĩa trong phạm vi của phương thức main. 
        Trong lớp SinglyLinkedList, head là một biến thành viên , và để truy cập nó, bạn phải sử dụng sll.head.
head trong lớp SinglyLinkedList là biến thành viên, được truy cập thông qua đối tượng của lớp đó, trong trường hợp này là sll.
Nếu  chỉ gọi sll.reverse(head), Java sẽ không biết head là gì vì head không phải là một biến cục bộ (local variable) trong phương thức main.

         */

        System.out.println("Length is" + sll.length());

    }

}
