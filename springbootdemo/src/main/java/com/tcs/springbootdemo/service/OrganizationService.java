package com.tcs.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springbootdemo.model.Organization;

public interface OrganizationService {

	public String addOrganization(Organization organization);
	   public String updateOrganization(Organization organization);
	   public String deleteOrganization(int id);
	   public Optional<Organization>findById(int id);
	   public Optional<List<Organization>> getOrganization();
	

	
	
	
	
	
	
	
	
}
