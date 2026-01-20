package linked_list;

public class DisplayLinkedList {
    static class Node {
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        //in order to add the elements at last
        void addLast(int value){
            //create a node
            Node temp = new Node();
            temp.data = value;
            temp.next = null;

            //first node
            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size += 1;
        }

        //logic to display the elements in the linked list
        void display() {
            if(head == null) {
                System.out.println("List is empty");
                return;
            }

            StringBuilder sb = new StringBuilder();
            Node temp = head;
            while(temp != null) {
                sb.append(temp.data);

                if(temp.next != null) sb.append("->");
                temp = temp.next;
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args){
        //create a new linked list
        LinkedList list = new LinkedList();

        System.out.println("Initial linked list:");
        list.display(); // should show null

        System.out.println("\nAdding elements to the end:");
        list.addLast(10);
        System.out.println("After adding 10:");
        list.display();
        System.out.println("Size: " + list.size);

        list.addLast(20);
        System.out.println("After adding 20:");
        list.display();
        System.out.println("Size: " + list.size);

        list.addLast(30);
        System.out.println("After adding 30:");
        list.display();
        System.out.println("Size: " + list.size);

        list.addLast(40);
        System.out.println("After adding 40:");
        list.display();
        System.out.println("Size: " + list.size);

        System.out.println("\nFinal linked list:");
        list.display();
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);
        System.out.println("Size: " + list.size);
    }
}
