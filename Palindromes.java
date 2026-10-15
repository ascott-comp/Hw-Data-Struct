public class Palindromes {
    /**
    * takes a linkedlist and determines whether it is a palindrome. 
    * Use the .equals() method, rather than ==, to test equality 
    * between list elements.
    * 
    * Runtime (in big-O notation): 
    */
    static boolean isPalindrome(MyLinkedList lst){
        
        return false;
    }

    public static void main(String[] args){
        MyLinkedList<String> lst = new MyLinkedList<String>();
        lst.add("you");
        lst.add("want");
        lst.add("to");
        lst.add("want");
        lst.add("you");

        System.out.println(isPalindrome(lst));

        MyLinkedList<Integer> lst2 = new MyLinkedList<Integer>();
        lst2.add(8);
        lst2.add(6);
        lst2.add(7);
        lst2.add(5);
        lst2.add(3);
        lst2.add(0);
        lst2.add(9);

        System.out.println(isPalindrome(lst2));

    }

}
