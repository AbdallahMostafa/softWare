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
public class BrandRequest extends Request {
    private Brand brand;
    public void setBrand(Brand brand)
    {
        this.brand=brand;
    }
    public Brand getBrand()
    {
        return brand;
    }}
