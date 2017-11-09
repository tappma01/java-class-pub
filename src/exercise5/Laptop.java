package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author yasiro01
 */
public class Laptop {
  private String manufacturer;
  private double price;
  private String color;
  
  public Laptop(String manufacturer, double price, String color){
      this.manufacturer = manufacturer;
      this.price = price;
      this.color = color;
  }
  
  public String getManufacturer(){
        return manufacturer;
    }
  
  public double getPrice(){
        return price;
    }
  
  public String getColor(){
        return color;
    }
  
  public void setPrice(double newPrice){
      price = newPrice;
  }
  public void setColor(String newColor){
      color = newColor;
  }
}