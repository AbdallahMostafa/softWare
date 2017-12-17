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
public class Voucher {

  private String ID;
  private Float balance;
  public  String getID() {
  return ID;
  }

  public Float getbalance() {
  return balance;
  }
  public void setID(String ID){
      this.ID=ID;
  }

  public void setbalance(Float balance) {
      this.balance=balance;
  }
}
