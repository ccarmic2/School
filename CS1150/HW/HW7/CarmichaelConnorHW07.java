/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: April 6, 2022
 > Assignment: #7
 > Description:
 >This program will fill two arrays with even and odd arrays and then merge them into
 >one array and print out the 3 arrays. It is also meant to merge two other arrays
 >sort the values at the same time, but it just prints 0's
 */

import java.util.Arrays;
public class CarmichaelConnorHW07 {
  public static void main(String[] args) {
//constants
    final int ARRAY_SIZE = 5;

//arrays
    int[] array1 = {1,2,3,6,8};
    int[] array2 = {4,5,7,9,10,11,12};
    int[] evenArray = new int[ARRAY_SIZE];
    int[] oddArray = new int[ARRAY_SIZE];
    int[] unsortedMergedArray = new int[ARRAY_SIZE*2];
    int[] sortedMergedArray = new int [array1.length+array2.length];

//Create Even array and print
    fillWithEvenValues(evenArray);
    display(evenArray, "Even Array");

//Create odd array and print
    fillWithOddValues(oddArray);
    display(oddArray, "Odd Array");

//Merege the even and odd array and sort, then print
    unsortedMergedArray = unsortedMerge(evenArray, oddArray);
    display(unsortedMergedArray, "Merged Array -- Sorted With Arrays.sort");

//Sort and merge array1 and array2 at the same time then print
    sortedMergedArray = sortedMerge(array1, array2);
    display(sortedMergedArray, "Merged Array -- Sorted Manually");

  }

//Creates a random even integer by creating random integers until it doesnt has a remainder
//when divided by 2 and that it is between 1 and 30. Once it is both it fills an index
//in the array and loops until the whole array is filled
  public static void fillWithEvenValues(int[] array){
    int currentNum;
    for (int i = 0; i < array.length; i++){
      currentNum = 3;
      while (currentNum % 2 != 0 || (currentNum < 1 || currentNum > 30)){
        currentNum = (int)(Math.random()*100);
      }
      array[i] = currentNum;
    }

    Arrays.sort(array);
  }

//Creates a random odd integer by creating random integers until it has a remainder
//when divided by 2 and that it is between 1 and 30. Once it is both it fills an index
//in the array and loops until the whole array is filled
  public static void fillWithOddValues(int[] array) {
    int currentNum;
    for (int i = 0; i < array.length; i++){
      currentNum = 2;
      while (currentNum % 2 == 0 || (currentNum < 1 || currentNum > 30)){
        currentNum = (int)(Math.random()*100);
      }
      array[i] = currentNum;
    }

    Arrays.sort(array);
  }

//goes through the array and prints out each value within it with a for loop
  public static void display (int[] array, String arrayName){
    System.out.println(" "+arrayName);
    System.out.println("------------------------------------------");
    for (int i = 0; i < array.length; i++){
      System.out.printf("\t array[%d] = %d%n", i, array[i]);
    }
    System.out.println();
  }

//This method takes all of the values from array1 and puts them into the
//mergedArray then places the values from array2 into the mergedArray
//after that it sorts the array with Array.sort() and returns mergedArray
  public static int[] unsortedMerge(int[] array1, int[] array2){
    int[] mergedArray = new int[array1.length + array2.length];
    int i;
    for (i = 0; i < array1.length; i++){
      mergedArray[i] = array1[i];
    }
    for (int k = 0; k < array2.length; k++){
      mergedArray[i] = array2[k];
      i++;
    }

    Arrays.sort(mergedArray);
    return mergedArray;
  }

//yea this one doesnt work
//gave up after writing rewriting this a couple times
  public static int[] sortedMerge (int[] array1, int[] array2){
    int[] mergedArray = new int[array1.length + array2.length];
    int index1 = 0;
    int index2 = 0;
    int currentMin1 = 0;
    int currentMin2 = 0;
    int lastMoved = 2;

    for (int mergedIndex = 0; mergedIndex < mergedArray.length; mergedIndex++){
      while (array1[index1]<lastMoved){
        if(array1[index1] > lastMoved){
          array1[index1] = currentMin1;
        }
        index1++;
      }
      while (array2[index2]<lastMoved){
        if(array2[index2] > lastMoved){
          array2[index2] = currentMin2;
        }
        index2++;
      }
      if (currentMin1 < currentMin2){
        mergedArray[mergedIndex] = currentMin1;
        lastMoved = currentMin1;
      }else{
        mergedArray[mergedIndex] = currentMin2;
        lastMoved = currentMin2;
      }
    }

    return mergedArray;
  }
}
