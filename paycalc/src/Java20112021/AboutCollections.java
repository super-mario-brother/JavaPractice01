package Java20112021;

import java.util.*;

public class AboutCollections {
/*    inserting data - processing data - retrieving data as required

    collections framework, built-in classes in java that improves upon arrays, we use, to store and retrieve objects
    unlike arrays we don't need to declare the size of collection in advance

    Collections is an interface - 100% abstraction which is not implemented, we must extend it as
    List - can be implemented as:
        ArrayList
        LinkedList
        Stack
    Set - implements:
        HashSet
        LinkedHashSet
    Queue - implements:
        PriorityQueue

    Map - we will mostly be using instead of queues for Selenium, it's also an interface and can be implemented using different classes:
        HashMap
        LinkedHashMap
        HashTable
        TreeMap

    */
    public static void main(String[] args) {
        // List is an ordered collection
        //dynamic array
        //common methods: add(), addAll(), remove(), size(), contains(), containsAll(), retain(), equals()
        //Advantages over arrays:
            //  - reduces programming effort
            //  - faster
            //  - provides inbuilt methods
        // we can combine different types of data (like String, Double, Integer, Boolean), but it's not recommended practice

      //classname-reference variable - new instance of myList
        ArrayList myList1         = new ArrayList<String>();
        ArrayList myList2         = new ArrayList<String>();


        myList1.add("flour");
        myList1.add("salt");
        myList2.add("eggs");
        myList2.add("milk");
        myList2.add("butter");
        System.out.println("Dry ingredients: " + myList1);
        System.out.println("Wet ingredients: " + myList2);
        ArrayList crepe  = new ArrayList<String>();
        crepe.addAll(myList1);
        crepe.addAll(myList2);
        System.out.println("All ingredients: " + crepe);
        System.out.println("We need " + crepe.size() + " ingredients");
        //we can insert list at specific index position


        myList1.addAll(1, myList2);
        System.out.println("Added " + myList1.size() +" ingredients: " + myList1);


        ArrayList shopping = new ArrayList<>();
        shopping.add(myList1.get(3));
        myList1.remove(3);
        myList1.remove("butter"); // if this object does not exist it will leave list unchanged
        System.out.println("Added " + myList1.size() +" ingredients in order: " + myList1);

        String saveSomeMilk = new String("water");
        myList1.add(3,saveSomeMilk);
        System.out.println(myList1);
        myList1.add(0,saveSomeMilk);
        System.out.println(myList1);
        saveSomeMilk = "H2O";
        myList1.add(0,saveSomeMilk);
        System.out.println(myList1);

/*
Set
advantages:
    - does not allow duplicates
    - does not preserve order - is not an index based collection
*/
        HashSet<String> mySet1 = new HashSet<>();
        String studentName = "Mamata";
        mySet1.add(studentName);
        mySet1.add("Janki");
        mySet1.add("Nisha");
        mySet1.add("Arpi");
        mySet1.add("Bindya");
        System.out.println("Set elements: " + mySet1);
        //we have to use foreach loop not for loop as sets don't have an index
        for(String student: mySet1){
            System.out.println(student);
        }
        mySet1.add("Janki"); //add more Janki
        for(String student: mySet1){
            System.out.println("No duplicates: "+ student);
        }
        if (mySet1.contains("Mamata")){
            System.out.println("Hello "+ studentName );
        }
        mySet1.remove(studentName); //will remove specified set element
        if (mySet1.contains("Mamata")){
            System.out.println("Hello "+ studentName );
        } else {
            System.out.println("Bye " + studentName);
        }


        System.out.println(mySet1);

// another way to iterate over collection elements is by using Iterator
        Iterator<String> myIterator  = mySet1.iterator();
        while (myIterator.hasNext()){  //when there is next element
            System.out.println("by iterator: " + myIterator.next()); //print this next element
        }

        mySet1.clear(); //will remove all elements from list
        System.out.println(mySet1);

    }


}
