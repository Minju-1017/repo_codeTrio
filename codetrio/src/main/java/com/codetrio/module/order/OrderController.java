package com.codetrio.module.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	private String path = "hoxdm/order/";
	
	@Autowired //인터페이스
	OrderService service;
	
	//유저
	@RequestMapping(value = "/hoxdm/order/UserOrderHOXdmList")
	public String UserOrderHOXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			List<OrderDto> dtoList = service.selectList(vo);
			List<OrderDto> oneList = new ArrayList <OrderDto>();
			
			for(OrderDto dto : dtoList) {
				int count = 0;
				
				for(OrderDto dto2 : oneList) {
					if(dto.getoSeq().equals(dto2.getoSeq())) {
						count++;
						break;
					}
				}
				
				if (count == 0) {
					oneList.add(dto);
				}
			}
			model.addAttribute("orderList", oneList);
		}
		
		return path + "UserOrderHOXdmList"; 
		}
	
	@RequestMapping(value = "/hoxdm/order/UserOrderHOXdmForm")
	public String UserOrderHOXdmForm(@ModelAttribute("vo") OrderVo vo,
			Model model, OrderDto orderDto) throws Exception {
		
		if (vo.getoSeq().equals("0") || vo.getoSeq().equals("")) {
			// insert mode
		} else {
			List<OrderDto> dtoList = service.selectOne(orderDto); // 주문한 상품이 여러개일 수 있으므로, List로 읽는다
			OrderDto dto = new OrderDto();
			dto = dtoList.get(0);
			model.addAttribute("orderItem", dto);
			model.addAttribute("orderList", dtoList);
		}
		return path + "UserOrderHOXdmForm";
	}
	
	@RequestMapping(value = "/hoxdm/order/UserOrderHOXdmUpdt")
	public String UserOrderHOXdmUpdt(OrderDto orderDto) {
		
		service.update(orderDto);	

		return "redirect:UserOrderHOXdmList";
	}
	
	//거래처
	@RequestMapping(value = "/hoxdm/order/ClientOrderHOXdmList")
	public String ClientOrderHOXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("orderList", service.selectTwo(vo));
		}
		
		return path + "ClientOrderHOXdmList"; 
		}
	

	@RequestMapping(value = "/hoxdm/order/ClientOrderHOXdmInst")
	public String ClientOrderHOXdmInst(OrderDto orderDto) {
		
		service.insert(orderDto);
		return path + "ClientOrderHOXdmInst";
	}
	
	@RequestMapping(value = "/hoxdm/order/WarehouseOrderHOXdmList")
	public String WraehouseOrderHOXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("orderList", service.selectThree(vo));
		}
		
		return path + "WarehouseOrderHOXdmList"; 
		}
	
	@RequestMapping(value = "/whxdm/whorder/WhOrderWHXdmList")
	public String WhOrderWHXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("orderList", service.selectThree(vo));
		}
		
		return "whxdm/whorder/WhOrderWHXdmList"; 
		}
}
