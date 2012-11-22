package com.tim.ticd.ui.wizards;

import java.util.Calendar;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.tim.ticd.model.Customer;

public class CustomerGeneralInformationWizardPage extends WizardPage {
	
	private Customer cust;
	
	private Text textFirstName;
	private Text textFamilyName;
	
	protected CustomerGeneralInformationWizardPage(Customer p_cust){
		super("Customer General Information");
		setTitle("General Information");
		setMessage("Please provide some general information about the new customer.");
		this.cust = p_cust;
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
		
		Label lblTitle = new Label(grpName, SWT.NONE);
		lblTitle.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTitle.setText("Title");
		
		Combo cmbTitle = new Combo(grpName, SWT.NONE);
		cmbTitle.setItems(new String[] {"Mr", "Mrs", "Miss", "Ms"});
		
		Label lblFirstName = new Label(grpName, SWT.NONE);
		lblFirstName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFirstName.setText("First name/s");
		
		textFirstName = new Text(grpName, SWT.BORDER);
		textFirstName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblFamilyName = new Label(grpName, SWT.NONE);
		lblFamilyName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFamilyName.setText("Family name");
		
		textFamilyName = new Text(grpName, SWT.BORDER);
		textFamilyName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		
		Group grpDateOfBirth = new Group(container, SWT.NONE);
		grpDateOfBirth.setText("Date of birth");
		grpDateOfBirth.setLayout(new GridLayout(2, false));
		
		Label lblDay = new Label(grpDateOfBirth, SWT.NONE);
		lblDay.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDay.setText("Day");
		
		Combo cmbDay = new Combo(grpDateOfBirth, SWT.NONE);
		String[] values = new String[31];
		for(int i=1;i<=31;i++){
			values[i-1]=String.valueOf(i);
		}
		cmbDay.setItems(values);
		cmbDay.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblMonth = new Label(grpDateOfBirth, SWT.NONE);
		lblMonth.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMonth.setText("Month");
		
		Combo cmbMonth = new Combo(grpDateOfBirth, SWT.NONE);
		cmbMonth.setItems(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"});
		cmbMonth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblYear = new Label(grpDateOfBirth, SWT.NONE);
		lblYear.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblYear.setText("Year");
		
		Combo cmbYear = new Combo(grpDateOfBirth, SWT.NONE);
		cmbYear.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		values = new String[83];
		Calendar today = Calendar.getInstance();
		int lowerBound = today.get(Calendar.YEAR)-100; // oldest person might be 100 years
		int upperBound = today.get(Calendar.YEAR)-18; // customer must be at least 18 years old
		for(int i=lowerBound;i<=upperBound;i++){
			values[i-lowerBound] = String.valueOf(i);
		}
		cmbYear.setItems(values);
	}
}
