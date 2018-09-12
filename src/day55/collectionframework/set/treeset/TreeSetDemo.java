package day55.collectionframework.set.treeset;

import java.util.TreeSet;

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet t = new TreeSet();
        t.add(null);
       /* t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("L");*/
        
        //t.add(new Integer(10)); // CCE , Why ? Heterogeneous, RuntimeException
        //t.add(null);  // NPE , Why ? , Null is allowed but only once then why it is giving NPE here.
        // Null should the first element to be inserted
        
       System.out.println(t);  // output ? [A B L Z a]
       
       // Java 6 :- Null was allowed, but that should be the first element only in the Tree
       // Java 7 :- null is not allowed from Java 1.7 onwards...
    }
}