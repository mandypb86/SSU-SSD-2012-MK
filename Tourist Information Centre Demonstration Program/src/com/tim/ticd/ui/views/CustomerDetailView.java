package com.tim.ticd.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;

public class CustomerDetailView extends ViewPart {
	private Text textFirstNames;
	private Text textFamilyName;
	private Text textDateOfBirth;
	private Text textFlatProperty;
	private Text textStreet;
	private Text textCity;
	private Text textPostcode;
	private Text textPhoneHome;
	private Text textPhoneMobile;
	private Text textEmail;

	public CustomerDetailView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(5, false));
		
		Label lblFirstNames = new Label(composite, SWT.NONE);
		lblFirstNames.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFirstNames.setText("First name/s");
		
		textFirstNames = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		GridData gd_textFirstNames = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_textFirstNames.widthHint = 200;
		textFirstNames.setLayoutData(gd_textFirstNames);
		new Label(composite, SWT.NONE);
		
		Label lblDateOfBirth = new Label(composite, SWT.NONE);
		lblDateOfBirth.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDateOfBirth.setText("Date of birth");
		
		textDateOfBirth = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		textDateOfBirth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblFamilyName = new Label(composite, SWT.NONE);
		lblFamilyName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFamilyName.setText("Family name");
		
		textFamilyName = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		GridData gd_textFamilyName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_textFamilyName.widthHint = 200;
		textFamilyName.setLayoutData(gd_textFamilyName);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Group grpAddress = new Group(composite, SWT.NONE);
		grpAddress.setLayout(new GridLayout(2, false));
		grpAddress.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		grpAddress.setText("Address");
		
		Label lblFlatNumber = new Label(grpAddress, SWT.NONE);
		lblFlatNumber.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlatNumber.setText("Flat number /\r\nProperty name");
		
		textFlatProperty = new Text(grpAddress, SWT.BORDER | SWT.READ_ONLY);
		textFlatProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblStreet = new Label(grpAddress, SWT.NONE);
		lblStreet.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblStreet.setText("Street");
		
		textStreet = new Text(grpAddress, SWT.BORDER | SWT.READ_ONLY);
		textStreet.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCity = new Label(grpAddress, SWT.NONE);
		lblCity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCity.setText("City");
		
		textCity = new Text(grpAddress, SWT.BORDER | SWT.READ_ONLY);
		textCity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPostcode = new Label(grpAddress, SWT.NONE);
		lblPostcode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPostcode.setText("Postcode");
		
		textPostcode = new Text(grpAddress, SWT.BORDER | SWT.READ_ONLY);
		textPostcode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		
		Group grpPhoneAndEmail = new Group(composite, SWT.NONE);
		grpPhoneAndEmail.setLayout(new GridLayout(2, false));
		grpPhoneAndEmail.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		grpPhoneAndEmail.setText("Phone and Email");
		
		Label lblHome = new Label(grpPhoneAndEmail, SWT.NONE);
		lblHome.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblHome.setText("Home");
		
		textPhoneHome = new Text(grpPhoneAndEmail, SWT.BORDER | SWT.READ_ONLY);
		textPhoneHome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblMobile = new Label(grpPhoneAndEmail, SWT.NONE);
		lblMobile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMobile.setText("Mobile");
		
		textPhoneMobile = new Text(grpPhoneAndEmail, SWT.BORDER | SWT.READ_ONLY);
		textPhoneMobile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblEmail = new Label(grpPhoneAndEmail, SWT.NONE);
		lblEmail.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEmail.setText("Email");
		
		textEmail = new Text(grpPhoneAndEmail, SWT.BORDER | SWT.READ_ONLY);
		textEmail.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Group grpInquieryHistory = new Group(composite, SWT.NONE);
		grpInquieryHistory.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpInquieryHistory.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 5, 1));
		grpInquieryHistory.setText("Inquiry History");
		
		List list = new List(grpInquieryHistory, SWT.BORDER);
		
	}

	@Override
	public void setFocus() {
		
	}

}
