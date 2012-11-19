package com.tim.ticd.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class AccommodationDetailView extends ViewPart {
	
	private Label label;

	public AccommodationDetailView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		label = new Label(parent, SWT.None);
		label.setText("Accommodation Details");

	}

	@Override
	public void setFocus() {
		label.setFocus();

	}

}
