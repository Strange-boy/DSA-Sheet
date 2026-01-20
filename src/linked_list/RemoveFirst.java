package linked_list;

public class RemoveFirst {
    static class Node {
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        //in order to add the elements at last
        void addLast(int value) {
            //add a node
            Node temp = new Node();
            temp.data = value;
            temp.next = null;

            if(size == 0 || head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size += 1;
        }

        //in order to display the elements of the list
        void display(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        //in order to remove first in a linked list
        void removeFirst(){
            //if the list is empty
            if(head == null || size == 0){
                System.out.println("The List is empty");
                return;
            } else if(size == 1){
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size = size - 1;
            }
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        
        System.out.println("=== Testing removeFirst() method ===");
        
        // Test 1: Remove from empty list
        System.out.println("\n1. Removing from empty list:");
        list.removeFirst();
        
        // Test 2: Add elements and display
        System.out.println("\n2. Adding elements:");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.print("List after adding: ");
        list.display();
        System.out.println("Size: " + list.size);
        
        // Test 3: Remove first element
        System.out.println("\n3. Removing first element:");
        list.removeFirst();
        System.out.print("List after removeFirst: ");
        list.display();
        System.out.println("Size: " + list.size);
        System.out.println("Head data: " + (list.head != null ? list.head.data : "null"));
        System.out.println("Tail data: " + (list.tail != null ? list.tail.data : "null"));
        
        // Test 4: Remove multiple elements
        System.out.println("\n4. Removing multiple elements:");
        list.removeFirst();
        System.out.print("List after second removeFirst: ");
        list.display();
        System.out.println("Size: " + list.size);
        
        list.removeFirst();
        System.out.print("List after third removeFirst: ");
        list.display();
        System.out.println("Size: " + list.size);
        
        // Test 5: Remove last remaining element
        System.out.println("\n5. Removing last element:");
        list.removeFirst();
        System.out.print("List after removing last element: ");
        list.display();
        System.out.println("Size: " + list.size);
        System.out.println("Head: " + (list.head == null ? "null" : "not null"));
        System.out.println("Tail: " + (list.tail == null ? "null" : "not null"));
        
        // Test 6: Try removing from empty list again
        System.out.println("\n6. Removing from empty list again:");
        list.removeFirst();
    }
}
