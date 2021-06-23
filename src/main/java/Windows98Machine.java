
class Windows98Machine {

	private StandardKeyboard keyboard;
	private Monitor monitor;

	public StandardKeyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(StandardKeyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Windows98Machine(Monitor monitor1, StandardKeyboard keyboard1) {
		monitor =monitor1; // loose coupling
		keyboard = keyboard1;
	}
}
