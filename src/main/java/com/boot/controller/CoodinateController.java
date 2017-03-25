package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Coodinate;
import com.boot.repository.CoordinateRepository;

@RestController
@RequestMapping("/cood")
public class CoodinateController {
	
	@Autowired
	private CoordinateRepository coodinateRepository;
	
	
	

	@RequestMapping(method = RequestMethod.GET)
	public List<Coodinate> list(){		
		return coodinateRepository.findAll();		
	}
	
	@RequestMapping(value="/save/{id}", method = RequestMethod.POST)
	public Coodinate save(@RequestBody Coodinate location,@PathVariable int id){
		coodinateRepository.findOneByid(id);	
		
		return coodinateRepository.saveAndFlush(location);
	}
	
	
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Location show(@PathVariable long id){
//		return locationRepository.findOneByid(id);	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Coodinate show(@PathVariable int id){
//		if(locationRepository.findOneByid(id) != null){
//			getLocation();  ///
//			
//		}
		
		
		return coodinateRepository.findOneByid(id);	

	}
		
	private void getLocation() {
		//taskRepository.saveAndFlush(null);
	// TODO Auto-generated method stub
	
}

	@RequestMapping(value = "/admin/delete/{id}", method = RequestMethod.DELETE)
	public Coodinate delete(@PathVariable int id){
		Coodinate locationTask = coodinateRepository.findOne(id);
		coodinateRepository.delete(locationTask);
		return locationTask;
	}

}
