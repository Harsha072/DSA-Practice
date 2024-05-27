package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;

    public  void printList(){
        Node curr = this.head;
        while (curr.next!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public  Node traverseList(int index){
        System.out.println("calling traverse "+index);
        Node curr = this.head;

        int count = 0;
        while (curr != null && count <index){
            curr = curr.next;
            count ++;
        }
        return curr;
    }
    public  void insertNode(int index, int value){
        Node newNode = new Node(value);
        if(index ==0){
            newNode.next = this.head;
           head = newNode;
        }
else {
    Node previousNode = this.traverseList(index-1);
            Node nextNode = previousNode.next;

            previousNode.next = newNode;
            newNode.next = nextNode;
        }

    }
    public void removeNode(int index) {
        if (index == 0) {
            // Remove the head node
            Node nodeToDelete = this.head;
            if (nodeToDelete != null) {
                this.head = nodeToDelete.next;
                nodeToDelete.next = null;
            }
        } else {
            // Remove non-head node
            Node previousNode = this.traverseList(index - 1);
            if (previousNode != null && previousNode.next != null) {
                Node nodeToDelete = previousNode.next;
                previousNode.next = nodeToDelete.next;
                nodeToDelete.next = null;
            }
        }
    }

    public void reverseList(){
        if(this.head==null || head.next ==null){
            return;
        }
        //pending
        Node first = this.head;
        Node second = first.next;
        while(second!=null){
            Node temp =  second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head.next = null;
        head = first;
    }

}

public class List {
    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        LinkedList l = new LinkedList();
        l.head = n1;
        l.printList();
        System.out.println("Insert 56 at 3");
        l.insertNode(3,56);

        l.printList();
        l.removeNode(0);
        System.out.println("after remove");
        l.printList();
        System.out.println("after reverser");
        l.reverseList();
        l.printList();

    }

 

}
