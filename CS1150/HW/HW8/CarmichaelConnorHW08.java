/*
 > Name: Connor Carmichael
 > Class: CS1150 (M/W)
 > Due: April 13, 2022
 > Assignment: #8
 > Description:
 >This program will create an array of Car objects, print out a table of each Car
 >obejct's name and price and print out the most Expensive car. Then the cars will
 >be added into a Dealership object and a table of the dealership's cars will be
 >printed out as well as its most Expensive car.
 */

public class CarmichaelConnorHW08{
  public static void main(String[] args) {
//create variables
    int highestIndex   = 0;
    double highestCost = 0;
//create list of car objects
    Car[] cars = new Car[8];
    cars[0] = new Car("Ford Mustang",     32800);
    cars[1] = new Car("Nissan Altima",    14500);
    cars[2] = new Car("Dodge Challenger", 19900);
    cars[3] = new Car("BMW X1",           32000);
    cars[4] = new Car("Tesla Model-S",    70300);
    cars[5] = new Car("Mini Convertable", 29000);
    cars[6] = new Car("Toyota Tacoma",    30500);
    cars[7] = new Car("Porsche Cayenne",  44500);
    Car mostExpensive;
//create Dealership object
    Dealership coolCars = new Dealership("Cool Cars", 100);

  //////////////////////
 ///////Car List///////
//////////////////////
  //Print table of car object name and prices
    System.out.printf("|****************************|%n");
    System.out.printf("%21s%n","List of Cars");
    System.out.printf("|****************************|%n%n");
    System.out.printf("------------------------------%n");
    System.out.printf("%s%22s%n", " Car", "Price");
    System.out.printf("------------------------------%n");

    for (int i = 0; i<cars.length; i++){
      System.out.printf("%c%-20s%.2f%n", ' ', cars[i].getName(), cars[i].getPrice());
    }

    //find the index for the most Expensive car
    for (int i = 0; i<cars.length; i++){
      if (cars[i].getPrice() > highestCost){
        highestCost  = cars[i].getPrice();
        highestIndex = i;
      }
    }

  //print out the most Expensive car name and price
    System.out.printf("%n------------------------------%n");
    System.out.printf("%24s%n","Most Expensive Car");
    System.out.printf("------------------------------%n");
    System.out.printf("%s%22s%n", " Car", "Price");
    System.out.printf(" - - - - - - - - - - - - - - -%n");
    System.out.printf("%c%-20s%.2f%n%n", ' ', cars[highestIndex].getName(), cars[highestIndex].getPrice());

  //////////////////////
 //////Dealership//////
//////////////////////
  //add cars to Dealership
    for (int i = 0; i<cars.length; i++){
      coolCars.addCar(cars[i]);
    }

  //print table of cars in Dealership
    coolCars.displayCars();

  //find most Expensive car and print out its name and price
    mostExpensive = coolCars.mostExpensiveCar();
    System.out.printf("%n------------------------------%n");
    System.out.printf("%22s%s%n","Most Expensive Car at ", coolCars.getName());
    System.out.printf("------------------------------%n");
    System.out.printf("%s%22s%n", " Car", "Price");
    System.out.printf(" - - - - - - - - - - - - - - -%n");
    System.out.printf("%c%-20s%.2f%n", ' ', mostExpensive.getName(), mostExpensive.getPrice());

  }//main
}//Hw08


class Car{
  private String name;
  private double price;

//Car constructor
  public Car (String name, double price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return name;
  }

  public double getPrice(){
    return price;
  }
}//Car


class Dealership{
  private String name;
  private Car[] cars;
  private int numCars;

//Dealership constructor
  public Dealership(String name, int maxNumCars){
    this.name = name;
    this.cars = new Car[maxNumCars];
    numCars = 0;
  }

  public String getName(){
    return name;
  }

//add a car to cars index and increment numCars
  public void addCar(Car carToAdd){
    if (numCars < cars.length){
      cars[numCars] = carToAdd;
      numCars++;
    }
  }

//loop through each car and find the index for the most Expensive cars
// return: mostExpensiveCar
  public Car mostExpensiveCar(){
    double highestCost = 0;
    int highestIndex = 0;
    for (int i = 0; i<cars.length; i++){
      if (cars[i] != null){
        if (cars[i].getPrice() > highestCost){
          highestCost = cars[i].getPrice();
          highestIndex = i;
        }
      }
    }

    Car mostExpensive = cars[highestIndex];
    return mostExpensive;
  }

//print out a table of cars in Dealership
  public void displayCars(){
    //Print table of car object name and prices
    System.out.printf("%n|****************************|%n");
    System.out.printf("%s%s%s%n"," Cars at ", name, " Dealership");
    System.out.printf("|****************************|%n%n");
    System.out.printf("------------------------------%n");
    System.out.printf("%s%22s%n", " Car", "Price");
    System.out.printf("------------------------------%n");

    for (int i = 0; i<cars.length; i++){
      if (cars[i] != null){
        System.out.printf("%c%-20s%.2f%n", ' ', cars[i].getName(), cars[i].getPrice());
      }
    }
  }
}//Dealership
