// netid: alittl9
// uin: 657025940
 import java.util.ArrayList;
 import java.util.Iterator;

// only has one abstract method
public abstract class GenericList<I> implements CreateIterator<I>, Iterable<I> {

  private  Node<I> head; // head of the list, private so user doesn't see it
  private int length; // length of the list, privaate so the user doesn't see it

  public void print() {
    if (head == null) {
      System.out.println("The list is empty!");
      return;
    }
    else {
      Node temp = head;
      while (temp!= null) {
        System.out.println(temp.data);
      }
      temp = temp.next;
    }
  }

  abstract void add (I data); // no implementation since it's abstract

  public I delete () {
    I theValue = head.data;
    if (head == null) {
      System.out.println("The list is empty!");
    }
      head = head.next;
      length = length - 1;

     return theValue; // returns the value at the heada
  } // returns the first value of the list and deletes the node. Returns null if empty

  public ArrayList<I> dumpList () {
      ArrayList<I> theArray = new ArrayList<I>(length); // creates an array list
      while (head != null) {
        theArray.add(head.data); // add will return I
        delete(); // deletes the first item linked list
      }
  return theArray;

  } // stores and returns all values that are currently in the list into an ArrayList{

  public Iterator<I> createIterator() {
    // Iterator<I> theIterator = new GLIterator<I>(getHead());
    return new GLIterator<I>(head);
  }

  public Iterator<I> iterator() {
  //  GLIterator<I> theIterator = new GLIterator<I>(getHead());
    return new GLIterator<I>(head);
  }

  public int getLength() {
    return length;
  }; // end getLength

  public int setLength(int newLength) {
    return length = newLength;
  } // end set length

  public Node<I> getHead() {
    return head;
  }; // end getHead

  public void setHead(Node<I> newHead) {
    head = newHead;
  } // end setHead

  public class Node<T> { // inner generic class encapusaltes a linked list
    T data;
    Node<T> next;

    Node(T newData) {
      this.data = newData;
      this.next = null;
    }

  } // end Node<T>

}


// T (no angular brackets <>) is for variables
// <T> (with angular brackets <>) is for classes or functions
// vector int or vector <int>
// int var or <int> var