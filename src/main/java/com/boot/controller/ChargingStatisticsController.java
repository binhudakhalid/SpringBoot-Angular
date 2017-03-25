package com.boot.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.ChargingStatistics;
import com.boot.repository.ChargingStatisticsRepository;

@Controller
@RestController
@RequestMapping("/stats")
public class ChargingStatisticsController {
	
	@Autowired
	private ChargingStatisticsRepository chargingStatisticsRepository;
	
	//http://localhost:9090/stats
	@RequestMapping(method = RequestMethod.GET)
	public List<ChargingStatistics> list(){		
		return chargingStatisticsRepository.findAll();		
	}
	
	
	@RequestMapping(value="/admin/save", method = RequestMethod.POST)
	public ChargingStatistics save(@RequestBody ChargingStatistics chargingStatistics){
		return chargingStatisticsRepository.saveAndFlush(chargingStatistics);
	}
	
	
	
	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
	public ChargingStatistics show(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date date){
		return chargingStatisticsRepository.findOneBydate(date);
	}
	
	
	
	
	
   //http://localhost:9090/stats/2016-06-01
	@RequestMapping(value = "/{date}", method = RequestMethod.GET)
	public ChargingStatistics view(@PathVariable("date") @DateTimeFormat(iso=ISO.DATE) Date date){
		return chargingStatisticsRepository.findOneBydate(date);
	}
	
	
	
	//http://localhost:9090/stats/?date=2016-06-01&date2=2016-06-22
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public List<ChargingStatistics> BetweenDate(@RequestParam("date") @DateTimeFormat(iso=ISO.DATE) Date date,
		                                       	@RequestParam("date2") @DateTimeFormat(iso=ISO.DATE) Date date2){
		return chargingStatisticsRepository.findBydateBetween(date, date2);
	}
	
//	//http://localhost:9090/stats/date=2016-06-22
//	@RequestMapping(value = "/no",method = RequestMethod.GET)
//	public List<ChargingStatistics> AfterDate1(@RequestParam("date") @DateTimeFormat(iso=ISO.DATE) Date date
//		                                       ){
//		return chargingStatisticsRepository.findBydateAfter(date);
//	}
	
	
	//http://localhost:9090/stats/add/2016-02-01
		@RequestMapping(value="/add", method = RequestMethod.GET)
		public ChargingStatistics add(@RequestParam ("date")  @DateTimeFormat(iso=ISO.DATE) Date date){
			ChargingStatistics chargingStatistics = new ChargingStatistics(date,1,2,4,6) ;
			return chargingStatisticsRepository.saveAndFlush(chargingStatistics);
		}
	

		//@RequestMapping(value = "/remove/{date}", method = RequestMethod.DELETE)   
	@RequestMapping(value = "/remove/{date}", method = RequestMethod.GET)
	public ChargingStatistics remove(@PathVariable("date") @DateTimeFormat(iso=ISO.DATE) Date date){
		ChargingStatistics existingStats = chargingStatisticsRepository.findOneBydate(date);
		chargingStatisticsRepository.delete(existingStats);
		return existingStats;
	}
	
	@RequestMapping(value = "/admin/delete/{id}", method = RequestMethod.DELETE)
	public ChargingStatistics delete(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date date){
		ChargingStatistics chargingStatistics = chargingStatisticsRepository.findOneBydate(date);
		chargingStatisticsRepository.delete(chargingStatistics);
		return chargingStatistics;
	}
	
	
	
	
	
	
	
}