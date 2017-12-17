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
public class Brand {
	private String brandName;
        private ArrayList<IProducts> brandProduct = new ArrayList<IProducts>();
	
        public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public ArrayList<IProducts> getBrandProduct() {
		return brandProduct;
	}
	public void setBrandProduct(ArrayList<IProducts> brandProduct) {
		this.brandProduct = brandProduct;
	}
	public void addProducttoBrand(IProducts product)
	{
		brandProduct.add(product);
	}
	
}
