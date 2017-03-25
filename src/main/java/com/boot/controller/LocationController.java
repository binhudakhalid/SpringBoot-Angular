package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Location;
import com.boot.repository.LocationRepository;
import com.boot.repository.TaskRepository;

@RestController
@RequestMapping("/loc")
public class LocationController {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	
	

	@RequestMapping(method = RequestMethod.GET)
	public List<Location> list(){		
		return locationRepository.findAll();		
	}
	
	@RequestMapping(value="/save/{id}", method = RequestMethod.POST)
	public Location save(@RequestBody Location location,@PathVariable long id){
		locationRepository.findOneByid(id);	
		
		return locationRepository.saveAndFlush(location);
	}
	
	
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Location show(@PathVariable long id){
//		return locationRepository.findOneByid(id);	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Location show(@PathVariable long id){
//		if(locationRepository.findOneByid(id) != null){
//			getLocation();  ///
//			
//		}
		
		
		return locationRepository.findOneByid(id);	

	}
		
	private void getLocation() {
		taskRepository.saveAndFlush(null);
	// TODO Auto-generated method stub
	
}

	@RequestMapping(value = "/admin/delete/{id}", method = RequestMethod.DELETE)
	public Location delete(@PathVariable int id){
		Location locationTask = locationRepository.findOne(id);
		locationRepository.delete(locationTask);
		return locationTask;
	}

}
