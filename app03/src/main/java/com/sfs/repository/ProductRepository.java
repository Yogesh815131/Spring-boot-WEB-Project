package com.sfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sfs.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public Product findProductByPid(String pid);
	
	@Transactional
	@Modifying
	@Query("update Product set pname=:pname, pcost=:pcost where pid=:pid")
	public int updateProduct(String pid, String pname, int pcost);
	
	@Transactional
	public int deleteProductByPid(String pid);

}
