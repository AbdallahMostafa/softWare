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
public class PremiumStoreOwner extends User {
     private Store store;
/*
  public Double totalmoney;

    public Vector  my+Store;

  public ProductRequest suggestproducts() {
  return null;
  }

  public void getmoney() {
  }

  public StoreRequest createstore() {
  return null;
  }

  public Complaint fillcomplaint() {
  return null;
  }
*/

    public Store getstore()
    {
        return store;
    }
    public void setStore(Store store)
    {
        this.store=store;
    }
    public int getproductviews(String ID) //zyadaa
    {
        for(int i=0 ; i<store.getproducts().size();i++)
        {
            if(store.getproducts().get(i).getID().equals(ID))
            {
                return store.getproducts().get(i).getViews();
            }
        }
        System.out.println("product not found.");
        return 0;
    }
    public ArrayList<IProducts> mostviewedproduct() //zyaadaa
    {
        int max=Integer.MIN_VALUE;
        ArrayList<IProducts> mostviewed=new ArrayList<IProducts>();
        for(int i=0 ; i<store.getproducts().size();i++)
        {
            if(store.getproducts().get(i).getViews()>max)
            {
                max=store.getproducts().get(i).getViews();
            }
        }
        for(int i=0 ; i<store.getproducts().size();i++)
        {
            if(store.getproducts().get(i).getViews()==max)
            {
                mostviewed.add(store.getproducts().get(i));
            }
        }
        return mostviewed;
    }
    public void addstore(Store store)
    {  
        StoreRequest request = new StoreRequest();
        Scanner cin= new Scanner(System.in);
        request.setname(cin.next());
        request.setsender(this);
        request.setdesc(cin.nextLine());
        request.setStore(store);
        StoreDatabase.appendingStores.add(request);
    }
    public void suggestProduct(IProducts product)
    {
            
            ProductRequest request = new ProductRequest();
            Scanner cin= new Scanner(System.in);
            request.setname(cin.next());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            ProductDatabase.suggestedProduct.add(request);
    }
    public void premiumStoreOwnerView()
    {
        Scanner cin=new Scanner(System.in);
        String choice;
        while(true)
        {
            System.out.println("Make your choice: ");
            System.out.println("1.Suggest products\n2.View stores\n3.Add store\n4.Add products to store\n-1. Sign out");
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
            else if(choice.equals("3"))
            {
                Store store=new Store();
                System.out.println("Enter store name, address, phone number :");
                store.setname(cin.next());
                store.setaddress(cin.nextLine());
                store.setnumber(cin.next());
                store.setowner(this);
                addstore(store);
            }
            else if(choice.equals("4"))
            {
                store.addproduct();
            }
            else if(choice.equals("-1"))
                break;
            else
                System.out.println("Enter valid input.");
                
        }
    }
}
 