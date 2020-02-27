// netid: alittl9
// uin: 657025940
import com.sun.tools.javah.Gen;


public class GenericStack<I> extends GenericList<I>      {

    GenericStack (I data) {
        Node<I> temp = new Node(data); // call constructor from Node class to make new node
        setLength(1);
        setHead(temp);
    }

    @Override // added so that the genericStack knows what add function to use
   public void add (I data) {
        Node<I> temp = getHead(); // current head
        Node<I> newNode = new Node<I>(data);
        newNode.next = temp; // sets a pointer to the next node
        setHead(newNode); // sets newNode as the head
        setLength(getLength() + 1); // updates the length
    }

    @Override // added so that the genericStack knows what add function to use
    public I delete() {
       Node<I> tempHead = getHead();
        if (tempHead == null) {
            return null;
        } // end base case
        Node<I> tempPointer = tempHead; // holds a pointer to the head that is to be deleted
        setHead(tempHead.next); // sets the new head
        tempHead.next = null; // deletes the temphead
        setLength(getLength() - 1); // updates the length

        return tempPointer.data; // returns the data at the head of the list
    }

    public void push(I data) {
        add(data);
    }

    public I pop() {
        return delete();
    }



}
