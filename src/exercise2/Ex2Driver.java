package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yasiro01
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      System.out.println(nheads(n));
    //throw new UnsupportedOperationException("Task 1 is not implemented yet.");
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      for(int i=0; i < arr.length ; i++){
          if (n < arr[i]){
              return false;
          }
      }
      return true;
         
    //throw new UnsupportedOperationException("Task 2 is not implemented yet.");
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      int count = 0;
      for(int i=0; i < arr.length ; i++){
          if (arr[i] < threshold){
              count++;
          }
      }
      return count;
    //throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      int num1 = 0;
      for (int i = 0; i < arr.length ; i++){
           
          int num2 = arr[i];
          if (num2 > num1){
              num1 = num2;
          }
      }
          
      
      int num3 = 100 - num1;
      for (int j = 0; j < arr.length ; j++){
          arr[j] += num3;
      }
      for(int k:arr){
          System.out.printf("%d ", k);
      }
    //throw new UnsupportedOperationException("Task 4 is not implemented yet.");
  }
  
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      int Acount = 0;
      int Bcount = 0;
      int Ccount = 0;
      int Dcount = 0;
      int Fcount = 0;
      
      for (int i = 0; i < arr.length ; i++){
           
          if (arr[i] >=90){
              Acount++;
          }
          else if (arr[i] >=80){
              Bcount++;
          }
          else if (arr[i] >=70){
              Ccount++;
          }
          else if (arr[i] >=60){
              Dcount++;
          }
          else{
              Fcount++;
          }
          
      }
      System.out.printf("A: %d %n", Acount);
      System.out.printf("B: %d %n", Bcount);
      System.out.printf("C: %d %n", Ccount);
      System.out.printf("D: %d %n", Dcount);
      System.out.printf("F: %d %n", Fcount);
    //throw new UnsupportedOperationException("Task 5 is not implemented yet.");
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    Scanner keyboard = new Scanner(System.in);
    
        int x = 1;
        System.out.println("You will stop adding when you enter 0");
        while(x != 0){
        System.out.println("Enter a number:");
        x = keyboard.nextInt();
        double y = x;
        if (x != 0){
        arr.add(y);
        }
        else{
            break;
        }
        }
        System.out.print(arr);
        
    //throw new UnsupportedOperationException("Task 6 is not implemented yet.");
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7(){
    Random rnd = new Random();
    rnd.setSeed(100);
  
    ArrayList<Integer> arr = new ArrayList();
    for (int i = 0; i < 10; i++) {
      arr.add(rnd.nextInt(50) + 50);
  }
    System.out.println(arr);
    //throw new UnsupportedOperationException("Task 7 is not implemented yet.");
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    int count = 0;
    for(int i = 0; i < arrLst.size(); i++){
        if(arrLst.get(i) < threshold){
            count++;
        }
    }
    return count;
    //throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
      int[][] x = new int [10][10];
    for(int hor = 0; hor < x.length; hor++){
        for(int vert = 0; vert < x[0].length; vert++){
            x[hor][vert] = (hor+1) * (vert+1);
        }
    }
    return x;
    //throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
      int[] columnSum = new int[matrix[0].length];
    int sum = 0;
    for (int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[0].length; j++){
            sum += matrix[i][j];
            columnSum[j] += matrix[i][j];
        }
        System.out.printf("The sum of rom %d is %d%n",i + 1, sum);
        sum = 0;
    }
    int column = 1;
    for(int k: columnSum){
        System.out.printf("The sum of column %d is %d%n",column, k);
        column++;
  }
    //throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }
  private static int nheads(int n) {
      Random rnd = new Random();
      rnd.setSeed(100);
      int count = 0;
      int flip = 1;
      while (count < n){
          flip = rnd.nextInt(2);
          if (flip == 0){
              System.out.println("heads");
              count++;
          }
          else{
              System.out.println("tails");
              count = 0;
          }
        }
      return count;
}
}
