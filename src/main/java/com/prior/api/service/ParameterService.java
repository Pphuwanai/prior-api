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
	
	
}
