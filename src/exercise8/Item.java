package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;
  
  public Item (long id, String title, int quantity){
      this.id = id;
      this.title = title;
      this.quantity = quantity;
  }
  
  public void setQuantity(int newQuantity){
      this.quantity = newQuantity;
  }
  
  public long getId(){
      return id;
  }
  
  public String getTitle(){
      return title;
  }
  
  public long getQuantity(){
      return quantity;
  }
  
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    return (quantity > 0);
  }
  
  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkOut() {
    quantity++;
  }

  /**
   * Check in an item
   */
  public void checkIn() {
      quantity--;
  }
  
  @Override
  public String toString() {
      return (title + " has " + quantity + " copies left.");
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
