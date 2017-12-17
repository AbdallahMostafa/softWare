/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website;

/**
 *
 * @author lenovo
 */
public class Products implements IProducts{

  private String name;
  private String ID;
  private int views=0; 
  private Float Price;
  private int quantity;
  private String brand;

  public void printproduct()
  {
      System.out.println("Product name: "+getname()+"\n"+"Product Brand: "+getbrand()+"\n"+"Product Price: "+getprice());
      incViews();
  }
  
  public int getViews()
  { 
          return views;
  }
  public void incViews()
  {
      views++;
  }
  public String getID(){
  return ID;
  }

  public String getname() {
  return name;
  }

  public Float getprice() {
  return Price;
  }

  public int getQuantity() {
  return quantity;
  }

  public void setID(String ID) {
      this.ID=ID;
  }

  public void setname(String name) {
      this.name=name;
  }

  public void setprice(Float Price) {
      this.Price=Price;
  }

  public void setQuantity(int quantity) {
      this.quantity=quantity;
  }

  public void setbrand(String brand) {
      this.brand=brand;
  }

  public String getbrand() {
  return brand;
  }
/*
  public CartItem createitem() {
  return null;
  }
*/

}
