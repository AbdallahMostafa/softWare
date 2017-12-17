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
public class Website {

   // public static int ID=0;
   
    public synchronized static void signout(IUser user)
    {
        for(int i=0 ; i<UserDatabase.signedin.size() ;i++)
        {
            if(user.getusername().equals(UserDatabase.signedin.get(i)))
            {
                UserDatabase.signedin.remove(i);
                break;
            }
        }
    }
    public static IUser login()
    {
        String username, password, type;
        System.out.println("Enter username, password and type: ");
        Scanner cin=new Scanner(System.in);
        username=cin.next();
        password=cin.next();
        type=cin.next();
        if(type.equals("customer"))
        {
            for(int i=0 ; i<UserDatabase.Customers.size();i++)
            {
                if(UserDatabase.Customers.get(i).getusername().equals(username) && UserDatabase.Customers.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.Customers.get(i));
                    UserDatabase.Customers.get(i).customerView();
                    return UserDatabase.Customers.get(i);
                }
<<<<<<< HEAD
            }
            System.out.println("Username or password is not correct.");
        }
        else if(type.equals("storeowner"))
        {
            for(int i=0 ; i<UserDatabase.StoreOwners.size();i++)
            {
                if(UserDatabase.StoreOwners.get(i).getusername().equals(username) && UserDatabase.StoreOwners.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.StoreOwners.get(i));
<<<<<<< HEAD
                    UserDatabase.StoreOwners.get(i).storeOwnerView();
=======
                    //UserDatabase.StoreOwners.get(i).;
>>>>>>> Grana
                    return UserDatabase.StoreOwners.get(i);
                }
            }
            System.out.println("Username or password is not correct.");       
        }
        else if (type.equals("premiumstoreowner"))
        {
            for(int i=0 ; i<UserDatabase.PremiumStoreOwners.size();i++)
            {
                if(UserDatabase.PremiumStoreOwners.get(i).getusername().equals(username) && UserDatabase.PremiumStoreOwners.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.PremiumStoreOwners.get(i));
<<<<<<< HEAD
                    UserDatabase.PremiumStoreOwners.get(i).premiumStoreOwnerView();
                    return UserDatabase.PremiumStoreOwners.get(i);
                }
            }
            System.out.println("Username or password is not correct.");
        }
        else if(type.equals("admin"))
        {
            for(int i=0 ; i<UserDatabase.Admins.size();i++)
            {
                System.out.println(UserDatabase.Admins.get(i).getusername());
                if(UserDatabase.Admins.get(i).getusername().equals(username) && UserDatabase.Admins.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.Admins.get(i));
                    UserDatabase.Admins.get(i).adminview();
                    return UserDatabase.Admins.get(i);
                }
            }
            System.out.println("Username or password is not correct.");
        }
=======
                    //UserDatabase.PremiumStoreOwners.get(i).;
                    return UserDatabase.PremiumStoreOwners.get(i);
                }
            }
            System.out.println("Username or password is not correct.");
        }
=======
            }
            System.out.println("Username or password is not correct.");
        }
        else if(type.equals("storeowner"))
        {
            for(int i=0 ; i<UserDatabase.StoreOwners.size();i++)
            {
                if(UserDatabase.StoreOwners.get(i).getusername().equals(username) && UserDatabase.StoreOwners.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.StoreOwners.get(i));
                    //UserDatabase.StoreOwners.get(i).;
                    return UserDatabase.StoreOwners.get(i);
                }
            }
            System.out.println("Username or password is not correct.");       
        }
        else if (type.equals("premiumstoreowner"))
        {
            for(int i=0 ; i<UserDatabase.PremiumStoreOwners.size();i++)
            {
                if(UserDatabase.PremiumStoreOwners.get(i).getusername().equals(username) && UserDatabase.PremiumStoreOwners.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.PremiumStoreOwners.get(i));
                    //UserDatabase.PremiumStoreOwners.get(i).;
                    return UserDatabase.PremiumStoreOwners.get(i);
                }
            }
            System.out.println("Username or password is not correct.");
        }
