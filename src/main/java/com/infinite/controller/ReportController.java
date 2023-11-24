package com.infinite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infinite.model.Report;
import com.infinite.service.IReportService;

@RestController

@CrossOrigin("http://localhost:3000/")
public class ReportController {

	@Autowired
	IReportService rdservice;
	
	@RequestMapping(value="/getfeedback",method=RequestMethod.GET)
	public List<Report> getReport(){
		
		return rdservice.getReport();
		
	}
}
