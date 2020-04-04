package com.prior.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prior.api.common.Request;
import com.prior.api.entity.ParameterGroup;
import com.prior.api.service.ParameterService;


@RestController
@RequestMapping(value = "/api")
public class CoreController {
	
	@Autowired
	private ParameterService parameterService ;

	@GetMapping(value = "getData/{param}")
    public ResponseEntity<?> getData(@PathVariable("param") String param, HttpServletRequest request) throws Exception{
		
		List<ParameterGroup> list = null;// parameterService.findAll();
		
		ParameterGroup group = parameterService.findByCriteria(param);
		
		
		parameterService.saveToDb();
		System.out.println("asdsad");
		System.out.println(list);
		
		return ResponseEntity.ok(list);
	}
	
	@PostMapping(value = "postData")
    public ResponseEntity<?> postData(@RequestBody Request request) throws Exception{
		
		return ResponseEntity.ok("SUCCESS");
	}
}
