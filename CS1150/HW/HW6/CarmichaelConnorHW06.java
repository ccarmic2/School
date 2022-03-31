/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: March 30, 2022
 > Assignment: #6
 > Description:
 > This program will prompt for 10 grades and then it will find the highest grade,
 > adverage, and create a grade scale and assign each students grade a letter grade
 > based on the grading scale. It will then print out a table of the students grades
 > and letter grades as well as print how many of each letter grades there are.
 */

import java.util.Scanner;
public class CarmichaelConnorHW06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//declare and initialize constants
    int NUMBER_OF_GRADES = 10;

//declare and Initalize variables
    int highestGrade    = 0;
    double gradeAvg     = 0;

//delcare and Initalize arrays
    int grades[] = new int[NUMBER_OF_GRADES];
    char letterGrades[] = new char[NUMBER_OF_GRADES];

//prompt for Student grades
    System.out.println("   |----------------------------------------------------------------|");
    System.out.println("   |//////////////////////  Grade Assignment  //////////////////////|");
    System.out.println("   |----------------------------------------------------------------|");
    System.out.println();
    System.out.println("   Enter 10 Student Grades (must be between 0-100)");
    enterExamGrades(grades, input);
    System.out.println();
    System.out.println();

//get and print highestGrade
    highestGrade = findHighestGrade(grades);
    System.out.println("   Highest Grade: "+highestGrade);
//get and print average
    gradeAvg = computeAverage(grades);
    System.out.println("   Average Grade is: "+gradeAvg);

    System.out.println();
    System.out.println("   |----------------------------------------------------------------|");
    System.out.println("   |////////////////////////////////////////////////////////////////|");
    System.out.println("   |----------------------------------------------------------------|");
    System.out.println();

//assign letter grades to each student according to curve and print out a table
//of each students grade and number of each letter grade
    computeLetterGrades(grades, letterGrades, highestGrade);
    displayGrades(grades, letterGrades);
    System.out.println();
    System.out.println("   ------------------------------------------------------------------");
    System.out.println();
    displayNumberOfLetterGrades(letterGrades);
  }

  public static void enterExamGrades (int[] grades, Scanner input){
    int currentGrade = 0;
   //loop for the number of grades creating a new prompt while checking if input is valid
    for (int i = 0; i < grades.length; i++){
      currentGrade = i+1;

      do{
      System.out.print("   Enter Grade "+ currentGrade +": ");
      grades[i] = input.nextInt();

      }while (grades[i] < 0 || grades[i] > 100);
    }
  }

  public static int findHighestGrade (int[] grades){
    int highestGrade = 0;
  //loop through each grade and set the highest grade to the current grade if its larger
    for (int i = 0; i < grades.length; i++){
      if (grades[i] > highestGrade){
        highestGrade = grades[i];
      }
    }
    return highestGrade;
  }

  public static double computeAverage (int[] grades){
    int sum = 0;
  //loop through each grade and add it to the sum variable
    for (int i =0; i < grades.length; i++){
      sum += grades[i];
    }
  //divide the sum by the number of grades to get the adverage
    double average = (double)sum/(double)grades.length;
    return average;
  }

  public static void computeLetterGrades (int[] grades, char[] letterGrades, int highestGrade){
  //loop through each grade and assign a letter grade to the corresponding array if the
  //boolean for the grade scale is true
    for (int i = 0; i<letterGrades.length; i++){
      if (grades[i] >= (highestGrade - 10)){
        letterGrades[i] = 'A';
      }else if (grades[i] >= (highestGrade - 20)){
        letterGrades[i] = 'B';
      }else if (grades[i] >= (highestGrade - 30)){
        letterGrades[i] = 'C';
      }else if (grades[i] >= (highestGrade - 40)){
        letterGrades[i] = 'D';
      }else{
        letterGrades[i] = 'F';
      }
    }
  }

  public static void displayGrades (int[] grades, char[] letterGrades){
    int currentStudent = 0;
    System.out.printf("\t Students \t\t Exam Grade \t\t Letter Grade\n");
    System.out.printf("\t ------------------------------------------------------------\n");

  //loop through the number of grades to print out a table for grades and letter
  //grades for the corresponding student
    for (int i = 0; i < grades.length; i++){
      currentStudent++;
      System.out.printf("%10d%25d%23c%n",currentStudent, grades[i], letterGrades[i]);
    }
  }

  public static void displayNumberOfLetterGrades (char[] letterGrades){
    int numOfA=0;
    int numOfB=0;
    int numOfC=0;
    int numOfD=0;
    int numOfF=0;

  //loop through the number of grades and add to the count of the corresponding
  //letter grade
    for (int i = 0; i < letterGrades.length; i++){
      if (letterGrades[i] == 'A'){
        numOfA++;
      }else if (letterGrades[i] == 'B'){
        numOfB++;
      }else if (letterGrades[i] == 'C'){
        numOfC++;
      }else if (letterGrades[i] == 'D'){
        numOfD++;
      }else if (letterGrades[i] == 'F'){
        numOfF++;
      }
    }

    System.out.printf("%s%d%n","   Number of A\'s : ", numOfA);
    System.out.printf("%s%d%n","   Number of B\'s : ", numOfB);
    System.out.printf("%s%d%n","   Number of C\'s : ", numOfC);
    System.out.printf("%s%d%n","   Number of D\'s : ", numOfD);
    System.out.printf("%s%d%n","   Number of F\'s : ", numOfF);

  }
}
