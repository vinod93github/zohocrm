package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {
	public void SaveLead(Lead lead);

	public List<Lead> findAllLead();

	public Lead getLead(long id);

	public void deleteLead(long id);
}
