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
public interface IUser {

  public void settype(String type);
  
  public String gettype();
  
  public void setname(String name);

  public void setid(String ID);

  public void setpassword(String pw);

  public void setusername(String username);

  public void setemail(String email);

  public void setgender(String gender);

  public void setage(int age);

  public String getname();

  public String getID();

  public String getpassword();

  public String getusername();

  public String getemail();
  
  public String getgender();

  public int getage();

  public void changeaccsettings();

  public void exploreproduct(IProducts product); //zyada
}