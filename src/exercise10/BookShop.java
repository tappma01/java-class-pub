package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    protected ArrayList<Book> catalog;

  public BookShop() {
       this.catalog = new ArrayList<Book>();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      this();
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      try{
          String[] line;
          Book newBook;
          while (reader.ready()){
          line = reader.readLine().split(",");
          newBook = new Book(line[0],line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3]));
          catalog.add(newBook);
          }
      reader.close();
      
  }
      catch (IOException ex) {
          Logger.getLogger(BookShop.class.getName()).log(Level.SEVERE, null, ex);
          System.out.println("Error");
      }
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for(Book book: anotherBookShop.catalog){
          catalog.add(new Book(book));
      }
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
       for(Book bk: catalog){
           double originPrice = bk.getPrice();
           double newPercent = (100 - discountPercent) / 100;
           double newPrice = originPrice * newPercent;
           bk.setPrice(newPrice);
      }
  }
  
  public void printCatalog() {
      for(Book bk: catalog){
          System.out.println(bk);
      }
  }
  
  public void order(Comparator<Book> comp) {
      catalog.sort(comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }

}
