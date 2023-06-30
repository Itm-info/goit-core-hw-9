package itm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* Array List */
        System.out.println("\n Array List");
        MyArrayList<String> myArrayList = new MyArrayList<String>();

        myArrayList.add("Hi");myArrayList.add("Again");myArrayList.add("More");
        //myArrayList.remove(1);

        for(int i=0;i<myArrayList.size();++i) {
            System.out.println("myArrayList " + myArrayList.get(i));
        }

        /* Linked List */
        System.out.println("\n Linked List");
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();

        myLinkedList.add("Hi");myLinkedList.add("Again");myLinkedList.add("More");
        //myLinkedList.remove(1);

        for(int i=0;i<myLinkedList.size();++i) {
            System.out.println("myLinkedList " + myLinkedList.get(i));
        }

        /* Queue */
        System.out.println("\n Queue");
        MyQueue<String> myQueue = new MyQueue<String>();

        myQueue.add("Hi");myQueue.add("Again");myQueue.add("More");

        int size = myQueue.size();
        for(int i=0;i<size;++i) {
            System.out.print("size " + myQueue.size());
            System.out.print(", peek " + myQueue.peek());
            System.out.println(", poll " + myQueue.poll());
        }


        /* Stack */
        System.out.println("\n Stack");
        MyStack<String> myStack = new MyStack<>();

        myStack.push("Hi");          System.out.println("peek " + myStack.peek());
        myStack.push("Again");       System.out.println("peek " + myStack.peek());
        myStack.push("More");        System.out.println("peek " + myStack.peek());

        size = myStack.size();
        for(int i=0;i<size;++i) {
            System.out.print("size " + myStack.size());
            System.out.print(", peek " + myStack.peek());
            System.out.println(", pop " + myStack.pop());
        }

        /* Hash Map */
        System.out.println("\n Hash Map");
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();

        myHashMap.put("0","Hi");myHashMap.put("1", "Again");myHashMap.put("2","More");

        size = myHashMap.size();

        myHashMap.remove("1");

        for(int i=0;i<size;++i) {
            System.out.println("i = " + i + ", get " + myHashMap.get(String.valueOf(i)));
        }
    }
}