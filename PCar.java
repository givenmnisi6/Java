//I DO 1
import java.lang.Math; 
public class PCar extends Vehicles {
    
    //PCar - petrol car
    private double gasolinetank;
    private double petrolprice;

    public PCar() {
        this("","GVA 148 GP",1,5,1.0,17.50);
    }

    public PCar(String name, String noplate, int speed, int time, double gasolinetank, double petrolprice) {
        super(name, noplate, speed, time);
        setGasolinetank(gasolinetank);
        setPetrolprice(petrolprice);
    }

    public void setGasolinetank(double gasolinetank) {
        this.gasolinetank = gasolinetank;
    }

    public void setPetrolprice(double petrolprice) {
        this.petrolprice = petrolprice;
    }

    public double getGasolinetank() {
        return gasolinetank;
    }

    public double getPetrolprice() {
        return petrolprice;
    }

    public double calclulateDistance() {
        return getSpeed()*getTime();
    }

    public double calculateConsumption() {
        return Math.round((getGasolinetank()*100.0)/getSpeed());
    }
    
    public String toString() {
        return "\nName: " + getName() + "\nNumber plate: " + getNoplate() + "\nSpeed: " + getSpeed() + " km" + "\nTime travelled: " + getTime() + " hour(s)" + "\nGas tank: " + getGasolinetank() + " litres" + "\nPetrol price: R " + getPetrolprice() + "\nDistance travelled: " + calclulateDistance() + " km/h" + "\nFuel consumption: " + calculateConsumption() + " litres/100kms";
    }
}
