package com.codetrio.module.product;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {
	public int selectCount(ProductVo vo);
	public List<ProductDto> productList(ProductVo vo);
	
}
