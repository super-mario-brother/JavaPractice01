package Java20112021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Homework1 {
    public static void main(String[] args) {
        // the list of integers we have for our homework, I'm saving them as an array first because I'm little lazy
        // we don't have to do this but other way to make a List collection would be to call method myList.add(1) ten times
        int[] myArray = {1,3,6,7,4,3,3,2,8,9};

        // this will be a list with duplicates, means all the numbers we got in that order
        // it's still empty
        ArrayList<Integer> myList = new ArrayList<>();
        // the homework was to remove duplicates and we've learnt that Sets don't allow duplicates
        // so this will be our solution set to print later
        // now it's empty
        HashSet<Integer> mySet = new HashSet<>();

        // this for loop will run 10 times, from 0 to myArray.length() - 1
        // ( array length is 10, but we say to run only until i < 10 not <= )
        for (int i = 0; i < myArray.length; i++){
            // every time the loop runs it'll use in-built method for List and add a value from our array at position i
            //  i=0 it's 1 / i=1 it's 3 / i=2 it's 6 and so on
            myList.add(myArray[i]); // we say "myList, add to yourself whatever is stored in position i of myArray (myArray[i])
        }

        // now we should have all the numbers from array in our list
        // we use loop again but as go over a list we use myList.size() to determine how many times we have to repeat
        for (int i = 0; i < myList.size(); i++){
            // first we print what is in our list at position i - and the value in that position returned by in-built method .get()
            // half of our homework done - print the list with duplicated values
            System.out.println("Index position: " + i + " has value: " + myList.get(i));

            // I'm still lazy, so I'll use the same loop to prepare second half of our homework
            // we've made mySet ready at the beginning,
            // now we take whatever myList.get(i) finds in the list
            // and add it to mySet
            mySet.add(myList.get(i));
        }

        // now mySet should be ready to print and we'll use Iterator class to do that
        Iterator<Integer> myIterator = mySet.iterator();
        System.out.print("My set (no duplicates): ("); // just print beginning of the message
        while (myIterator.hasNext()){  // while loop will run as long as there is next element in our set iterator
            System.out.print(myIterator.next()); // print whatever is returned by myIterator.next()
            if (myIterator.hasNext()){  // if condition to only print ", " if there is another element to print ...
                System.out.print(", ");
            }
        }
        System.out.println(")"); // ... no more elements we can print closing bracket
        //homework printed  - no duplicated elements
    }

}
