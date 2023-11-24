package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Report")
public class Report {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Report_id")
    private int reportId;
 
    @ManyToOne
    @JoinColumn(name = "User_Id")
    private VendorLogin vendor;
 
    @ManyToOne
    @JoinColumn(name = "Vuser_Id")
    private CustomerLogin user;
 
    @Column(name = "report", length = 500)
    private String report;

	public VendorLogin getRestaurant() {
		return vendor;
	}

	public void setRestaurant(VendorLogin vendor) {
		this.vendor = vendor;
	}

	public CustomerLogin getUser() {
		return user;
	}

	public void setUser(CustomerLogin user) {
		this.user = user;
	}

	public String getreport() {
		return report;
	}

	public void setreport(String report) {
		this.report = report;
	}

	public int getreportId() {
		return reportId;
	}

	public void setreportId(int reportId) {
		this.reportId = reportId;
	}
 
    
}
