import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> extends MyList<T> implements Iterable<T>{
    Object[] arr;
    int end;
    public MyArrayList(){
        this.arr = new Object[10];
        this.end = 0;
    }

    private void resize(){
        // if the array is too long, resize the array
        Object[] newArr = new Object[this.arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public void add(T value){
        /* 
        add a new value to the array and resize if necessary
        */
        this.arr[end] = value;
        this.end++;
        if(this.end >= this.arr.length){
            this.resize();
        }
    }
    public void add(T value, int position){
        /* 
        add a new value to the array at the given position, shift values down and resize if necessary
        */
        if(position > this.end){
            throw new IndexOutOfBoundsException("ArrayList has size " + this.end);
        }
        Object placeholder = arr[position];
        Object placeholder2;
        arr[position] = value;
        for(int i = position+1;i < end; i++){
            placeholder2 = arr[i];
            arr[i] = placeholder;
            placeholder = placeholder2;
        }
        this.end++;
        if(this.end >= this.arr.length){
            this.resize();
        }
    }
    public T remove(int position){
        /* 
        remove and return the value at the given position
        */
        if(position >= this.end || position < 0){
            throw new IndexOutOfBoundsException("ArrayList has size " + this.end);
        }
        Object retval = this.arr[position];
        for(int i = position; i < this.end-1; i++){
            this.arr[i] = this.arr[i+1];
        }
        this.end = this.end - 1;
        return (T)retval;
    }
    public T get(int position){
        if(position >= this.end || position < 0){
            throw new IndexOutOfBoundsException("ArrayList has size " + this.end);
        }
        return (T) this.arr[position];
    }

    public T set(int position, T newValue){
        /* 
        set the value at the given position to the new value
        */
        if(position > this.end){
            throw new IndexOutOfBoundsException();
        }
        Object retval = this.arr[position];
        this.arr[position] = newValue;
        return (T) retval;
    }
    public int size(){
        return this.end;
    }
    public boolean contains(T value){
        /*
         * Determine if the array contains the given value
         */
        for(int i = 0; i < this.end; i++){
            if(this.arr[i] == value) return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return (this.end == 0);
    }
    public void clear(){
        this.end = 0;
    }

    public String toString(){
        StringBuilder retval = new StringBuilder();
        retval.append("[ ");
        for(int i = 0; i < this.end; i++){
            retval.append(this.arr[i].toString() + " ");
        }
        retval.append("]");
        return retval.toString();
    }

    public Iterator<T> iterator(){
        return new MyArrayListIterator<T>(this);
    }

    private class MyArrayListIterator<T> implements Iterator<T>{
        int position;
        MyArrayList<T> lst;

        private MyArrayListIterator(MyArrayList<T> lst){
            position = 0;
            this.lst = lst;
        }

        public boolean hasNext(){
            return position < lst.end; // note we can access the private members of MyArrayList
        }

        public T next(){
            if(!this.hasNext()) throw new NoSuchElementException("Iterator is at end of list.");
            T value = (T)lst.arr[position];
            position++;
            return value;
        }
    }
}
