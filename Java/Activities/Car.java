package Activities;

import java.sql.SQLOutput;

public class Car {
    String color;
    String transmission;
   int make;
   int tyres;
   int doors;
   public Car(){
       tyres=4;
       doors=4;
   }
    void displayCharacteristics(){
        System.out.println("number of tyres is "+tyres);
        System.out.println("number of doors is "+doors);
        System.out.println("Color of Car is "+color);
        System.out.println("name os transmission is "+transmission);
        System.out.println("year of making is "+make);

    }
    void accelarate(){
        System.out.println("Car is moving");
    }
    void brake(){
       System.out.println("Car has stopped.");
    }
}
