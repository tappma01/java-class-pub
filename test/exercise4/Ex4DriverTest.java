/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void TesTask1(){
      System.out.println("task1");
      Integer i = 10;
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 20;
      Integer result = instance.task1(i);
      assertEquals(expResult, result);
      i = 30;
      expResult = 60;
      result = instance.task1(i);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask2(){
      System.out.println("task2");
      String s = "yes";
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 3;
      Integer result = instance.task2(s);
      assertEquals(expResult, result);
      s = "no";
      expResult = 2;
      result = instance.task2(s);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask3(){
      System.out.println("task3");
      char c = 'a';
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 97;
      Integer result = instance.task3(c);
      assertEquals(expResult, result);
      c = 'g';
      expResult = 103;
      result = instance.task3(c);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask4(){
      System.out.println("task4");
      String s = "finger";
      Ex4Driver instance = new Ex4Driver();
      Character expResult = 'f';
      Character result = instance.task4(s);
      assertEquals(expResult, result);
      s = "wow";
      expResult = 'w';
      result = instance.task4(s);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask5(){
      System.out.println("task5");
      Integer i = 10;
      Integer j = 2;
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 12;
      Integer result = instance.task5(i,j);
      assertEquals(expResult, result);
      i = 30;
      j = 2;
      expResult = 32;
      result = instance.task5(i,j);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask6(){
      System.out.println("task6");
      String s = "Maxwell";
      Integer i = 3;
      Ex4Driver instance = new Ex4Driver();
      Character expResult = 'w';
      Character result = instance.task6(s,i);
      assertEquals(expResult, result);
      s = "Tapp";
      i = 2;
      expResult = 'p';
      result = instance.task6(s,i);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask7(){
      System.out.println("task7");
      Integer[] arr = {4, 5, 6, 7, 8};
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 5;
      Integer result = instance.task7(arr);
      assertEquals(expResult, result);
      Integer[] x = {2, 3, 4};
      expResult = 3;
      result = instance.task7(x);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask8(){
      System.out.println("task8");
      Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
      Integer i = 1;
      Ex4Driver instance = new Ex4Driver();
      Boolean expResult = false;
      Boolean result = instance.task8(arr,i);
      assertEquals(expResult, result);
      Integer[] x = {8, 9};
      i = 2;
      expResult = true;
      result = instance.task8(x, i);
      assertEquals(expResult, result);
  }
  
  @Test
  public void TestTask9(){
      System.out.println("task9");
      String[] arr = {"Maxwell", "Michael", "Tapp"};
      Ex4Driver instance = new Ex4Driver();
      Integer expResult = 3;
      Integer result = instance.task9(arr);
      assertEquals(expResult, result);
      String[] x = {"Maxwell", "Tapp"};
      expResult = 2;
      result = instance.task9(x);
      assertEquals(expResult, result);
  }
}
