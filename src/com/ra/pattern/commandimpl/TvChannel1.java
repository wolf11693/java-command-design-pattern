package com.ra.pattern.commandimpl;

import com.ra.pattern.abstractcommand.Command;
import com.ra.pattern.command.receiver.Tv;

public class TvChannel1 implements Command{

	private Tv tv;

	public TvChannel1(Tv tv) {
		this.tv = tv;
	}

	@Override
	public boolean canExecute() {
		return this.tv.isOn() ? true : false;
	}

	@Override
	public void execute() {
		if (this.canExecute()) {
			this.tv.setChannelNumber(1);
		} else {
			String stateTv = this.tv.isOn() ? "on" : "off";
			System.out.println("warning - TV " + stateTv);
		}
	}


}
