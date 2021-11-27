package Java27112021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class AboutMap {
    public static void main(String[] args) {
        // HashMap is used to store Key - Value pairs
        // selenium uses lot of json objects
        // HashMap implements map interface and is only way in java that allows to read key-value pairs
        // keys have to be unique (no duplicates)
        // can't take primitive types
        HashMap<String, String> myHashMap = new HashMap<String, String >();

        myHashMap.put("Alan","11aa22aa33");
        myHashMap.put("Bob","11bb22bb33");
        myHashMap.put("Charlie","11cc22cc33");
        myHashMap.put("Doris","11bb22bb33");
        myHashMap.put("Ella","11ee22ee33");


        System.out.println(myHashMap);

        myHashMap.put("Doris", "11dd22dd33"); // no key duplicates means at key - Doris value will be updated

        System.out.println(myHashMap);
        System.out.println("Value of Charlie password: "+ myHashMap.get("Charlie"));

        boolean myHashMapStatus = myHashMap.isEmpty();
        System.out.println("is myHashMap empty?: "+myHashMapStatus);

        int myHashMapSize = myHashMap.size(); // counts key-value pairs
        System.out.println("Size of myHashMap: "+myHashMapSize);

        myHashMap.remove("Alan");
        System.out.println("We've removed Alan: "+myHashMap);

        myHashMap.remove("Doris","11bb22bb33");
        System.out.println("Tried to remove Doris' old password, but won't let us after she changed it: "+ myHashMap);

        myHashMap.replace("Doris", "11dd22dd33", "newpassword");
        System.out.println("Doris replaced her password: "+myHashMap);

        // Iterators to loop through Maps
        Iterator<Entry<String, String>> myHashSetIterator = myHashMap.entrySet().iterator(); //key value pairs
        while(myHashSetIterator.hasNext()){
            System.out.println("Iterator Pairs: "+myHashSetIterator.next());
        }

        Iterator<String> myKeyIterator = myHashMap.keySet().iterator(); //only keys
        while(myKeyIterator.hasNext()){
            System.out.println("Iterator Keys: "+myKeyIterator.next());
        }

        Iterator<String> myValueIterator = myHashMap.values().iterator(); // only values
        while(myValueIterator.hasNext()){
            System.out.println("Iterator Values: "+myValueIterator.next());
        }

        // using foreach loop
        for (String myKey: myHashMap.keySet()){
            System.out.println("for loop keys: " + myKey);
        }
        for (String myValue: myHashMap.values()){
            System.out.println("for loop values: " + myValue);
        }

        for (Entry<String, String> myKeyValuePairs: myHashMap.entrySet() ){
            System.out.println("for loop key: " +myKeyValuePairs.getKey()+ " --- value: "+myKeyValuePairs.getValue());
        }
    }
}
