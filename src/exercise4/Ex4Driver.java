package exercise4;

/**
 * @author yasiro01
 */
public class Ex4Driver {
  /* Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task1(Integer i){
    return i * 2;
}
  /* Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task2(String s){
    return s.length();
}
  /* Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task3(Character c){
    return (int)c;
}
 /* Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity. */
public Character task4(String s){
    return s.charAt(0);
}
  /* Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task5(Integer i, Integer j){
    return i + j;
}
  /* Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity. */
public Character task6(String s, Integer i){
    return s.charAt(i);
}
  /* Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task7(Integer[] arr){
    return arr.length;
}
  /* Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity. */
public Boolean task8(Integer[] arr, Integer i){
    return arr.length == i;
}
  /* Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
public Integer task9(String[] arr){
    return arr.length;
}
  /* Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity. */
//  public Integer task10(HashMap<>);
}
