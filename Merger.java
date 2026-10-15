public class Merger<T extends Comparable> {
    /**
    * Takes two Lists in sorted orderand merges them into result.
    * TODO
    * Runtime (in big-O notation): 
    */
    void merge(MyList<T> lst1, MyList<T> lst2, MyList<T> result){
        
    }

    /**
    * Recursively merges the elements of lst1 from i to the end with the elements
    * of lst2 from j to the end. Resulting list goes in result 
    * TODO
    * Runtime (in big-O notation): 
    */
    void mergeRec(MyList<T> lst1, MyList<T> lst2, MyList<T> result, int i, int j){

    }

    public static void main(String[] args){
        Merger<String> m = new Merger<>();

        MyArrayList<String> l1 = new MyArrayList<>();
        l1.add("Albania");
        l1.add("Belgium");
        l1.add("Germany");
        l1.add("Ireland");

        MyArrayList<String> l2 = new MyArrayList<>();
        l2.add("Cuba");
        l2.add("El Salvador");
        l2.add("Honduras");
        l2.add("Mexico");

        MyArrayList<String> out = new MyArrayList<>();

        MyArrayList<String> expected = new MyArrayList<>();
        expected.add("Albania");
        expected.add("Belgium");
        expected.add("Cuba");
        expected.add("El Salvador");
        expected.add("Germany");
        expected.add("Honduras");
        expected.add("Ireland");
        expected.add("Mexico");

        m.merge(l1, l2, out);
        
        System.out.println("merge...")
        System.out.println("output: " + out.toString());
        System.out.println("expected: " + expected.toString());

        System.out.println("mergeRec...");
        out = new MyArrayList<>();

        m.mergeRec(l1, l2, out, 0, 0);
        
        System.out.println("output: " + out.toString());
        System.out.println("expected: " + expected.toString());

    }

}
