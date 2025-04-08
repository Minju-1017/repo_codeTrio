package com.codetrio.module.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codetrio.module.member.MemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/productWHXdmList")
	public String productWHXdmList(@ModelAttribute("vo")ProductVo vo, Model model,HttpSession httpSession,MemberDto memberDto) {
		vo.setParamsPaging(productService.selectCount(vo));
		memberDto.setuSeq(String.valueOf(httpSession.getAttribute("sessSeqWHXdm")));
		model.addAttribute("list",productService.productList(vo));
		return "whxdm/product/productWHXdmList";
	}
	@RequestMapping(value = "/productHOXdmList")
	public String productHOXdmList(@ModelAttribute("vo")ProductVo vo, Model model,HttpSession httpSession,MemberDto memberDto) {
		vo.setParamsPaging(productService.selectCount(vo));
		memberDto.setuSeq(String.valueOf(httpSession.getAttribute("sessSeqHOXdm")));
		model.addAttribute("list",productService.productList(vo));
		return "hoxdm/product/productHOXdmList";
	}
}
