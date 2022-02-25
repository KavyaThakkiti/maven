package com.kavya.product.bo;

import com.kavya.product.dao.ProductDAO;
import com.kavya.product.dao.ProductDAOImpl;
import com.kavya.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
