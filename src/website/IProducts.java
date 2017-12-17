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
public interface IProducts{
  public int getViews(); //zyaadaa
  public void incViews(); //zyaada
  public String getID();
   public void printproduct();

  public String getname();
  
  public Float getprice();

  public int getQuantity();

  public void setID(String ID);

  public void setname(String name);

  public void setprice(Float price);

  public void setQuantity(int quantity);

  public String getbrand();

  public void setbrand(String brand);
}
