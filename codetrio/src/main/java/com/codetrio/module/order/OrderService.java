package com.codetrio.module.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderDao dao;
	
	public List<OrderDto> selectList(OrderVo vo) {
		return dao.selectList(vo);
	}

	public int selectOneCount(OrderVo vo) {
		return dao.selectOneCount(vo);
		
	}
	public OrderDto selectOne(OrderDto orderDto) {
		return dao.selectOne(orderDto);
	}
	
	public int update(OrderDto orderDto) {
		return dao.update(orderDto);
	}
	
	public int insert(OrderDto orderDto) {
		return dao.insert(orderDto);
	}
	
}
