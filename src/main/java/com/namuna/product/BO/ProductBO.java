package com.namuna.product.BO;

import com.namuna.product.dto.Product;

public interface ProductBO {

	public void create(Product product);
	public Product findProduct(int id);
	
}
