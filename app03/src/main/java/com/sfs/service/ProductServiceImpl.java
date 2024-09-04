package com.sfs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.sfs.beans.Product;
import com.sfs.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public Product saveProduct(Product product) {
		Product saveProduct = repository.save(product);
		return saveProduct;
	}

	@Override
	public Product searchProduct(String pid) {
		Product searchP = repository.findProductByPid(pid);
		return searchP;
	}

	@Override
	public int updateProduct(Product product) {
		int rowCount = repository.updateProduct(
				product.getPid(),
				product.getPname(),
				product.getPcost()
				);
		return rowCount;
	}

	@Override
	public int deleteProduct(String pid) {
		int rowCount = repository.deleteProductByPid(pid);
		return rowCount;
	}

	

}
