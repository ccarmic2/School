/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: Jan 26, 2022
 > Assignment: #1
 > Description:
 > This Program will print out a couple paragraphs that describe my passions, and
 > print out a table of calculation for the surface area and volume for a sphere,
 > cylinder, and cone. All of the answers will be calcuated in the program.
 */

public class CarmichaelConnorAssignment1 {
  public static void main(String[] args) {

    //Declaring Constants for the Sphere, Cone, and Cylinder Calculations
    final double pi = 3.14;
    final double radius = 2;
    final double height = 3;
    final double side = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));


//----------------------------------------------------------------------------------------------------
//Begin Paragraphs About Me
    // Paragraph #1
    System.out.println("    Hey I'm Connor. I am currently working on my degree for Computer");
    System.out.println("Science. I guess I've been passionate about computers for a while.");
    System.out.println("I built my first desktop in 8th grade, and I have been maintaining it");
    System.out.println("ever since. Programming has interested me for a while, and I've dabbled");
    System.out.println("with some languages before. Despite my interset, I never put in enough");
    System.out.println("time to become proficient.");

    //Paragraph #2
    System.out.println("    When I am not studying, I enjoy hanging out with friends, playing");
    System.out.println("video games, and hiking. Lately I have been trying to learn Linux. I've");
    System.out.println("tried to pick it up before, but this time I think I am finally getting the");
    System.out.println("hang of it. I no longer dread using the terminal, and I actually enjoy");
    System.out.println("interfacing with it now. \n \n"); //end Paragraph and create 2 new lines
//----------------------------------------------------------------------------------------------------

//Begin Calculation Table
    //Calculation Table Titles
    System.out.println("----------------------------------------------------------");
    System.out.println("Calculate Volume and Surface Area");
    System.out.println("pi = 3.14    radius = 2    height = 3");
    System.out.println("----------------------------------------------------------");
    System.out.println("Shape     |            Volume            |   Surface Area");
    System.out.println("----------------------------------------------------------");

//Begin Calculations
    //Calculations for Sphere
    System.out.print("Sphere    | ");
      //Sphere Volume
    System.out.print(4/3f * pi * Math.pow(radius, 3)); System.out.print("  | ");
      //Sphere Surface area and using "\n" to create a new line
    System.out.print(4 * pi * Math.pow(radius, 2)); System.out.print("\n");


    //Calculations for Cylinder
    System.out.print("Cylinder | ");
      //Cylinder Volume and spacing out the divider so it lines up with the Surface Area column
    System.out.print(pi * Math.pow(radius, 2) * height); System.out.print("                          | ");
      //Cylinder Surface area
    System.out.print((2 * pi * Math.pow(radius, 2)) + (2 * pi * radius * height)); System.out.print("\n");


    //Calculations for Cone
    System.out.print("Cone       | ");
      //Cone Volume
    System.out.print(1/3f * pi * Math.pow(radius, 2) * height); System.out.print(" | ");
      //Cone Surface Area
    System.out.print((pi * radius * side) + (pi * Math.pow(radius, 2))); System.out.print("\n");

  }//main method
}//CarmichaelConnorAssignment1 class
