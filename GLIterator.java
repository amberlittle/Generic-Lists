// netid: alittl9
// uin: 657025940

import java.util.Iterator;

public class GLIterator<I> implements Iterator<I> {

    GenericList<I>.Node<I> listHead;

    public GLIterator(GenericList<I>.Node<I> Head) { // constructor for GLIterator
        super(); // calls the constructor of the super class
        listHead = Head;
    }

    @Override // added so that the genericStack knows what add function to use
    public boolean hasNext() { // checks if there is/isn't something next in the list
     if (listHead == null) {
        return false;
     }
    return true;
    }

    @Override // added so that the genericStack knows what add function to use
    public I next() { // travels through the list and returns the next element
        if (listHead == null) {
            return null;
        }
        I data = listHead.data;
        listHead = listHead.next;
        return data;
    }

}
