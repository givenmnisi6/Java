//I DO 1
public class TestAll {
    
    public static void main(String[] args) {

        PCar p1 = new PCar("Polo Vivo", "MOZ 562 MP", 55, 3, 1.5, 14.22);
        ECar e1 = new ECar("BMW i8", "JAY 444 NW", 75, 4,45,3); 
        
        //implicit & explicit calling of the toString 
        System.out.println("Petrol Car " + p1);
        System.out.println("\nElectric Car " + e1.toString());
        
        //Polymorphism
        Vehicles v1 = new PCar("Polo Vivo", "MOZ 562 MP", 65, 3, 1.6, 14.22);
        System.out.println("\nVehicle " + v1);

        PCar p2 = new PCar("Audi A3", "DBM 867 GP", 80, 3, 2.0, 12.22);
        PCar p3 = new PCar("Polo TSI", "SBN 235 EC", 100, 4, 2.0, 16.22);

        ECar e2 = new ECar("Tesla Model S", "PVG 823 NW", 130, 2, 70, 2); 
        ECar e3 = new ECar("Audi E-tron Quattro", "IEV 301 GP", 120, 4, 65, 3); 

        Vehicles type [] = new Vehicles[6];

        type[0] = p1;
        type[1] = p2;
        type[2] = p3;
        type[3] = e1;
        type[4] = e2;
        type[5] = e3;

        for(int i = 0; i<6; i++)
        {
            System.out.println("\nVehicle[" + i + "] " + type[i] );
        }
    }
}
