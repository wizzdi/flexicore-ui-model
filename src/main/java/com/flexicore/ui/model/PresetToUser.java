package com.flexicore.ui.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.Role;
import com.flexicore.model.SecurityUser;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PresetToUser extends PresetToEntity {

	public PresetToUser() {
	}

	@Override
	@ManyToOne(targetEntity = Role.class, cascade = {CascadeType.MERGE,
			CascadeType.PERSIST})
	public SecurityUser getEntity() {
		return (SecurityUser) super.getEntity();
	}

	@JsonIgnore
	public <T extends PresetToEntity> T setEntity(SecurityUser entity) {
		super.setEntity(entity);
		return (T) this;
	}

}
