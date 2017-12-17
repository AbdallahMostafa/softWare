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

    public void storeOwnerView()
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
<<<<<<< HEAD
<<<<<<< HEAD
                    else
                        break;
=======
>>>>>>> Grana
=======
>>>>>>> Grana
                }
            }
            else if(choice.equals("3"))
            {
                Store store=new Store();
                System.out.println("Enter store name, address, phone number :");
                store.setname(cin.next());
<<<<<<< HEAD
<<<<<<< HEAD
                store.setaddress(cin.next());
=======
                store.setaddress(cin.nextLine());
>>>>>>> Grana
=======
                store.setaddress(cin.nextLine());
>>>>>>> Grana
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
    public StoreOwner()
    {
       
    }
    public void addstore(Store store)
    {  
        if(this.store!=null)
            System.out.println("Store already exists.");
        StoreRequest request = new StoreRequest();
        Scanner cin= new Scanner(System.in);
        System.out.println("Now you need to make a request, enter it's name and description please: ");
<<<<<<< HEAD
<<<<<<< HEAD
        request.setname(cin.nextLine());
=======
=======
>>>>>>> Grana
        request.setname(cin.next());
>>>>>>> Grana
        request.setsender(this);
        request.setdesc(cin.nextLine());
        request.setStore(store);
        StoreDatabase.appendingStores.add(request);
        System.out.println("Done.");
    }
    public void suggestProduct(IProducts product)
    {
            
            ProductRequest request = new ProductRequest();
            Scanner cin= new Scanner(System.in);
            System.out.println("Enter request name and disc: ");
            request.setname(cin.nextLine());
            request.setsender(this);
            request.setdesc(cin.nextLine());
            request.setProduct(product);
            ProductDatabase.suggestedProduct.add(request);
    }
    
}