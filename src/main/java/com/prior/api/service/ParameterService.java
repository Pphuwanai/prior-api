package com.prior.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prior.api.entity.ParameterGroup;
import com.prior.api.repository.ParameterGroupRepository;

@Service
public class ParameterService {

	@Autowired
	private ParameterGroupRepository parameterGroupRepository;

	public List<ParameterGroup> findAll() {
		return parameterGroupRepository.findAll();
	}

	public ParameterGroup findByCriteria(String param) {
		
		
		
		return parameterGroupRepository.findByParamGroupNative(param);
	}

	public void saveToDb() {
		ParameterGroup g = new ParameterGroup();
		g.setParamGroup("ParamGroup");
		g.setParamThDescription("ParamThDescription");
		g.setParamEnDescription("ParamEnDescription");
		
		parameterGroupRepository.save(g);
	}
	
	
}
