package com.module1coma1.knight;

public class Knight {

	private Quest quest;

	public Knight(Quest quest) {
		this.quest = quest;
	}

	public void informAboutMission() {
		System.out.println("Start mission ....");
		System.out.println("End of mission ....");
		this.quest.process();
	}
}
