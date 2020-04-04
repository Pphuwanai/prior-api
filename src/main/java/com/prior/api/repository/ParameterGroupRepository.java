package com.prior.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prior.api.entity.ParameterGroup;

@Repository
public interface ParameterGroupRepository extends JpaRepository<ParameterGroup ,Long> {

	ParameterGroup findByParamGroup(String param);

	@Query("select e from ParameterGroup e where e.paramGroup = ?1 and e.paramEnDescription = 'ZZZZ'  ")
	ParameterGroup findByParamGroupNative(String param);
}
