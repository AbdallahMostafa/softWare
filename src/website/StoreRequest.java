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
public class StoreRequest extends Request {
    private Store store;
    public void setStore(Store store)
    {
        this.store=store;
    }
    public Store getStore()
    {
        return store;
    }
}