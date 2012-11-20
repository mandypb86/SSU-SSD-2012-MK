package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CustomerContactInformationWizardPage extends WizardPage {
	private Text textPhoneHome;
	private Text textPhoneMobile;
	private Text textEmail;

	protected CustomerContactInformationWizardPage(){
		super("Contact Information");
		setTitle("Contact Information");
		setMessage("Please provide some contact details of the new customer.");
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblPhonehome = new Label(container, SWT.NONE);
		lblPhonehome.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPhonehome.setText("Phone (home)");
		
		textPhoneHome = new Text(container, SWT.BORDER);
		textPhoneHome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPhonemobile = new Label(container, SWT.NONE);
		lblPhonemobile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPhonemobile.setText("Phone (mobile)");
		
		textPhoneMobile = new Text(container, SWT.BORDER);
		textPhoneMobile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblEmail = new Label(container, SWT.NONE);
		lblEmail.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEmail.setText("Email");
		
		textEmail = new Text(container, SWT.BORDER);
		textEmail.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}
	
}
