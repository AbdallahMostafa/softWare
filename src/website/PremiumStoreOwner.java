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
        Admin.appendingStores.add(request);
    }
    public void suggestProduct(IProducts product){
            
            ProductRequest request = new ProductRequest();
            Scanner cin= new Scanner(System.in);
            request.setname(cin.next());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            Admin.suggestedProduct.add(request);
        }
}
 