// netid: alittl9
// uin: 657025940

public class GenericQueue<I> extends GenericList<I> {

    GenericQueue (I data) {
        Node<I> temp = new Node(data); // call constructor from Node class to make new node
        setLength(1);
        setHead(temp);
    }

    @Override // added so that the genericStack knows what add function to use
    public void add (I data) {

        Node<I> temp = getHead(); // current head
        if (getHead() == null) {
            return;
        }
        while ( temp != null) {
          temp = temp.next;
        }
        Node<I> theTail = temp; // this is the tail node
        Node<I> newNode = new Node<I>(data);
        theTail.next = newNode;
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
        tempHead.next = null; // deletes the tempHead
        setLength(getLength() - 1); // updates the length

        return tempPointer.data; // returns the data at the head of the list
    }

    public void enqueue(I data) {
        add(data);
    }

    public I dequeue() {
        return delete();
    }
}
