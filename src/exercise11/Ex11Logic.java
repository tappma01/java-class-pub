package exercise11;

import java.util.Collection;
import java.util.Iterator;

/**
 * Exercise 11 logic
 * @author yasiro01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
    public <T> int strLen(T item){
        String item2 = item.toString();
        return item2.length();
    }
  // TODO: Implement method strLen
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
    public <T extends Comparable> T greater(T item1, T item2, T item3) {
        if (item1.compareTo(item2) >= 0) {
            if(item1.compareTo(item3) >= 0){
                return item1;
            }
        }
        if(item2.compareTo(item1) >= 0) {
            if(item2.compareTo(item3) >= 0){
                return item2;
            }
        }
        
        return item3;
    }
    
    
  // TODO: Implement method greater
  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  static <S, T extends Iterable<S>> void printList(T list){
      System.out.print(list.toString());
      System.out.print(" ");
      
  }
  // TODO: Implement method printList
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  
    private <T> T lessThan(T i, T j) {
    T min = i;
    if(min.hashCode() > j.hashCode()){
        min = j;
    }
    return min;
    }
  
  public <T> T findMinItem(T list) {
      Collection<T> list1 = (Collection<T>) list;
      Iterator<T> num = list1.iterator();
      T minimum = num.next();
      Iterator<T> it = list1.iterator();
      for (int i = 0; i < list1.size(); i++){
          T value = it.next();
          minimum = this.lessThan(minimum, value);
      }
      return minimum;
            
  // TODO: Implement method findMinItem
}


}
  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
    class Foo <T, U> {
        private T fuzz;
        private U buzz;

    public Foo(T fuzz, U buzz) {
        this.fuzz = fuzz;
        this.buzz = buzz;
    }

    public T getFuzz() {
        return fuzz;
    }

    public U getBuzz() {
        return buzz;
    }

    public void setFuzz(T fuzz) {
        this.fuzz = fuzz;
    }

    public void setBuzz(U buzz) {
        this.buzz = buzz;
    }

    @Override
    public String toString() {
        return "Foo{" + "fuzz=" + fuzz + ", buzz=" + buzz + '}';
    }
        
    }

  // TODO: Implement class Foo
