package com.infinite.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.model.Report;
@Repository
public class ReportDaoImpl implements IReportDao{
	
	@Autowired
	private SessionFactory sesfactory;
	public void setSesfactory(SessionFactory sesfactory) {
		this.sesfactory = sesfactory;
	}

	@Transactional
	public List<Report> getReport() {
		Session session = this.sesfactory.getCurrentSession();
		Query q = session.createQuery("FROM MenuItem");
		List<Report> ls = q.list();
		return ls;
	}

	@Transactional
	public Report addReport(Report report) {
		Session session = this.sesfactory.getCurrentSession();
		session.save(report);
		return report;
	}


}
