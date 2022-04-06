/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: April 6, 2022
 > Assignment: #7
 > Description:
 >
 >
 >
 >
 */

import java.util.Arrays;
public class CarmichaelConnorHW07 {
  public static void main(String[] args) {
    final int ARRAY_SIZE = 5;
    int[] array1 = {1,2,3,6,8};
    int[] array2 = {4,5,7,9,10,11,12};
    int[] evenArray = new int[ARRAY_SIZE];
    int[] oddArray = new int[ARRAY_SIZE];
    int[] unsortedMergedArray = new int[ARRAY_SIZE*2];
    int[] sortedMergedArray = new int [array1.length+array2.length];

    fillWithEvenValues(evenArray);
    display(evenArray, "Even Array");

    fillWithOddValues(oddArray);
    display(oddArray, "Odd Array");

    unsortedMergedArray = unsortedMerge(evenArray, oddArray);
    display(unsortedMergedArray, "Merged Array -- Sorted With Arrays.sort");

    sortedMergedArray = sortedMerge(array1, array2);
    display(sortedMergedArray, "Merged Array -- Sorted Manually");

  }

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

  public static void display (int[] array, String arrayName){
    System.out.println(" "+arrayName);
    System.out.println("------------------------------------------");
    for (int i = 0; i < array.length; i++){
      System.out.printf("\t array[%d] = %d%n", i, array[i]);
    }
    System.out.println();
  }

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

  public static int[] sortedMerge (int[] array1, int[] array2){
    int[] mergedArray = new int[array1.length + array2.length];
    int i;
    for (i = 0; i < array1.length; i++){
      mergedArray[i] = array1[i];
    }
    for (int k = 0; k < array2.length; k++){
      mergedArray[i] = array2[k];
      i++;
    }
    return mergedArray;
  }
}
