package com.kavya.product.bo;

import com.kavya.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
