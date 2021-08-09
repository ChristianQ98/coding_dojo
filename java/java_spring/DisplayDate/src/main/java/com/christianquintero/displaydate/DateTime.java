package com.christianquintero.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTime {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat formatted = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("date", formatted.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat formatted = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", formatted.format(date));
		return "time.jsp";
	}
}
