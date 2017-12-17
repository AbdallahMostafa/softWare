/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package website;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class UserDatabase {
    public static ArrayList<Customer> Customers=new ArrayList<Customer>();
    public static ArrayList<Admin> Admins=new ArrayList<Admin>();
    public static ArrayList<StoreOwner> StoreOwners=new ArrayList<StoreOwner>();
    public static ArrayList<PremiumStoreOwner> PremiumStoreOwners=new ArrayList<PremiumStoreOwner>();
    public static ArrayList<IUser> users=new ArrayList<IUser>();
    public static ArrayList<IUser> signedin=new ArrayList<IUser>();

}
