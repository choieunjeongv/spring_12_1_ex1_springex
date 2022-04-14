package com.javaeunjeong.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value="views/view")
	public String view() {
		
		return "view";
	}
}
