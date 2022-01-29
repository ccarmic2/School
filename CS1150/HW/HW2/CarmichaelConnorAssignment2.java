/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: Jan 26, 2022
 > Assignment: #1
 > Description:
 > This program will ask for student name and their grades, and
 > it will calcuate their final grade and print out a table with
 > a grading scale and weight catagories.
 >
 */
import java.util.Scanner;

public class CarmichaelConnorAssignment2 {
  public static void main(String[] args) {
    //Calling the Scanner Class and Creating a Scanner object
    Scanner input = new Scanner(System.in);

    //Weight constants for corresponding grades (Learning Activites, Homework [HW], Quizzes, Midterms, and Final Exam)
    final double weightActivities = 0.1;
    final double weightHW = 0.4;
    final double weightQuiz = 0.1;
    final double weightMidterm = 0.2;
    final double weightFinalExam = 0.2;

//------------------------------------------------------------------------------
//Prompt User to input student data
    //Print Title
      //               |--------------------------------72 dashes--------------------------------|
    System.out.println(" |----------------------------------------------------------------------|");
    System.out.printf("%2s%44s%27s %n","|","Grade Calculator","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");

    //Prompt for input
      //Student name
    System.out.printf("%2s%24s","|","Enter Student's Name: ");
      String name = input.nextLine();
      //Grades
    System.out.printf("%2s%35s","|","Enter Learning Activities Grade: ");
      double gradeActivities = input.nextDouble();

    System.out.printf("%2s%24s","|","Enter Homework Grade: ");
      double gradeHW = input.nextDouble();

    System.out.printf("%2s%20s","|","Enter Quiz Grade: ");
      double gradeQuiz = input.nextDouble();

    System.out.printf("%2s%24s","|","Enter Mid-Term Grade: ");
      double gradeMidterm = input.nextDouble();

    System.out.printf("%2s%26s","|","Enter Final Exam Grade: ");
      double gradeFinalExam = input.nextDouble();
      System.out.printf("%2s%n","|");
      System.out.printf("%2s%n","|");
      System.out.printf("%2s%n","|");
    //Compute Final Grade and print
    double finalGrade = (gradeActivities*weightActivities)+(gradeHW*weightHW)+(gradeQuiz*weightQuiz)+(gradeMidterm*weightMidterm)+(gradeFinalExam*weightFinalExam);
    System.out.printf("%2s%15s%2.2f%n","|","Final Grade: ",finalGrade);


    System.out.printf("%s%n"," ------------------------------------------------------------------------");


    System.out.printf("%s%n"," ------------------------------------------------------------------------");


  }
}
