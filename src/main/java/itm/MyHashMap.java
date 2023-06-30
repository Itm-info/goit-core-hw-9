package itm;

public class MyHashMap <K,V> {
    public Node<K,V> first;

    public MyHashMap() {
    }
    public class Node<K,V> {
        public Node<K,V> next;
        K key;
        V value;
        public int hash;
        public Node(Node<K,V> next, K key, V value) {
            this.next  = next;
            this.key   = key;
            this.value = value;
            this.hash  = key.hashCode();
        }
    }
    public void put(Object key, Object value) {
        if(first==null) {
            first = new Node<K, V>(null, (K) key, (V) value);
            return;
        }
        int newHash = key.hashCode();
        Node<K, V> seek = first;
        while(seek != null) {
            if(newHash == seek.hash && key.equals(seek.key)) {
                seek.value = (V) value;
                return;
            }
            if(seek.next == null) {
                seek.next = new Node<K,V> (null, (K) key, (V) value);
                return;
            }
            seek = seek.next;
        }
    }
    public void remove(Object key) {
        int keyHash = key.hashCode();
        Node<K, V> seek = first;
        if(keyHash == seek.hash && key.equals(seek.key)) {
            first = seek.next;
            return;
        }
        while(seek.next != null) {
            if(keyHash == seek.next.hash && key.equals(seek.next.key)) {
                seek.next = seek.next.next;
                return;
            }
            seek = seek.next;
        }
    }

    public void clear() {
        first = null;
    }

    public int size() {
        if(first == null) return 0;
        Node<K, V> seek = first;
        int i=1;
        while(seek.next != null) {
            ++i;
            seek=seek.next;
        }
        return i;
    }

    public Object get(Object key) {
        int keyHash = key.hashCode();
        Node<K, V> seek = first;
        if(keyHash == seek.hash && key.equals(seek.key)) {
            return seek.value;
        }
        while(seek.next != null) {
            if(keyHash == seek.next.hash && key.equals(seek.next.key)) {
                return seek.next.value;
            }
            seek = seek.next;
        }
        return null;
    }
}
