package com.codetrio.module.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codetrio.module.codegroup.CodeGroupDto;

@Controller
@RequestMapping(value="/hoxdm/order/")
public class OrderController {
	
	private String path = "hoxdm/order/";
	
	@Autowired //인터페이스
	OrderService service;
	
	//유저
	@RequestMapping(value = "UserOrderHOXdmList")
	public String UserOrderHOXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("orderList", service.selectList(vo));
		}
		
		return path + "UserOrderHOXdmList"; 
		}
	
	@RequestMapping(value = "UserOrderHOXdmForm")
	public String UserOrderHOXdmForm(@ModelAttribute("vo") OrderVo vo,
			Model model, OrderDto orderDto) throws Exception {
		
		if (vo.getoSeq().equals("0") || vo.getoSeq().equals("")) {
			// insert mode
		} else {
		
			model.addAttribute("orderItem", service.selectOne(orderDto));
		}
		return path + "UserOrderHOXdmForm";
	}
	
	@RequestMapping(value = "UserOrderHOXdmUpdt")
	public String UserOrderHOXdmUpdt(OrderDto orderDto) {
		
		service.update(orderDto);	

		return "redirect:UserOrderHOXdmList";
	}
	
	//거래처
	@RequestMapping(value = "ClientOrderHOXdmList")
	public String ClientOrderHOXdmList(Model model,@ModelAttribute("vo") OrderVo vo) {
		
		vo.setParamsPaging(service.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("orderList", service.selectList(vo));
		}
		
		return path + "ClientOrderHOXdmList"; 
		}

}
