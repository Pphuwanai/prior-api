package com.prior.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prior.api.entity.ParameterGroup;

@Repository
public interface ParameterGroupRepository extends JpaRepository<ParameterGroup ,Long> {

	
}
