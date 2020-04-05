package com.prior.api.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRIOR_MS_PARAMETER_INFO")
public class ParameterInfo extends BaseDomain{
	@Id
	@Column(name="PARAM_INFO_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String paramCode;
	private String paramEnDescription;
	private String paramThDescription;
	
	@ManyToOne
	@JoinColumn(name = "PARAM_GROUP_ID")
	private ParameterGroup parameterGroup;
	
	private String specialPurpose;
	private Long sortingOrder;
}
