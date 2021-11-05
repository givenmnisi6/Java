//I DO 2
public class TestAll {
    
    public static void main(String[] args) {
        
        //list of Vehicles (Electric cars and Petrol cars)

        PCar p1 = new PCar("Polo Vivo", "MOZ 562 MP", 55, 3, 1.5, 14.22);
        PCar p2 = new PCar("Audi A3", "DBM 867 GP", 80, 3, 2.0, 12.22);
        PCar p3 = new PCar("Polo TSI", "SBN 235 EC", 100, 4, 2.0, 16.22);

        ECar e1 = new ECar("BMW i8", "JAY 444 NW", 75, 4,45,3); 
        ECar e2 = new ECar("Tesla Model S", "PVG 823 NW", 130, 2, 70, 2); 
        ECar e3 = new ECar("Audi E-tron Quattro", "IEV 301 GP", 120, 4, 65, 3); 

        //Using the addMethod to add into list
        list.add(0,p1);
        list.add(1,e1);
        list.add(2,p2);
        list.add(3,e2);
        list.add(4,p3);
        list.add(5,e3);

        if(list.sortList())
        System.out.println(list);     
    }
}
