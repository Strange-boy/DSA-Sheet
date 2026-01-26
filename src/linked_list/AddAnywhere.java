package linked_list;

public class AddAnywhere {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        //in order to add data to the linked list at the end
        void addLast(int value){
            //create a node
            Node temp = new Node();
            temp.data = value;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size += 1;
        }

        //in order to add at first in linked list
        void addFirst(int value){
            //you need to create a new node
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            
            if(size == 0) {
                head = tail = temp;    
            } else {
                temp.next = head;
                head = temp;
            }
            
            size++;
        }

        //helper method to display the linked list
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
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
        
        System.out.println("\nAdding elements to the beginning:");
        list.addFirst(5);
        System.out.println("After adding 5 at first:");
        list.display();
        System.out.println("Size: " + list.size);
        
        list.addFirst(2);
        System.out.println("After adding 2 at first:");
        list.display();
        System.out.println("Size: " + list.size);
        
        System.out.println("\nFinal linked list:");
        list.display();
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);
        System.out.println("Size: " + list.size);
    }
}
