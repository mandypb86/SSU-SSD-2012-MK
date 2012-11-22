package com.tim.ticd.ui.views;

import java.util.ArrayList;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.tim.ticd.model.Accommodation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ColumnPixelData;

public class AccommodationListView extends ViewPart {

//	private DatabaseAccessClass dbacc = DatabaseAccessClass.getInstance();
	private ArrayList<Accommodation> allAccommodations = new ArrayList<Accommodation>(); 
	private Table table;
	
	public AccommodationListView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		TableColumnLayout tcl_composite = new TableColumnLayout();
		composite.setLayout(tcl_composite);
		
		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tcl_composite.setColumnData(tblclmnName, new ColumnPixelData(150, true, true));
		tblclmnName.setText("Name");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnAddress = tableViewerColumn_1.getColumn();
		tcl_composite.setColumnData(tblclmnAddress, new ColumnPixelData(150, true, true));
		tblclmnAddress.setText("Address");
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnRoomsAvailable = tableViewerColumn_2.getColumn();
		tcl_composite.setColumnData(tblclmnRoomsAvailable, new ColumnPixelData(150, true, true));
		tblclmnRoomsAvailable.setText("# Rooms Available");
		
		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnPrice = tableViewerColumn_4.getColumn();
		tcl_composite.setColumnData(tblclmnPrice, new ColumnPixelData(150, true, true));
		tblclmnPrice.setText("Price");
		
		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnPicture = tableViewerColumn_3.getColumn();
		tcl_composite.setColumnData(tblclmnPicture, new ColumnPixelData(150, true, true));
		tblclmnPicture.setText("Picture");
//		allAccommodations = dbacc.getAllAccommodations();
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
