//I DO 2
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
        return "\nName: " + getName() + "\nNumber plate: " + getNoplate() + "\nSpeed: " + getSpeed() + " km" + "\nTime travelled: " + getTime() + " hour(s)" + "\nBattery: " + getBattery() + " V" + "\nCharging time: " + getChargingtime() + " ah" + "\nDistance travelled: " + calclulateDistance() + " km/h" + "\nElectric consumption: " + calculateConsumption() + " kWh" + "\n"; 
     }

     public int compareTo(Vehicles v){
        if(this.getClass().equals(v.getClass())){       //the class we in, is compared to the class we passing in 
            ECar e = (ECar)v;                           //Casting the classes since they match(equal) 
            if(this.calclulateDistance() == e.calclulateDistance())
                return 0;    //if the methods are equal return a 0
            else if(this.calclulateDistance()<e.calclulateDistance())
                return -1;  //if the calling method is less than it should return a -1
            else 
                return 1;  //else it should return a 0
        }
        else 
            return this.getClass().getName().compareTo(v.getClass().getName());
    }     
}
