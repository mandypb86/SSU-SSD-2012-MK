package com.tim.ticd.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CustomerGeneralInformationWizardPage extends WizardPage {
	private Text txtFirstName;
	private Text txtFamilyName;
	private Text txtAddress;
	private Text txtCity;
	private Text txtPostCode;
	private Text txtPropertyName;
	private Text textFirstName;
	private Text textFamilyName;
	private Text textPropertyName;
	private Text textStreet;
	private Text textCity;
	private Text textPostcode;
	
	protected CustomerGeneralInformationWizardPage(){
		super("Customer General Information");
		setTitle("General Information");
		setMessage("Please provide some general information about the new customer.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Group grpName = new Group(container, SWT.NONE);
		grpName.setLayout(new GridLayout(2, false));
		grpName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpName.setText("Name");
		
		Label lblFirstName = new Label(grpName, SWT.NONE);
		lblFirstName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFirstName.setText("First name");
		
		textFirstName = new Text(grpName, SWT.BORDER);
		textFirstName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblFamilyName = new Label(grpName, SWT.NONE);
		lblFamilyName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFamilyName.setText("Family name");
		
		textFamilyName = new Text(grpName, SWT.BORDER);
		textFamilyName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Group grpAddress = new Group(container, SWT.NONE);
		grpAddress.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		grpAddress.setText("Address");
		grpAddress.setLayout(new GridLayout(2, false));
		
		Label lblPropertyName = new Label(grpAddress, SWT.NONE);
		lblPropertyName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPropertyName.setText("Property name /\r\nFlat number");
		
		textPropertyName = new Text(grpAddress, SWT.BORDER);
		textPropertyName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
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
		textPostcode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
	}
}
