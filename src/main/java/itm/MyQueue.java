package itm;

public class MyQueue<E> extends MyLinkedList<E> {
    public E peek(){
        return (E) this.get(0);
    }

    public E poll() {
        E result= (E) this.get(0);
        this.remove(0);
        return result;
    }
}
