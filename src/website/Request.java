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
public class Request {

  private String name;

  private String description;

  private IUser sender;


  public void setname(String name){
      this.name=name;
  }

  public void setdesc(String desc) {
      description=desc;
  }


  public void setsender(IUser sender) {
      this.sender=sender;
  }

  public String getname() {
  return name;
  }

  public String getdesc() {
  return description;
  }

  public IUser getsender() {
  return sender;
  }

  public void Request() {
  }

}
