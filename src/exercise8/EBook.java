package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author yasiro01
 */
public class EBook extends Book {
  private final String format;
  
  public EBook(String format, String author, int publishingYear, long id, String title, int quantity) {
      super(author, publishingYear, id, title, quantity);
      this.format = format;
  }
  
  @Override
  public void checkIn(){
      
  }
  
  @Override
  public void checkOut(){
      
  }
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  @Override
  public  String getInfo(){
      return (title + " was published in " + publishingYear + " and written by " + author);
  }
  
}
