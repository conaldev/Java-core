import java.util.Arrays;
public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        this.elements = new Object[capacity];
    }
    public void add (int index, E element){
        if(index <0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        else if(size == elements.length) {
            ensureCapacity();
        }
        for(int i=size-1;i>=index;i--){
            elements[i+1] = elements[i];
        }
        elements[index] =0;
        size++;
    }
    public void ensureCapacity(){
        int newSize = elements.length + DEFAULT_CAPACITY;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E remove(int index) {
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException("Index is out of bound.");
        }else {
            E temp = (E) this.elements[index];
            for(int i=index;i<size-1;i++){
                this.elements[i] = this.elements[i+1];
            }
            this.size--;
            return temp;
        }
    }
    public int size(){
        return  this.size;
    }
    public boolean contains(E element) {
        for(int i=0;i<size;i++){
            if(element.equals(this.elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E element) {
        for(int i=0;i<size;i++){
            if(element.equals(this.elements[i]))
                return i;
        }
        return -1;
    }
    public boolean add(E element){
        if (this.size == elements.length){
            this.ensureCapacity();
        }
        elements[size++] = element;
        return true;
    }
    public E get(int index){
        if(index<0 || index >elements.length)
            throw new IndexOutOfBoundsException("Index is out of bound.");
        return (E) elements[index];
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
