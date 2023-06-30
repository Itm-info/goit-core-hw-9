package itm;

public class MyLinkedList<E> {
    public Node<E> last;
    public MyLinkedList() {
    }
    public static class Node<E> {
        Node<E> previous;
        Node<E> next;
        E value;
        public Node(Node<E> previous, Node<E> next, E value) {
            this.value= value;
            this.previous=previous;
            this.next=next;
        }
    }
    public void add(E value) {
        Node<E> newNode = new Node<E>(last, null, value);
        if (last == null) {
            last = newNode;
        }
        else {
            newNode.previous = last;
            last.next = newNode;
            this.last = newNode;
        }
    }

    public void remove(int index) {
        Node<E> seek=last;
        while(seek.previous != null) {
            seek = seek.previous;
        }

        int i=0;
        while(seek!=null) {
            if(i++==index) {
                if(seek.next!=null) { seek.next.previous = seek.previous; }
                if(seek.previous!=null) { seek.previous.next = seek.next; }
                if(seek==last) { last = seek.previous; }
                seek.previous=null;
                seek.next=null;
            }
            seek=seek.next;
        }
    }
    public void clear() {
        Node<E> seek=last;
        seek.value=null;
        while(seek.previous!=null) {
            seek=seek.previous;
            seek.value=null;
            seek.next=null;
        }
    }
    public int size() {
        if (last == null) return 0;
        Node<E> seek=last;
        int result=1;
        while(seek.previous != null) {
            seek = seek.previous;
            ++result;
        }
        return result;
    }

    public E get(int index) {
        if (last == null) return null;
        Node<E> seek=last;
        while(seek.previous != null) {
            seek = seek.previous;
        }
        for(int i=0;i<index;++i) {
            seek=seek.next;
        }
        return (E) seek.value;
    }
}
