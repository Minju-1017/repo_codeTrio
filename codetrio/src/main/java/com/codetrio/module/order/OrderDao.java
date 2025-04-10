package com.codetrio.module.order;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
	
	public List<OrderDto> selectList(OrderVo vo);
	public int selectOneCount(OrderVo vo);
	public List<OrderDto> selectOne(OrderDto orderDto);
	public List<OrderDto> selectTwo(OrderVo vo);
	public List<OrderDto> selectThree(OrderVo vo);
	public int update(OrderDto orderDto);
	public int updateOPList(OrderDto orderDto);
	public int insert(OrderDto orderDto);

}
