package Java20112021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Homework1 {
    public static void main(String[] args) {
        int[] myArray = {1,3,6,7,4,3,3,2,8,9};
        ArrayList<Integer> myList = new ArrayList<>();
        HashSet<Integer> mySet = new HashSet<>();

        for (int i = 0; i < myArray.length; i++){
            myList.add(myArray[i]);
        }
        for (int i = 0; i < myList.size(); i++){
            System.out.println("Index position: " + i + " has value: " + myList.get(i));
            mySet.add(myList.get(i));
        }

        Iterator<Integer> myIterator = mySet.iterator();
        System.out.print("My set (no duplicates): (");
        while (myIterator.hasNext()){
            System.out.print(myIterator.next());
            if (myIterator.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println(")");


    }

}
