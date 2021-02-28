package com.ra.pattern.commandimpl;

import com.ra.pattern.abstractcommand.Command;
import com.ra.pattern.command.receiver.Tv;

public class TVPowerCommand implements Command {

	private Tv tv;
	
	public TVPowerCommand(Tv tv) {
		this.tv = tv;
	}
	
	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void execute() {
		if(this.canExecute()) {
			this.tv.powerOnOff();			
		}
	}


}
