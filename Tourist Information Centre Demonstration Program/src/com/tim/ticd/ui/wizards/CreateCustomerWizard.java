package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

public class CreateCustomerWizard extends Wizard {

	public CreateCustomerWizard(){
		setWindowTitle("Create Customer Wizard");
		addPage(new CustomerGeneralInformationWizardPage());
		addPage(new CustomerContactInformationWizardPage());
	}
	
	@Override
	public boolean performFinish() {
		// TODO save the customer to the database
		System.out.println("CreateCustomerWizard performFinish()");
		return false;
	}
}
