package com.infinite.repository;

import java.util.List;
import com.infinite.model.Report;

public interface IReportDao {
public List<Report> getReport();
	public Report addReport(Report report);


}
