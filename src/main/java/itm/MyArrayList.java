package itm;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] MyArray;
    public MyArrayList() {
        MyArray = new Object[0];
    }
    public Object[] getMyArray() { return MyArray;}
    public void add(Object value) {
        Object[] newArray = Arrays.copyOf(MyArray, MyArray.length+1);
        newArray[MyArray.length] = value;
        MyArray = newArray;
    }

    public void remove(int index) {
        MyArrayList<E> newMyArrayList = new MyArrayList<E>();
        for(int i=0;i<MyArray.length;++i) {
                if(i!=index) { newMyArrayList.add(MyArray[i]); }
            }
        MyArray = newMyArrayList.getMyArray();
    }

    public void clear() {
        Object[] MyArray = new Object[]{};
    }

    public int size() {
        return MyArray.length;
    }

    public E get(int index) {
        if (index>MyArray.length) return null;
        return (E) MyArray[index];
    }
}
