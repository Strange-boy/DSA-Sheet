package linked_list;

public class GetValue {
    static  class Node {
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

        // in order to get value in a linked list
        int getFirst(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }

            return head.data;
        }

        //in order to get last value in a linked list
        int getLast() {
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }

            return tail.data;
        }

        // in order to get the elment at a particular index
        int getAt(int index){
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if(index < 0 || index >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for(int idx = 0; idx < index; idx ++){
                    temp = temp.next;
                }

                return temp.data;
            }
        }
    }
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        
        System.out.println("=== Testing LinkedList Get Methods ===\n");
        
        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("getAt(0): " + list.getAt(0));
        System.out.println();
        
        // Test 2: Single element
        System.out.println("Test 2: Single Element List");
        list.addLast(10);
        list.display();
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("getAt(0): " + list.getAt(0));
        System.out.println();
        
        // Test 3: Multiple elements
        System.out.println("Test 3: Multiple Elements List");
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("getAt(0): " + list.getAt(0));
        System.out.println("getAt(2): " + list.getAt(2));
        System.out.println("getAt(4): " + list.getAt(4));
        System.out.println();
        
        // Test 4: Edge cases for getAt
        System.out.println("Test 4: Edge Cases for getAt");
        System.out.println("getAt(-1): " + list.getAt(-1));
        System.out.println("getAt(5): " + list.getAt(5)); // index >= size
        System.out.println();
        
        // Test 5: After removing elements
        System.out.println("Test 5: After Removing First Element");
        list.removeFirst();
        list.display();
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("getAt(0): " + list.getAt(0));
        System.out.println("getAt(3): " + list.getAt(3));
        System.out.println();
        
        // Test 6: Remove all elements
        System.out.println("Test 6: Remove All Elements");
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.display();
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
        System.out.println("getAt(0): " + list.getAt(0));
    }
    
    
}
