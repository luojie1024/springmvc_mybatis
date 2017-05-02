package cn.itcast.ssm.controller.validation;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.service.iml.ItemsServiceImpl;

@Controller
public class ItemController {
	@Autowired
	private ItemsServiceImpl itemsService;
	
	//商品查询
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception{
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);


		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);

		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}

}
