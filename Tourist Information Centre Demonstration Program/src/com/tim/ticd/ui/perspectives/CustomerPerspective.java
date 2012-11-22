package com.tim.ticd.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class CustomerPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.addView("com.tim.ticd.ui.views.customerDetailView", IPageLayout.LEFT, 0.4f, layout.getEditorArea());
		layout.addView("com.tim.ticd.ui.views.accommodationListView", IPageLayout.RIGHT, 0.4f, layout.getEditorArea());
	}

}
