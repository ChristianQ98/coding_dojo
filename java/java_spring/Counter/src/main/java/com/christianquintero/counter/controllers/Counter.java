package com.christianquintero.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			return "redirect:/";
		}
		int currentCount = (int) session.getAttribute("count");
		model.addAttribute("count", ++currentCount);
		return "counter.jsp";
	}
	
	@RequestMapping("/index/counter_two")
	public String index_counter_two(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", (int) session.getAttribute("count") + 2);
		}
		return "counter_two_index.jsp";
	}
	
	@RequestMapping("/counter_two")
	public String counter_two(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			return "redirect:/";
		}
		int currentCount = (int) session.getAttribute("count");
		model.addAttribute("count", currentCount += 2);
		return "counter_two.jsp";
	}
	
	@RequestMapping("/counter/remove")
	public String remove(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}