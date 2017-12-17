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
    public static ArrayList<IUser> users=new ArrayList<IUser>();
    public static ArrayList<IUser> signedin=new ArrayList<IUser>();
    public static ArrayList<Brand> brands = new ArrayList<Brand>();
    public static ArrayList<IProducts> products = new ArrayList<IProducts>();
    public static ArrayList<Store> stores=new ArrayList<Store>();
    public static void customerView()
    {
        
    }
    public synchronized static void signout(IUser user)
    {
        for(int i=0 ; i<signedin.size() ;i++)
        {
            if(user.getusername().equals(signedin.get(i)))
            {
                signedin.remove(i);
                break;
            }
        }
    }
    public static void login()
    {
        String username, password;
        System.out.println("Enter username and password: ");
        Scanner cin=new Scanner(System.in);
        username=cin.next();
        password=cin.next();
        for(int i=0 ; i<users.size();i++)
        {
            if(users.get(i).getusername().equals(username) && users.get(i).getpassword().equals(password))
            {
                System.out.println("Signed in.");
                signedin.add(users.get(i));
                return;
            }
        }
        System.out.println("Username or password is not correct.");
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
        for(int i=0 ;i<users.size() ; i++)
        {
            if(username.equals(users.get(i).getusername()) || email.equals(users.get(i).getemail()))
            {
                System.out.println("Username or email is already used.");
                return;
            }
        }
        if(type.equals("customer"))
        {
            IUser temp=new Customer();
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setgender(gender);
            temp.setage(age);
            users.add(temp);
        }
        else if(type.equals("storeOwner"))
        {
            IUser temp=new StoreOwner();
            temp.setemail(email);
            temp.setpassword(password);
            temp.setusername(username);
            temp.setage(age);
            temp.setgender(gender);
            users.add(temp);
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
           System.out.println("1.Sign up\n2.Sign in");
           choice=cin.next();
           if(choice.equals("1"))
           {
               register();
           }
           else if(choice.equals("2"))
           {
               login();
           }
           else
               System.out.println("Invalid input.");
       }
       
    }
    
}
