package com.infinite.service;

import java.util.List;

import com.infinite.model.Report;



public interface IReportService {
	
public List<Report> getReport();
	
	public Report addReport(Report report);

}
