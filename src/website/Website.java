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
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setgender(gender);
            temp.setage(age);
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
