package com.infinite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.model.Report;
import com.infinite.repository.IReportDao;

@Service
public class ReportServiceImpl implements IReportService {
	
	@Autowired
	IReportDao rddao;

	@Transactional
	public List<Report> getReport()  {
		// TODO Auto-generated method stub
		return rddao.getReport();
	}

	@Transactional
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		return rddao.addReport(report);
	}



}
