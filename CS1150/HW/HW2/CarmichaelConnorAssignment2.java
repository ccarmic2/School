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
    System.out.println(" |----------------------------------------------------------------------|");
    System.out.printf("%2s%44s%27s %n","|","Grade Calculator","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");

    //Prompt for input
      //Student Name
    System.out.printf("%26s","Enter Student's Name: ");
      String name = input.nextLine();

      //Grades prompts and Decarling Grade Catagory Variables
    System.out.printf("%37s","Enter Learning Activities Grade: ");
      double gradeActivities = input.nextDouble();

    System.out.printf("%26s","Enter Homework Grade: ");
      double gradeHW = input.nextDouble();

    System.out.printf("%22s","Enter Quiz Grade: ");
      double gradeQuiz = input.nextDouble();

    System.out.printf("%26s","Enter Mid-Term Grade: ");
      double gradeMidterm = input.nextDouble();

    System.out.printf("%28s","Enter Final Exam Grade: ");
      double gradeFinalExam = input.nextDouble();
      System.out.printf("%n%n"," ");

//-------------------------------------------------------------------------------
//Compute Final Grade and print
    double finalGrade = (gradeActivities*weightActivities)+(gradeHW*weightHW)+(gradeQuiz*weightQuiz)+(gradeMidterm*weightMidterm)+(gradeFinalExam*weightFinalExam);

    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%36s%s%n","Student: ",name);
    System.out.printf("%40s%2.2f%s%n","Final Grade: ",finalGrade,"%");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%s%n"," |//////////////////////////////////////////////////////////////////////|");   
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
//------------------------------------------------------------------------------
//Print out Grading Scale and Weighted Catagories
  //Titles
    System.out.printf("%-7s%-15s%-10s%4s%12s%20s%4s %n"," |"," Letter Grade","Percentage ","|","Catagory ","Weight","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    //The Grading Scale and Grading Weights data
    System.out.printf("%-7s%-15s%-10s%5s%23s%6s%7s %n"," |"," A ","94+    ","|","Learning Activites: ","10%","|");
    System.out.printf("%-7s%-15s%-10s%5s%13s%16s%7s %n"," |"," A-","93-90 ","|","Homwork:  ",          "40%","|");
    System.out.printf("%-7s%-15s%-10s%5s%13s%16s%7s %n"," |"," B+","89-87 ","|","Quizzes:  ",          "10%","|");
    System.out.printf("%-7s%-15s%-10s%5s%14s%15s%7s %n"," |"," B ","86-83 ","|","Mid-term:  ",         "20%","|");
    System.out.printf("%-7s%-15s%-10s%5s%16s%13s%7s %n"," |"," B-","82-80 ","|","Final Exam:  ",       "20%","|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," C+","79-77 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," C ","76-73 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," C-","72-70 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," D+","69-67 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," D ","66-63 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," D-","62-60 ","|",                             "|");
    System.out.printf("%-7s%-15s%-10s%5s%36s %n",       " |"," F ","59-0  ","|",                             "|");
    System.out.printf("%2s%35s%36s %n","|","|","|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");
    System.out.printf("%s%n"," |----------------------------------------------------------------------|");

  }//main method
}//class
