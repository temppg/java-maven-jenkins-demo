public class Guitar {

	private String make;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	private String model;
	private int volume;
}

class SuperCoolGuitarWithFlames extends Guitar {

	private String flameColor;
	void play() {
		System.out.println(getMake());
	}
}