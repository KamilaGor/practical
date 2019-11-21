package com.module4.cannons;

public class Cannon {
	public boolean loaded;

	public Cannon(boolean loaded) {
		this.loaded = loaded;
	}

	public void fire() {
		if(loaded == false) {
			System.out.println("Cannon not loaded!");
			System.out.println("Loading the cannon!");
			System.out.println("Cannon loaded! Fire!");
			this.setLoaded(false);
		} else {
			System.out.println("Canon loaded! Fire!");
			this.setLoaded(false);
		}
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void setLoaded(boolean reloaded) {
		this.loaded = reloaded;
	}
}
