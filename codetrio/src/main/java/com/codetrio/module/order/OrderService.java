package com.codetrio.module.order;

import java.util.List;
import java.util.Map;

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
	public List<OrderDto> selectOne(OrderDto orderDto) {
		return dao.selectOne(orderDto);
	}
	
	public List<OrderDto> selectTwo(OrderVo vo) {
		return dao.selectTwo(vo);
	}
	
	public List<OrderDto> selectThree(OrderVo vo) {
		return dao.selectThree(vo);
	}
	
	
	public int update(OrderDto orderDto) {
		return dao.update(orderDto);
	}
	
	public int updateOPList(OrderDto orderDto) {
		return dao.updateOPList(orderDto);
	}
	
	public int insert(OrderDto orderDto) {
		return dao.insert(orderDto);
	}
	
}
