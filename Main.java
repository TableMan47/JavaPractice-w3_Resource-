
import java.util.Arrays;

public class Main {
public static void main(String[] args) {
// write your code here

// 1. Program to sort a numeric array and a string array.
    /*int[] myIntArray = {25,44,99,77,11,52,33};
    String[] myStringArray = {"John", "Sandy", "Andy", "Carla", "Zoe", "Mathew"};

    System.out.println("Original Integer Array = " + Arrays.toString(myIntArray));
    System.out.println("Original String Array = " + Arrays.toString(myStringArray));

    // Leave an empty line
    System.out.println("\n");

    Arrays.sort(myIntArray);
    System.out.println("Sorted Int Array = " + Arrays.toString(myIntArray));

    Arrays.sort(myStringArray);
    System.out.println("Sorted String Array = " + Arrays.toString(myStringArray));
    */




//2. Program to sum values of an array.
    /*int[] myIntArray = {01,22,73,74,57,66,74,844,954,10};
    int sum = 0;

    // This is a For Each loop
    for(int i: myIntArray) {
      sum += i ;
    }

    System.out.println("The sum is: " +sum);
       */





// 4. Program to calculate the average of array elements.
    /*int[] myArray = {11,20,35,45,75};


    // 1st Approach (Using For-Each loop)
    int sum = 0;

    for(int i : myArray){
        sum += i;
    }

    System.out.println("The sum of the elements : " + sum);

    //Calculating Average
    double average = (double)sum/ myArray.length;

    System.out.println("Average is :: " + average);
     */

    // 2nd Approach (Using For loop)
    /* int sum = 0;
    for(int i = 0; i < myArray.length; i++){
        sum = sum + myArray[i];
    }

    // Average
    double average = sum / myArray.length;

    System.out.println("The Average is: " + average);
    */



//7. Program to remove a specific element from an array.
    /*int[] array = {10,20,30,40,50};

    int removeIndex = 0;

    System.out.println("Original Array: " + Arrays.toString(array));

    // Using For Loop
    for(int i = removeIndex; i < array.length -1 ; i++){
        array[i] = array[i + 1];
    }

    System.out.println("After Removing Index " + removeIndex + ", the remaining array is: ");
    System.out.println(Arrays.toString(array));
    */


// 8. Program to copy an array by iterating the array.
    /*int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    int[] newArray = new int[array.length];

    System.out.println("Source Array: " + Arrays.toString(array));
//    System.out.println();

    for(int i = 0; i < array.length; i++){
        newArray[i] = array[i];
    }

    System.out.println("New Array:    " +Arrays.toString(newArray));
    */



//9. Program to insert an element at a specific position into an array.
    /*
    int[]  array = {1,2,3,4,5};
    System.out.println("Initial Array " + Arrays.toString(array));

    // Insert an element at index position 2
    int indexPosition = 2;
    int insertElement = 99;

    for(int i = array.length - 1; i > indexPosition; i--){
        array[i] = array[i - 1];
    }

    array[indexPosition] = insertElement;

    System.out.println("Array after Insertion: " + Arrays.toString(array));
    */


//10. Program to reverse an array of Integer values.
    /*  
    int[] arr = {1,2,3,4,5,6,7,8,9};
 
    System.out.println("Initial Array : " + Arrays.toString(arr));

    for(int i = 0; i < arr.length/2; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp; 
    }

    System.out.println("Reversed Array: " + Arrays.toString(arr));
    */


        
//11. Find the duplicate values of a specific element in an array. 
    /*
    int[] arr = {1,2,1,1,3,4,5};

    int target = 1; 

    int sum = 0; 

    for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
            sum += 1 ; 
        }
    }

    System.out.println("Element " + target + " was repeated : " + sum);
    */



    
//12. Display those elements who have duplicate items in an array (contains integer values).
    /*
    int[]  arr = {1,2,3,4,5,2,1,5,4};

    for(int i = 0; i < arr.length - 1; i++){ 

        for(int j = i+1; j < arr.length; j++){

            if(arr[i] == arr[j] &&   (i != j) ){

                System.out.println("This Element has duplicate elements = " + arr[j]);
            }
        }
    }


    */





        
//13. Display those elements who have duplicate items in an array (contains String values).
    /*
    String[] arr = {"sam" , "smith", "john", "john", "smith"};

    for(int i = 0; i < arr.length - 1 ; i++){

        for(int j = i+1; j < arr.length; j++){ 

            if(arr[i].equals(arr[j]) && (i != j)){
                System.out.println("Duplicate Elements are : " + arr[j]);
            }
        }
    }   
    */
    


        
//14. Find common elements between two arrays (Integer values). 
    /*
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {8,6,7,5,9};

    for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr2.length; j++){
            if(arr1[i] == arr2[j] && (i != j )){
                System.out.println("Duplicate Element is: " +arr2[j]);
            }
        }
    }
    */





//15. Find common elements between two arrays (String values).
    /*
    String[] arr1 = {"sam", "john", "candy", "andy"};
    String[] arr2 = {"andy", "sam", "arthur"};

    for(int i = 0; i < arr1.length; i++){
        for(int j =0; j < arr2.length; j++){
            if(arr1[i] == arr2[j] && (i != j)){
                System.out.println("Duplicate String elements : " + arr2[j]);
            }
        }
    }
    */


// 16. Find the largest second element in an array. 
    int[] arr = {3,45,74,44,86,37};

    System.out.println("Unsorted Array: " +Arrays.toString(arr));

    Arrays.sort(arr); 

    System.out.println("Sorted Array: " +Arrays.toString(arr));

    int secondElement = arr[arr.length - 2];

    System.out.println("Second Largest Element : " +secondElement);




























}
}
