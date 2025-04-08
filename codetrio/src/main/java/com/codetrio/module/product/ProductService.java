package com.codetrio.module.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
		public int selectCount(ProductVo vo) {
			return productDao.selectCount(vo);
		}
		public List<ProductDto> productList(ProductVo vo){
			return productDao.productList(vo);
		}
}
