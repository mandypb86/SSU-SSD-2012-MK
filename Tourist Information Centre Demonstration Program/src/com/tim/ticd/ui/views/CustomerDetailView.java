package com.tim.ticd.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class CustomerDetailView extends ViewPart {
	
	Label label;

	public CustomerDetailView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		label = new Label(parent, SWT.None);
		label.setText("Hello RCP");
	}

	@Override
	public void setFocus() {
		label.setFocus();
	}

}
