/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class StoreOwner extends User {

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

    public StoreOwner()
    {
       
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
            System.out.println("Enter request name and disc: ");
            request.setname(cin.nextLine());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            Admin.suggestedProduct.add(request);
        }
}