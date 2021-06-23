package com.xyz;

public class Factory {
	public static void main(String[] args) {
		Windows98Machine machine1 = new Windows98Machine(new GEMonitor(), new StandardKeyboard());
		machine1.setMonitor(new LGMonitor());
	}
}