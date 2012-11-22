package com.tim.ticd.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.tim.ticd.model.Accommodation;

public class AccommodationDetailView extends ViewPart {
	private Accommodation acc;
	private Text textName;
	private Text textAddress;
	private Text textRooms;
	private Text textPrice;
	private Text textDescription;

	public AccommodationDetailView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, true));
		
		Group grpGeneralInformation = new Group(composite, SWT.NONE);
		grpGeneralInformation.setLayout(new GridLayout(2, false));
		grpGeneralInformation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		grpGeneralInformation.setText("General Information");
		
		Label lblName = new Label(grpGeneralInformation, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name:");
		
		textName = new Text(grpGeneralInformation, SWT.BORDER | SWT.READ_ONLY);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblAdress = new Label(grpGeneralInformation, SWT.NONE);
		lblAdress.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAdress.setText("Adress:");
		
		textAddress = new Text(grpGeneralInformation, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
		GridData gd_textAddress = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_textAddress.heightHint = 70;
		textAddress.setLayoutData(gd_textAddress);
		
		Label lblRooms = new Label(grpGeneralInformation, SWT.NONE);
		lblRooms.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRooms.setText("# Rooms:");
		
		textRooms = new Text(grpGeneralInformation, SWT.BORDER | SWT.READ_ONLY);
		textRooms.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPrice = new Label(grpGeneralInformation, SWT.NONE);
		lblPrice.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPrice.setText("Price:");
		
		textPrice = new Text(grpGeneralInformation, SWT.BORDER | SWT.READ_ONLY);
		textPrice.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPicture = new Label(composite, SWT.NONE);
		lblPicture.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblPicture.setText("Picture");
		
		Group grpDescription = new Group(composite, SWT.NONE);
		grpDescription.setLayout(new GridLayout(1, false));
		grpDescription.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		grpDescription.setText("Description");
		
		textDescription = new Text(grpDescription, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		GridData gd_textDescription = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_textDescription.heightHint = 70;
		textDescription.setLayoutData(gd_textDescription);
		
		Group grpFacilities = new Group(composite, SWT.NONE);
		grpFacilities.setLayout(new GridLayout(1, false));
		grpFacilities.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		grpFacilities.setText("Facilities");
		
		List listFacilities = new List(grpFacilities, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_listFacilities = new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1);
		gd_listFacilities.heightHint = 80;
		gd_listFacilities.widthHint = 271;
		listFacilities.setLayoutData(gd_listFacilities);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

	}

	@Override
	public void setFocus() {
		textName.setFocus();
	}
}
