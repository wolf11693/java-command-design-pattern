package com.ra.pattern.command.client;

import com.ra.pattern.command.receiver.Tv;
import com.ra.pattern.commandimpl.TVPowerCommand;
import com.ra.pattern.commandimpl.TVSoundDownCommand;
import com.ra.pattern.commandimpl.TVSoundUpCommand;
import com.ra.pattern.commandimpl.TvDownChannel;
import com.ra.pattern.commandimpl.TvUpChannel;

public class MainApp {

	public static void main(String[] args) {
		Tv samsungTv = new Tv();
		
		TVSoundUpCommand soundUpCmd = new TVSoundUpCommand(samsungTv);
		TVPowerCommand powerCmd = new TVPowerCommand(samsungTv);
		TVSoundDownCommand downCmd = new TVSoundDownCommand(samsungTv);
		TvUpChannel upChannel = new TvUpChannel(samsungTv);
		TvDownChannel downChannel = new TvDownChannel(samsungTv);

		soundUpCmd.execute();
		
		powerCmd.execute();
		
		soundUpCmd.execute();
		
		soundUpCmd.execute();
		soundUpCmd.execute();
		soundUpCmd.execute();
		soundUpCmd.execute();
		soundUpCmd.execute();
		soundUpCmd.execute();
		soundUpCmd.execute();
		
		upChannel.execute();
		upChannel.execute();
		
		downCmd.execute();
		
		downCmd.execute();
		downCmd.execute();
		downCmd.execute();

		downChannel.execute();
		downChannel.execute();
		downChannel.execute();
		
		powerCmd.execute();
	}
}
