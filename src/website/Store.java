/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author lenovo
 */
public class Store {

  private String name;
  private String Address;
  private IUser candidateOwner;
  private String phoneNo;
  private ArrayList<IProducts> products=null;
  private Boolean verified;
  private int StoreID;

    /**
   * 
   * @element-type Main
   */
  
  Store()
  {
      products=new ArrayList<IProducts>();
  }
  public void setproduct(IProducts product)
  {
      products.add(product);
  }
  public ArrayList<IProducts> getproducts()
  {
      return products;
  }
  public void setname(String name)
  {
      this.name=name;
  }
  public String getname()
  {
      return name;
  }
  
  public void changestoreinfo() {
  }

  /*public Request addproducts(Product product) {
  return null;
  }*/


  public void completeproduct(IProducts product)
  {
      Scanner cin=new Scanner(System.in);
      System.out.println("Enter product quantity and price: ");
      product.setQuantity(cin.nextInt());
      product.setprice(cin.nextFloat());
      products.add(product);
  }
  public void addproduct(ArrayList<IProducts> product)
  {
      for(int i=0  ;i<product.size();i++)
      {
          System.out.println(i+1+". "+product.get(i).getname());
      }
      System.out.println("To add product to stores enter the number. Or -1 to exit menu: ");
      Scanner cin=new Scanner(System.in);
      while(true)
      {
        String choice=cin.next();
        int Intchoice=Integer.parseInt(choice);
        if(Intchoice>0 && Intchoice<=products.size())
             completeproduct(products.get(Intchoice-1));
        else if(choice.equals("-1"))
             break;
        else
             System.out.println("Invalid input");
      }
  }
  public void printproducts()
  {
      System.out.print("Store products are: ");
      for(int i=0 ; i<products.size();i++)
      {
          System.out.println(i+1+". "+products.get(i).getname());
      }
      System.out.println("To view product details enter the number. Or -1 to exit menu: ");
      Scanner cin=new Scanner(System.in);
      while(true)
      {
        String choice=cin.next();
        int Intchoice=Integer.parseInt(choice);
        if(Intchoice>0 && Intchoice<=products.size())
             products.get(Intchoice-1).printproduct();
        else if(choice.equals("-1"))
             break;
        else
             System.out.println("Invalid input");
      }
  }
  public void getMostOrderedProduct() {
  }

  public void Statistics() {
  }

  public int NumberOfUsersExplored() {
  return 0;
  }

  public int GetStoreID() {
  return 0;
  }

}