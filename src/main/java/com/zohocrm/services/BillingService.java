package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Billing;

public interface BillingService {

	public void GenerateOneBill(Billing bill);
	public List<Billing> listbills();

}
