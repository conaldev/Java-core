public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes =0;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        this.tail = this.head;
        numNodes++;
    }
    public void add(int index, Object data){
        MyLinkedList.Node temp = head;
        MyLinkedList.Node holder;
        for(int i=0;i<index -1 && temp.next != null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new MyLinkedList.Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        MyLinkedList.Node temp = head;
        head = new MyLinkedList.Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data) {
        MyLinkedList.Node temp = new MyLinkedList.Node(data);
        tail.next = temp;
        tail = temp;
        numNodes++;
    }
    public E get(int index){
        if(index<0 || index >= numNodes){
            throw new IndexOutOfBoundsException("Index is out of bound.");
        }else {
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return (E) temp.getData();
        }
    }
    public E getFirst() {
        return (E) head.getData();
    }
    public E getLast(){
        return (E)tail.getData();
    }
    public E remove(int index){
        if(index<0 || index>=numNodes)
            throw new IndexOutOfBoundsException("Index is out of bound.");
        else {
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            Node result = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return (E) result.getData();
        }
    }
    public boolean remove(Object e){
        Node temp = head;
        for(int i=0;i<numNodes;i++){
            if(temp.getData().equals(e)){
                if(i==0){
                    head = head.next;
                    numNodes--;
                }else
                    remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int size(){
        return this.numNodes;
    }
    public boolean add(E e) {
        MyLinkedList.Node temp = new MyLinkedList.Node(e);
        tail.next = temp;
        tail = temp;
        numNodes++;
        return true;
    }
    public boolean contains(E e) {
        Node temp = this.head;
        for(int i=0;i<numNodes;i++){
            if(temp.getData().toString().equals(e.toString()))
                return true;
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E e){
        Node temp = this.head;
        for(int i=0;i<numNodes;i++){
            if(temp.getData().equals(e))
                return i;
        }
        return -1;
    }
    public void printList(){
        Node temp = head;
        for(int i=0;i<numNodes;i++){
            System.out.println(temp.getData().toString());
            temp = temp.next;
        }
    }
    private class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
