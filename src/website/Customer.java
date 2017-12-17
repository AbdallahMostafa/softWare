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
            System.out.println("Now you need to make a request, enter it's name and description please: ");
            request.setname(cin.nextLine());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            ProductDatabase.suggestedProduct.add(request);
            System.out.println("Done.");
   }
   public void customerView()
   {
        Scanner cin=new Scanner(System.in);
        String choice;
        while(true)
        {
            System.out.println("Make your choice: ");
            System.out.println("1.Suggest products\n2.View stores\n-1. Sign out");
            choice=cin.next();
            if(choice.equals("1"))
            {
                IProducts product=new Products();
                System.out.println("Enter product name, brand: ");
                product.setname(cin.next());
                product.setbrand(cin.next());
                suggestProduct(product);
            }
            else if(choice.equals("2"))
            {
                int number;
                for(int i=0 ;i<StoreDatabase.stores.size();i++)
                {
                    System.out.println(i+1+".Store name: "+StoreDatabase.stores.get(i).getname()+"\nOwner: "+StoreDatabase.stores.get(i).getowner().getname());
                    System.out.println("------------------------");
                }
                while(true)
                {
                    System.out.println("Enter store number to view products: ");
                    number=cin.nextInt();
                    if(number>0 && number<=StoreDatabase.stores.size())
                    {
                        StoreDatabase.stores.get(number-1).printproducts();
                    }
                }
            }
            else if(choice.equals("-1"))
                break;
            else
                System.out.println("Enter valid input.");
                
        }
        
   }
}