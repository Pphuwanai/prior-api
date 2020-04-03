package com.prior.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRIOR_MS_PARAMETER_GROUP")
public class ParameterGroup extends BaseDomain{
	@Id
	@Column(name="PARAM_GROUP_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String paramGroup;
	private String paramEnDescription;
	private String paramThDescription;
}
