package com.flexicore.ui.model;

import com.flexicore.security.SecurityContext;
import com.wizzdi.flexicore.boot.dynamic.invokers.model.DynamicExecution;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Form extends Preset {

	public Form() {
	}

	public Form(String name, SecurityContext securityContext) {
		super(name, securityContext);
	}

	@ManyToOne(targetEntity = DynamicExecution.class)
	private DynamicExecution dynamicExecution;

	@ManyToOne(targetEntity = DynamicExecution.class)
	public DynamicExecution getDynamicExecution() {
		return dynamicExecution;
	}

	public <T extends Form> T setDynamicExecution(
			DynamicExecution dynamicExecution) {
		this.dynamicExecution = dynamicExecution;
		return (T) this;
	}
}
