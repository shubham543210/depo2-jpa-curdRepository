package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Details2;
import com.example.demo.beans.Property;
import com.example.demo.service.Details2Service;

@RestController
public class Details2Controller {

	@Autowired
	private Details2Service details2Service;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/property")
	public void propertyPost(@RequestBody Property property )
	{
		details2Service.putPropertyService(property);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/details2")
	public void details2Post(@RequestBody Details2 details2 )
	{
		details2Service.putDetails2Service(details2);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/details2/{lid}")
	public List<Details2> details2Get(@PathVariable int lid)
	{
		return details2Service.getDetails2Service(lid);
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/details2/jpa")
	public Details2 details2GetByJpa()
	{
		return details2Service.getByJpa();
	}
}
