package com.sfs.service;

import com.sfs.beans.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	public Product searchProduct(String pid);
	public int updateProduct(Product product);
	public int deleteProduct(String pid);
}
