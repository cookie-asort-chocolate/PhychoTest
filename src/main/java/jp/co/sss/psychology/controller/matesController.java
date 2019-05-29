package jp.co.sss.psychology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class matesController {
	
	@Autowired  
	nameRepository repository; 

	@RequestMapping("/mates/findAll")
	public String showItemList(Model model) {
		model.addAttribute("mates", repository.findAll());
		return "items/item_list"; //?
	}
}
