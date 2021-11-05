public class ECar extends Vehicles {
    
    //ECar - electric car
    private int battery;
    private double chargingtime;

    public ECar() {
        this("","GVA 148 GP",1,5,20,0.5);
    }   

    public ECar(String name, String noplate, int speed, int time, int battery, double chargingtime) {
        super(name, noplate, speed, time);
        setBattery(battery);
        setChargingtime(chargingtime);
    }
    
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setChargingtime(double chargingtime) {
        this.chargingtime = chargingtime;
    }

    public int getBattery() {
        return battery;
    }

    public double getChargingtime() {
        return chargingtime;
    }

    public double calclulateDistance() {
        return getSpeed()*getTime();
    }

    public double calculateConsumption() {
        return getBattery()*getChargingtime();
    }
 
    public String toString() {
        return "\nName: " + getName() + "\nNumber plate: " + getNoplate() + "\nSpeed: " + getSpeed() + " km" + "\nTime travelled: " + getTime() + " hour(s)" + "\nBattery: " + getBattery() + " V" + "\nCharging time: " + getChargingtime() + " ah" + "\nDistance travelled: " + calclulateDistance() + " km/h" + "\nElectric consumption: " + calculateConsumption() + " kWh"; 
     }
}
