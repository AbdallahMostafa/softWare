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
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Admin extends User {
<<<<<<< HEAD
<<<<<<< HEAD
        public void adminview()
        {
            Scanner cin=new Scanner(System.in);
        String choice;
        while(true)
        {
            System.out.println("Make your choice: ");
            System.out.println("1.View stores\n2.Add products to system\n3.Add brands to system\n4.Provide voucher cards\n5-Add Store to system\n-1.Sign out");
            choice=cin.next();
            if(choice.equals("1"))
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
                    }else
                        break;
                }
            }
            else if(choice.equals("2"))
            {
                addProductToSystem();
            }
            else if(choice.equals("3"))
            {
                addBrandToSystem();
            }
            else if(choice.equals("4"))
            {
                Customer customer=new Customer();
                Random rand=new Random();
                int temp=rand.nextInt(UserDatabase.Customers.size()-1);
                customer=UserDatabase.Customers.get(temp);
                providevouchercards(customer);
            }
            else if (choice.equals("5"))
            {
                addStoreToSystem();
            }
            else if(choice.equals("-1"))
                break;
            else
                System.out.println("Enter valid input.");
                
        }
        }
=======
>>>>>>> Grana
=======
>>>>>>> Grana
        public void addStoreToSystem()
        {
                Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) {
                        if(displayAppendingStore()==false)
                        {
                            System.out.println("No stores suggested.");
                        }
                    	System.out.println("Enter the number of store you want to approve: " +"\n" + "or enter (-1) to exit or (-2) to show products");
                        choice = scanner.nextInt();
			if(choice<=StoreDatabase.appendingStores.size() && choice > 0)
			{
				StoreDatabase.stores.add(StoreDatabase.appendingStores.get(choice-1).getStore());
                                StoreDatabase.appendingStores.remove(choice-1);
                                System.out.println("Done.");
			}
                        else if(choice==-1)
                            break;
                        else
                        {
                            System.out.println("This store does not exit! ");
                        }
		}
		scanner.close();
        }
        public boolean displayAppendingStore()
	{
                if(StoreDatabase.appendingStores.size()==0)
                    return false;
		for(int i = 0; i <StoreDatabase.appendingStores.size(); i++)
		{
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println((i+1) +"- Request sender :" +StoreDatabase.appendingStores.get(i).getname()+", ID:"+StoreDatabase.appendingStores.get(i).getsender().getID());
=======
			System.out.println((i+1) +"- Request sender :" +StoreDatabase.appendingStores.get(i).getsender().getname()+", ID:"+StoreDatabase.appendingStores.get(i).getsender().getID());
>>>>>>> Grana
=======
			System.out.println((i+1) +"- Request sender :" +StoreDatabase.appendingStores.get(i).getsender().getname()+", ID:"+StoreDatabase.appendingStores.get(i).getsender().getID());
>>>>>>> Grana
                        System.out.println("Store :" +StoreDatabase.appendingStores.get(i).getStore().getname()+" ");
		}
                return true;

	}
        public void addBrandToSystem()
	{
               
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true)
                {
                        if(displaySuggestedBrand()==false)
                        {
                            System.out.println("No brands suggested.");
                        }
                        System.out.println("Enter the number of brand you want to approve: " +"\n" + "or enter (-1) to exit or (-2) to show products");
                        choice = scanner.nextInt();
                        if(choice<=BrandDatabase.suggestedbrand.size() && choice > 0)
			{
				BrandDatabase.brands.add(BrandDatabase.suggestedbrand.get(choice-1).getBrand());
                                BrandDatabase.suggestedbrand.remove(choice-1);
                                System.out.println("Done.");
			}
			else if(choice==-1)
			{
				break;
                        }
                        else
                        {
                            System.out.println("Brand not found.");
                        }
		}
		scanner.close();
	}
	public boolean displaySuggestedBrand()
	{
                if(BrandDatabase.suggestedbrand.size()==0)
                    return false;
		for(int i = 0; i <BrandDatabase.suggestedbrand.size(); i++)
		{
                        System.out.println((i+1) +"- Request sender :" +BrandDatabase.suggestedbrand.get(i).getsender().getname()+", ID:"+BrandDatabase.suggestedbrand.get(i).getsender().getID());
                        System.out.println("Brand :" +BrandDatabase.suggestedbrand.get(i).getBrand().getBrandName()+" ");		}
                return true;
	}
        public boolean displaySuggetedProducts()
	{
                if(ProductDatabase.suggestedProduct.size()==0)
                    return false;
		for(int i = 0; i <ProductDatabase.suggestedProduct.size(); i++)
		{
                        System.out.println((i+1) +"- Request sender :" +ProductDatabase.suggestedProduct.get(i).getsender().getname()+", ID:"+ProductDatabase.suggestedProduct.get(i).getsender().getID());
                        System.out.println("Product name:" +ProductDatabase.suggestedProduct.get(i).getProduct().getname()+" ");		}
                return true;
	}
        public void addProductToSystem()
	{
               
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) 
                {
                        if(displaySuggetedProducts()==false)
                        {
                            System.out.println("No products suggested.");
                        }
                        System.out.println("Enter the number of product you want to approve: " +"\n" + "or enter (-1) to exit");
			choice=scanner.nextInt();
                        if(choice<=ProductDatabase.suggestedProduct.size() && choice > 0)
			{
				ProductDatabase.products.add(ProductDatabase.suggestedProduct.get(choice-1).getProduct());
                                ProductDatabase.suggestedProduct.remove(choice-1);
                                System.out.println("Done.");
			}
			else if(choice==-1)
			{
				break;
			}else
			{
                                System.out.println("This product does not exit! ");
			}
                         
		}
		scanner.close();
	}
        public void addproduct()
        {
            Scanner cin=new Scanner(System.in);
            IProducts product=new Products();
            System.out.println("Enter product name, brand: ");
            product.setname(cin.next());
            product.setbrand(cin.next());
            ProductDatabase.products.add(product);
        }
  /*public Request requests [];

  public Vector  my+Request;

  public void verifysotre(Store store) {
  }

  public void dealwithcomplaints(Request request) {
  }

  public void deleteproducts(Product product) {
  }

  public void addproducttosystem(Request request) {
  }
*/
    public void providevouchercards(Customer customer)
    {
        Voucher temp=new Voucher();
        System.out.println("Enter Voucher ID and balance: ");
        Scanner cin=new Scanner(System.in);
        temp.setID(cin.next());
        temp.setbalance(cin.nextFloat());
        customer.getvoucher().add(temp);
    }
}