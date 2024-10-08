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

    //------------Insert Last Node--------------
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

    //-----------Insert At Given Position---------
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

    //-------------Delete First Node-------------------
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //------------------Delete Node At Given Position---------
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

    //----------Delete Last Node------------
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

    //---------------Get Middle Node-------------
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

    //---------getNthNode From The end------------------
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

    //--------------Find Elemetns---------------
    public boolean findElement(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
        //-------------REMOVE DUPLICATED FROM SORTED LINKED LIST----------
    }

    public void removeDuplicated() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //------------Insert In Sorted List----------------
    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;

    }

    //------------Remove A Given Key  from Sorted Linked List
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode tmp = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            tmp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        tmp.next = current.next;

    }
    // Detect A Loop

    public boolean containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    //--------Start Node In A Loop
    public ListNode startNodeInALoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return getStatingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStatingNode(ListNode slowPtr) {
        ListNode tmp = head;
        while (tmp != slowPtr) {
            tmp = tmp.next;
            slowPtr = slowPtr.next;
        }
        return tmp;//Starting Node of the Loop
    }

    // CREATE A LOOP IN LINEKED LIST
    public void createALoopInLinkedList() {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }
    //-----remove Loop

    public void removeLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        if (fastPtr == slowPtr) {
            removeLoop(slowPtr);
            return;
        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode tmp = head;
        while (tmp.next != slowPtr.next) {
            tmp = tmp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(16);
        // now we connect them together
        sll.head.next = second;//10--->1
        second.next = third;//10-->1--->8
        third.next = fourth;//10--->1--->8---->11---->nul
        sll.display();
        System.out.println("Inser Node In Sorted List");
        sll.insertInSortedList(11);
        sll.display();
        sll.deleteNode(8);
        System.out.println("Remove Key 8");
        sll.display();

        System.out.println("New List By Insert First And Last");
        sll.insertFirst(14);
        sll.insertFirst(14);
        sll.insertLast(4);
        sll.insertLast(4);
        sll.insertLast(12);
        sll.insertLast(12);
        sll.insert(1, 100);
        sll.display();
        System.out.println("REMOVE DUPLICATED");
        sll.removeDuplicated();
        sll.display();
        System.out.println("FInd The middle" + " " + sll.getMiddleNode().data);
        ListNode nthFromEnd = sll.getNthNodeFromEnd(2);
        System.out.println("2nd Node from End Is" + nthFromEnd.data);
        System.out.println("Search Key 1:");
        if (sll.findElement(sll.head, 1)) {
            System.out.println("Search Key Found");
        } else {
            System.out.println("Search Key not FOund");
        }
        System.out.println("Delete First");
        System.out.println(sll.deleteFirst().data);

        sll.display();
        System.out.println("Delete Last");
        System.out.println(sll.deleteLast().data);
        sll.display();
        System.out.println("Delete Position 3:");
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
        System.out.println("LinKedList with Loop");
        sll.createALoopInLinkedList();

        System.out.println(sll.containsLoop());
        System.out.println("The Start Of The Loop Is" + " " + sll.startNodeInALoop().data);
        System.out.println("RemoveLoop ");
        sll.removeLoop();
        sll.display();

        System.out.println("Length is" + sll.length());

    }

}
