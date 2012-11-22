package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.tim.ticd.model.Customer;

public class CustomerContactInformationWizardPage extends WizardPage {
	
	// Customer objects that carries the collected information to the next page
	private Customer cust;
	
	private Text textPhoneHome;
	private Text textPhoneMobile;
	private Text textEmail;
	private Text textFlatPropertyName;
	private Text textStreet;
	private Text textCity;
	private Text textPostcode;

	protected CustomerContactInformationWizardPage(Customer p_cust){
		super("Contact Information");
		setTitle("Contact Information");
		setMessage("Please provide some contact details of the new customer.");
		this.cust = p_cust;
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Group grpAddress = new Group(container, SWT.NONE);
		grpAddress.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpAddress.setText("Address");
		grpAddress.setLayout(new GridLayout(2, false));
		
		Label lblFlatNumberProperty = new Label(grpAddress, SWT.NONE);
		lblFlatNumberProperty.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlatNumberProperty.setText("Flat /\r\nProperty Name");
		
		textFlatPropertyName = new Text(grpAddress, SWT.BORDER);
		textFlatPropertyName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblStreet = new Label(grpAddress, SWT.NONE);
		lblStreet.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblStreet.setText("Street");
		
		textStreet = new Text(grpAddress, SWT.BORDER);
		textStreet.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCity = new Label(grpAddress, SWT.NONE);
		lblCity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCity.setText("City");
		
		textCity = new Text(grpAddress, SWT.BORDER);
		textCity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPostcode = new Label(grpAddress, SWT.NONE);
		lblPostcode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPostcode.setText("Postcode");
		
		textPostcode = new Text(grpAddress, SWT.BORDER);
		GridData gd_textPostcode = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_textPostcode.widthHint = 80;
		textPostcode.setLayoutData(gd_textPostcode);
		new Label(container, SWT.NONE);
		
		Group grpPhone = new Group(container, SWT.NONE);
		grpPhone.setText("Phone");
		grpPhone.setLayout(new GridLayout(2, false));
		
		Label lblPhonehome = new Label(grpPhone, SWT.NONE);
		lblPhonehome.setText("Home");
		
		textPhoneHome = new Text(grpPhone, SWT.BORDER);
		GridData gd_textPhoneHome = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_textPhoneHome.widthHint = 150;
		textPhoneHome.setLayoutData(gd_textPhoneHome);
		
		Label lblPhonemobile = new Label(grpPhone, SWT.NONE);
		lblPhonemobile.setText("Mobile");
		
		textPhoneMobile = new Text(grpPhone, SWT.BORDER);
		GridData gd_textPhoneMobile = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_textPhoneMobile.widthHint = 150;
		textPhoneMobile.setLayoutData(gd_textPhoneMobile);
		
		Label lblEmail = new Label(grpPhone, SWT.NONE);
		lblEmail.setText("Email");
		
		textEmail = new Text(grpPhone, SWT.BORDER);
		GridData gd_textEmail = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_textEmail.widthHint = 150;
		textEmail.setLayoutData(gd_textEmail);

	}
	
}
