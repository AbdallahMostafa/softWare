/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Customer extends User {

   private ArrayList<Voucher> vouchercards=new ArrayList<Voucher>();
    /*
   private ICart shoppingcart;
   public PaymentMethods myPaymentMethods;
   public PaymentMethods myPaymentMethods;

  public void additemstocart(IProducts cartitem) {
  }
 
 
  public void checkingout(Paymethod method) 
  {
  }

  public Paymethod choosepaymentmethod() {
  return null;
  }

  public Complaint fillcomplaint() {
  return null;
  }
*/
   public ArrayList<Voucher> getvoucher()
   {
       return vouchercards;
   }
   public void setvoucher(ArrayList<Voucher> voucher)
   {
       vouchercards=voucher;
   }
   public void suggestProduct(IProducts product)
   {
            
            ProductRequest request = new ProductRequest();
            Scanner cin= new Scanner(System.in);
            request.setname(cin.next());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            Admin.suggestedProduct.add(request);
   }
}