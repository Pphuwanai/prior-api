package com.prior.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseDomain {
	
	protected String isDeleted = "N";

    @Column(updatable = false, insertable = true)
    @JsonIgnore
    @CreationTimestamp
    protected Date createdDate;

    @Column(updatable = false, insertable = true)
    @JsonIgnore
    @CreatedBy
    protected String createdBy = "SYSTEM";
    
    @Column(updatable = true, insertable = false)
    @JsonIgnore
    protected String updatedBy;

    @Column(updatable = true, insertable = false)
    @JsonIgnore
    @UpdateTimestamp
    protected Date updatedDate;

}
