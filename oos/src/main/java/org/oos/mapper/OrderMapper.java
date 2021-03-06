package org.oos.mapper;

import java.util.List;
import java.util.Map;

import org.oos.domain.OrderVO;

public interface OrderMapper {
	
	public List<OrderVO> getList(Map<String, Object> map);
	
	public int count(Map<String, Object> map);
	
	public OrderVO get(Long ono);
	
	public int insert(OrderVO vo);
	
	public int modify(OrderVO vo);
	
	public int delete(Long ono);
}
