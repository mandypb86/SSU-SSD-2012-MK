package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

public class CreateCustomerWizard extends Wizard {

	@Override
	public boolean performFinish() {
		// TODO save the customer to the database
		System.out.println("CreateCustomerWizard performFinish()");
		return false;
	}

}
