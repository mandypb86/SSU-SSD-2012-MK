package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

import com.tim.ticd.model.Customer;

public class CreateCustomerWizard extends Wizard {
	
	private Customer cust = new Customer();

	public CreateCustomerWizard(){
		setWindowTitle("Create Customer Wizard");
		addPage(new CustomerGeneralInformationWizardPage(cust));
		addPage(new CustomerContactInformationWizardPage(cust));
	}
	
	@Override
	public boolean performFinish() {
		// TODO save the customer to the database
		
		System.out.println("CreateCustomerWizard performFinish()");
		return true; // creation was successful, close wizard
	}
}
