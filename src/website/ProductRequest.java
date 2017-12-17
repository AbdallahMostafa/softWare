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
public class ProductRequest extends Request{
    private IProducts product;

    public ProductRequest()
    {
        product=new Products();
    }
    public void setProduct(IProducts product)
    {
        this.product=product;
    }
    public IProducts getProduct()
    {
        return product;
    }
}
