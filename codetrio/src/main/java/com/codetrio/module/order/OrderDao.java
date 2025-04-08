package com.codetrio.module.order;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.codetrio.module.codegroup.CodeGroupDto;

@Repository
public interface OrderDao {
	
	public List<OrderDto> selectList(OrderVo vo);
	public int selectOneCount(OrderVo vo);
	public OrderDto selectOne(OrderDto orderDto);
	public int update(OrderDto orderDto);

}
