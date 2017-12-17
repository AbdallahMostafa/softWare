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
public class User implements IUser{

  private String name;
  private String ID;
  private String username;
  private String email;
  private int age;
  private String gender;
  private String passwrod;

  //public ICart myICart;
  
  public void setname(String name){
      this.name=name;
  }

  public void setid(String ID){
      this.ID=ID;
  }

  public void setpassword(String pw){
      passwrod=pw;
  }

  public void setusername(String username){
      this.username=username;
  }

  public void setemail(String email){
      this.email=email;
  }

  public void setgender(String gender){
      this.gender=gender;
  }

  public void setage(int age){
      this.age=age;
  }

  public String getname() {
  return name;
  }

  public String getID() {
  return ID;
  }

  public String getpassword(){
  return passwrod;
  }

  public String getusername(){
  return username;
  }

  public String getemail() {
  return email;
  }

  public String getgender() {
  return gender;
  }

  public int getage() {
  return age;
  }

  public void changeaccsettings() {
  }

  public void User(String name, String ID, String username, String email, int age, Character gender, String password) {
  }
  
  public void signout()
  {
      
  }
  public void exploreproduct(IProducts product)
  {
      System.out.println("Product name: "+product.getname()+"\n"+"Product Brand: "+product.getbrand()+"\n"+"Product Price: "+product.getprice());
      product.incViews();
  }

}