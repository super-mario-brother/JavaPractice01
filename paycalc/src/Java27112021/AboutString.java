package Java27112021;

public class AboutString {
    public static void main(String[] args) {
        String statement = "Today we are learning about \"Strings\"";

        System.out.println("length of my statement is: " +statement.length());

        System.out.println("where is ' learning'? " + statement.indexOf(" learning")); //space is part of the string
        System.out.println("where is first \" ? " + statement.indexOf("\""));
        System.out.println("where is first empty space ? " + statement.indexOf(" "));
        System.out.println("Does it count from 0 ? " + (statement.indexOf("T") == 0) );

        String statement1 = "Today we are learning about 'String'";
        String statement2 = "Today we are learning about \"string\"";
        System.out.println("is statement 1 and 2 the same? " + statement.equals(statement1));
        System.out.println("is statement 1 and 3 the same? " + statement.equals(statement2));
        System.out.println("is statement 1 and 3 the same if we ignore case? " + statement.equalsIgnoreCase(statement2));

        int todaysTopicIndex = statement.indexOf("String");
        System.out.println(statement.substring(todaysTopicIndex, (statement.length()-1)) + " in java is really important topic.");

        System.out.println("Replace spaces: " + statement.replace(" ", "_"));

        String splitStatementArray[] = statement.split(" "); // split() method will put each word into String splitStatementArray[]
        // we need for loop to print from array
        for (String word : splitStatementArray){
            System.out.println("- "+word);
        }

        // checking if our string contains some substring returning boolean
        System.out.println("Did we say Java? " + statement.contains("Java"));
        System.out.println("Did we say String? " + statement.contains("String"));

        // next - constructors and access modifiers
    }
}