>>>>>>> Grana
        else if(type.equals("admin"))
        {
            for(int i=0 ; i<UserDatabase.Admins.size();i++)
            {
                if(UserDatabase.Admins.get(i).getusername().equals(username) && UserDatabase.Admins.get(i).getpassword().equals(password))
                {
                    System.out.println("Signed in.");
                    UserDatabase.signedin.add(UserDatabase.Admins.get(i));
                    //UserDatabase.Admins.get(i).;
                    return UserDatabase.Admins.get(i);
                }
            }
            System.out.println("Username or password is not correct.");
        }
<<<<<<< HEAD
>>>>>>> Grana
=======
>>>>>>> Grana
        else
            System.out.println("Invalid type.");
        return null;
    }
    public static void register()
    {
        String username,password,email,gender,type;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your User Name: ");
        username = in.next();
        System.out.println("Enter Your mail: ");
        email = in.next();
        System.out.println("Enter Your user type: ");
        type = in.next();
        System.out.println("Enter Your Password: ");
        password = in.next();
        System.out.println("Enter Your Gender: ");
        gender = in.next();
        System.out.println("Enter Your Age: ");
        int age = in.nextInt();
        for(int i=0 ;i<UserDatabase.users.size() ; i++)
        {
            if(username.equals(UserDatabase.users.get(i).getusername()) || email.equals(UserDatabase.users.get(i).getemail()))
            {
                System.out.println("Username or email is already used.");
                return;
            }
        }
        if(type.equals("customer"))
        {
            Customer temp=new Customer();
<<<<<<< HEAD
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setgender(gender);
            temp.setage(age);
            temp.settype(type);
            UserDatabase.Customers.add(temp);
            UserDatabase.users.add(temp);
<<<<<<< HEAD
        }
        else if(type.equals("storeowner"))
        {
            StoreOwner temp=new StoreOwner();
=======
        }
        else if(type.equals("storeowner"))
        {
            StoreOwner temp=new StoreOwner();
=======
>>>>>>> Grana
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setage(age);
            temp.setgender(gender);
            temp.settype(type);
            UserDatabase.StoreOwners.add(temp);
            UserDatabase.users.add(temp);
        }
        else if(type.equals("premiumstoreowner"))
        {
            PremiumStoreOwner temp=new PremiumStoreOwner();
>>>>>>> Grana
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setage(age);
<<<<<<< HEAD
            temp.setgender(gender);
            temp.settype(type);
<<<<<<< HEAD
=======
            temp.settype(type);
            UserDatabase.Customers.add(temp);
            UserDatabase.users.add(temp);
        }
        else if(type.equals("storeowner"))
        {
            StoreOwner temp=new StoreOwner();
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setage(age);
            temp.setgender(gender);
            temp.settype(type);
>>>>>>> Grana
            UserDatabase.StoreOwners.add(temp);
            UserDatabase.users.add(temp);
        }
        else if(type.equals("premiumstoreowner"))
        {
            PremiumStoreOwner temp=new PremiumStoreOwner();
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setage(age);
            temp.setgender(gender);
            temp.settype(type);
<<<<<<< HEAD
=======
>>>>>>> Grana
=======
>>>>>>> Grana
            UserDatabase.PremiumStoreOwners.add(temp);
            UserDatabase.users.add(temp);
        }
        else
        {
            System.out.println("Enter valid user type.");
        }
        System.out.println("Registeration completed.");
    }
    
    public static void main(String[] args){ 
       Website temp=new Website();
       Admin admin = new Admin();
       admin.setusername("ali");
       admin.setage(20);
       admin.setemail("eshta@gmail.com");
       admin.setgender("M");
       admin.setid("10");
       admin.setpassword("pass");
       admin.settype("admin");
       
       UserDatabase.Admins.add(admin);
       System.out.println(UserDatabase.Admins.get(0).getname());
       Scanner cin=new Scanner(System.in);
       String choice;
       while(true)
       {
           System.out.println("1.Sign up\n2.Sign in\n-1.Exit");
           choice=cin.next();
           if(choice.equals("1"))
           {
               register();
           }
           else if(choice.equals("2"))
           {
               IUser user=login();
               if(user!=null)
                    signout(user);
           }
           else if(choice.equals("-1"))
               break;
           else
               System.out.println("Invalid input.");
       }
       
    }
    
}
