package com.singtel.animalsactivity.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalActivityController {
	@RequestMapping("/sounded-native-tongue")
	@ResponseBody
	public static String checkNativeTongue(@RequestParam(value="animal") String animal, @RequestParam(value="locale") String locale) {
		
		if("dutch".equals(locale)) {
			if("chicken".equals(animal)) return locale +" : "+ animal + " : " + "kokororookook"; 
		}
		
		return null;
	}
		
	
	
}
