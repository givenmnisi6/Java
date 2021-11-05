//I DO 2
public abstract class Vehicles implements Comparable<Vehicles> {
	
	private String name;
	private String noplate;
	private int speed;
	private int time;
	
	//derfault constructor
	public Vehicles() {
		this("","GVA148GP",1,5);
	}
	
	//constructor with parameters
	public Vehicles(String name, String noplate, int speed, int time) {
		setName(name);
		setNoplate(noplate);
		setSpeed(speed);
		setTime(time);
	}

	//setMethods - Mutator
	public void setName(String name) {
		this.name = name;
	}

	public void setNoplate(String noplate) {
		this.noplate = noplate;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setTime(int time) {
		this.time = time;
	}

	//getMethods - Accessor
	public String getName() {
		return name;
	}

	public String getNoplate() {
		return noplate;
	}

	public int getSpeed() {
		return speed;
	}

	public int getTime() {
		return time;
	}

	public abstract double calclulateDistance();
	//fuelConsumption & electricConsumption
	public abstract double calculateConsumption();
	
	public String toString() {
		return "\n Name: " + getName() + "Number Plate: " + getNoplate() + "\nSpeed: " + getSpeed() +" km" + "\nTime travelled: " + getTime() + " hour(s)";
	}
}