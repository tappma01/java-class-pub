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
  public void testTask1(){
      System.out.println("Task1");
      Integer i = 2;
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 4;
      Integer result = instance.task1(i);
      assertEquals(expected, result);
      i = 7;
      expected = 14;
      result = instance.task1(i);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask2(){
      System.out.println("Task2");
      String i = "Maxwell";
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 7;
      Integer result = instance.task2(i);
      assertEquals(expected, result);
      i = "Tapp";
      expected = 4;
      result = instance.task2(i);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask3(){
      System.out.println("Task3");
      Character i = 'M';
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 77;
      Integer result = instance.task3(i);
      assertEquals(expected, result);
      i = 'T';
      expected = 84;
      result = instance.task3(i);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask4(){
      System.out.println("Task4");
      String i = "Maxwell";
      Ex4Driver instance = new Ex4Driver();
      Character expected = 'M';
      Character result = instance.task4(i);
      assertEquals(expected, result);
      i = "Tapp";
      expected = 'T';
      result = instance.task4(i);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask5(){
      System.out.println("Task5");
      Integer i = 7;
      Integer j = 6;
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 13;
      Integer result = instance.task5(i, j);
      assertEquals(expected, result);
      i = 11;
      j = 3;
      expected = 14;
      result = instance.task5(i, j);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask6(){
      System.out.println("Task6");
      String i = "Maxwell";
      Integer j = 2;
      Ex4Driver instance = new Ex4Driver();
      Character expected = 'x';
      Character result = instance.task6(i, j);
      assertEquals(expected, result);
      i = "Tapp";
      j = 3;
      expected = 'p';
      result = instance.task6(i, j);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask7(){
      System.out.println("Task7");
      Integer[] i = {1, 2, 3, 4, 5};
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 5;
      Integer result = instance.task7(i);
      assertEquals(expected, result);
      Integer[] j = {6, 7, 8, 9};
      expected = 4;
      result = instance.task7(j);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask8(){
      System.out.println("Task8");
      Integer[] i = {1, 2, 3, 4, 5};
      Integer m = 5;
      Ex4Driver instance = new Ex4Driver();
      boolean expected = true;
      boolean result = instance.task8(i, m);
      assertEquals(expected, result);
      Integer[] j = {6, 7, 8, 9};
      m = 7;
      expected = false;
      result = instance.task8(j, m);
      assertEquals(expected, result);
  }
  
  @Test
  public void testTask9(){
      System.out.println("Task9");
      String[] i = {"Maxwell", "Michael", "Tapp"};
      Ex4Driver instance = new Ex4Driver();
      Integer expected = 3;
      Integer result = instance.task9(i);
      assertEquals(expected, result);
      String[] j = {"Maxwell", "Tapp"};
      expected = 2;
      result = instance.task9(j);
      assertEquals(expected, result);
  }
  
  
}
