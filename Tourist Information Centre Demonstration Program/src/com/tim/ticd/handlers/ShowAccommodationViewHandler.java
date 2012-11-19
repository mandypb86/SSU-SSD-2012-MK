package com.tim.ticd.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;

public class ShowAccommodationViewHandler implements IHandler {

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
		// TODO open view programmatically
		System.out.println("Accommodation Detail View opened");
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO only available when an accommodation is selected
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
