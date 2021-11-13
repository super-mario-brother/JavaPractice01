package Java13112021;

public class AboutArrays {
    public static void main(String[] args) {
        /*
        Array is a collection of items of the same data type saved in one variable
        */
        int a[] = new int[5];
        // creates array of size 5, it's empty and all values stored must be integers
        // in java the size of array can not change once created
        a[0]=1; // indexes start at 0 - a[0] and this assigns value 1 to first place of array a
        a[1]=2; // a[x] where x is index number
        a[2]=3;
        a[3]=4;
        a[4]=5;
        int length_a = a.length;
        System.out.println("Array a lenght is: " + length_a);

        int b[] = {1,2,3,4}; // another way to create an array, this is of size 4
        int length_b = b.length;
        System.out.println("Array b lenght is: " + length_b);

        String studentName[] = {"Janki","Bindiya","Zalak","Arpi","Chetna","Nisha","Sejal","Bhumika","Mamata","Mariusz"};
        System.out.println("The number of students in this array is " + studentName.length);
        // first element is with index 0
        String firstStudent = studentName[0];
        System.out.println("First student is: " + firstStudent);
        //last student is at index 3 or (array lenght - 1)
        int maxIndex = studentName.length - 1;
        String lastStudent =  studentName[maxIndex];
        System.out.println("Last student is: " + lastStudent);

        // for loop
        //  (initial index at which counting starts; index condition until the loop repeats; next step for the index
        for (int i=0;                               i <= 9;                             i++)                        { //the body of loop starts here
            System.out.print("Student at index i=" + i + " is ");   //steps of the loop to be repeated each time
            System.out.println(studentName[i]);                     //steps of the loop to be repeated each time
        }
        for (int i=0; i <= (studentName.length -1); i++) {
            System.out.println("Student at index i=" + i + " is " + studentName[i]);
        }
        System.out.println(); // print empty line between loops
        for (int i=0; i < studentName.length ; i++) {
            System.out.println("Student at index i=" + i + " is " + studentName[i]);
        }
        System.out.println(); // print empty line between loops
        for (int i=0; i < studentName.length ; i++) {
            //if conditional statement
            if (i < 4) {
                System.out.println("Hello " + studentName[i]);
            } else if (i >= 4 && i < 9){
                System.out.println("Hello everyone");
            } else {
                System.out.println("Oh no we missed " + studentName[i]);
            }
        }
        System.out.println(); // just empty line

        // switch conditional statement
        int today = 6;
        switch (today) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }
        //String todayWeather = "cloudy";

        System.out.println();
        String todayWeather = "sunny";

        switch (todayWeather){
            case "sunny":
                System.out.println("Weather today is "+ todayWeather + ". Take motorbike");
                break;
            case "rainy":
                System.out.println("Weather today is "+ todayWeather + ". Take bus");
                break;
            case "snowy":
                System.out.println("Weather today is "+ todayWeather + ". Maybe better take train");
                break;
            default:
                System.out.println("Weather today is "+ todayWeather + ". Motorbike or bicycle?");
                break;
        }
        System.out.println();
        //for each loop - we don't need to specify length of the array
        int numbers[] = {1,2,5,10,15,3,4};
             //element of an array: array we take elements from
        for (int number:            numbers) {   //spaces will be deleted by compiler
            System.out.println(number);
        }
        System.out.println();
        for (int number: numbers) {
            if (number > 3) {
                System.out.println(number);
            }
        }
        System.out.println();
        //while loop - continue a loop until condition value is met/satisfied
        int i = 0;  //from index 0
        while(i<=10){                          //repeat when i is 10 or less
            System.out.println("count: " + i); //print count value
            i++;                               //increment by 1
        }
    }
}
