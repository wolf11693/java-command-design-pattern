package com.ra.pattern.abstractcommand;

public interface Command {

	public boolean canExecute();
	
	public void execute();
}
