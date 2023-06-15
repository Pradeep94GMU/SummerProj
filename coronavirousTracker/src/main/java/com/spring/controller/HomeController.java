package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.model.LocationStat;
import com.spring.service.CoronaVirousDataSource;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirousDataSource coronaVirousDataSource; 
	
	@GetMapping("/")
	public String home(Model model) {
		 List<LocationStat> allStats = coronaVirousDataSource.getAllStats();
	        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
	        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
	        model.addAttribute("lstat", allStats);
	        model.addAttribute("totalReportedCases", totalReportedCases);
	        model.addAttribute("totalNewCases", totalNewCases);
		return "home";
	}

}
