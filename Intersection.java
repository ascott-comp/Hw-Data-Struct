
public class Intersection {
    
    /**
    * takes takes two *sorted* lists 
    * and returns their intersection.
    * 
    * Runtime (in big-O notation): 
    */
    static MyArrayList<Integer> intersection(MyArrayList<Integer> lst1, MyArrayList<Integer> lst2){
        
        return null;
    }

    public static void main(String[] args){
        MyArrayList<Integer> lst1 = new MyArrayList<Integer>();
        lst1.add(10);
        lst1.add(12);
        lst1.add(14);
        lst1.add(15);
        lst1.add(16);

        MyArrayList<Integer> lst2 = new MyArrayList<Integer>();
        lst2.add(10);
        lst2.add(11);
        lst2.add(13);
        lst2.add(15);
        lst2.add(17);

        System.out.println(intersection(lst1, lst2));

    }

}
