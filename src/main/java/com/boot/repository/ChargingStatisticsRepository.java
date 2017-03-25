package com.boot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.ChargingStatistics;


public interface ChargingStatisticsRepository extends JpaRepository<ChargingStatistics, Date> {

	public ChargingStatistics findOneBydate(Date date);
	//List  findBydateBetween(Date start, Date end);

	public List<ChargingStatistics> findBydateBetween(Date date, Date date2);

	public List<ChargingStatistics> findBydateAfter(Date date);
	public List<ChargingStatistics> findBydateBefore(Date date);




}
