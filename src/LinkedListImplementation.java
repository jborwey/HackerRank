//import javax.xml.soap.Node;
//
///**
// * Created by jb039k on 10/6/2016.
// */
//public class LinkedListImplementation {
//    // reference to the head node
//    private Node head;
//    private int listCount;
//
//    // Linkedlist constructor
//    public LinkedListImplementation() {
//        // this is an empty list, so the reference to the head node
//        // is set to a new node with no data
//        head = new Node(null);
//        listCount = 0;
//    }
//
//    public void add(Object data)
//    // appends the specified element to the end of this list
//    {
//        Node linkedListTemp = new Node(data);
//        Node linkedListCurrent = head;
//        // starting at the head node, crawl to the end of the list
//        while(linkedListCurrent.getNext() != null){
//            linkedListCurrent = linkedListCurrent.getNext();
//        }
//        // the last node's "next" reference set to our new node
//        linkedListCurrent.setNext(linkedListTemp);
//        listCount++; // increment the number of elements variable
//    }
//}
