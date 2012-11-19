package com.tim.ticd.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import com.tim.ticd.ui.wizards.CreateCustomerWizard;

public class CreateCustomerHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// nothing to do
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO create an instance of CreateCustomerWizard and open it
		new WizardDialog(HandlerUtil.getActiveShell(event),new CreateCustomerWizard()).open();
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// nothing to do
	}

}
