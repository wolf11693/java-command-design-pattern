package com.ra.pattern.command.receiver;

public class Tv {

	private boolean on;
	private int soundNumber = 10;
	private int channelNumber = 6;
	
	public Tv() {
		super();
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getSoundNumber() {
		return soundNumber;
	}

	public void setSoundNumber(int soundNumber) {
		this.soundNumber = soundNumber;
	}

	public int getChannelNumber() {
		return channelNumber;
	}

	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber;
		System.out.println("[TV] channel = " + this.channelNumber);
	}

	public void powerOnOff() {
		this.on = !this.on;
		String tvState = this.on == true? "on": "off";
		System.out.println("[TV] " + tvState);
	}
	
	public void upSound() {
		this.soundNumber +=1;
		System.out.println("[TV] sound = " + this.soundNumber);
	}
	
	public void downSound() {
		this.soundNumber -=1;
		System.out.println("[TV] sound = " + this.soundNumber);
	}
	
	public void upChannel() {
		this.channelNumber +=1;
		System.out.println("[TV] channel = " + this.channelNumber);
	}
	
	public void downChannel() {
		this.channelNumber -=1;
		System.out.println("[TV] channel = " + this.channelNumber);
	}
}