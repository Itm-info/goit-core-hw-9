package itm;

public class MyStack <E> extends MyLinkedList <E>{
    public void push(Object value) { add((E) value); }

    public E peek() {
        return (E) this.get(this.size()-1);
    }

    public E pop() {
        E result= (E) this.get(this.size()-1);
        this.remove(this.size()-1);
        return result;
    }
}
