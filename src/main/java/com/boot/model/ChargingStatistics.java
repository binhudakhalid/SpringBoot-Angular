
package com.boot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ChargingStatistics {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Temporal(TemporalType.DATE)
	private Date date;

	public ChargingStatistics() {
	};

	public ChargingStatistics(Date date, int failedCharging, int successCharging, int totalChargingRequests,
			int totalRevenue) {
		super();
		this.date = date;
		this.failedCharging = failedCharging;
		this.successCharging = successCharging;
		this.totalChargingRequests = totalChargingRequests;
		this.totalRevenue = totalRevenue;
	}

	private int failedCharging;
	private int successCharging;
	private int totalChargingRequests;
	private int totalRevenue;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getFailedCharging() {
		return failedCharging;
	}

	public void setFailedCharging(int failedCharging) {
		this.failedCharging = failedCharging;
	}

	public int getSuccessCharging() {
		return successCharging;
	}

	public void setSuccessCharging(int successCharging) {
		this.successCharging = successCharging;
	}

	public int getTotalChargingRequests() {
		return totalChargingRequests;
	}

	public void setTotalChargingRequests(int totalChargingRequests) {
		this.totalChargingRequests = totalChargingRequests;
	}

	public int getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(int totalRevenue) {
		this.totalRevenue = totalRevenue;
	}


}