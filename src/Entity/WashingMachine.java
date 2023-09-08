/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Enum.ColorEnum;
import Enum.EnergyEfficiencyEnum;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class WashingMachine extends HomeAppliance {

    private int laundryLoad;

//Constructors    
    public WashingMachine() {
    }

    public WashingMachine(int laundryLoad, ColorEnum color, EnergyEfficiencyEnum energyEfficiency, double weight) {
        super(color, energyEfficiency, weight);
        this.laundryLoad = laundryLoad;    }

//getters & setters
    public int getLaundryLoad() {
        return laundryLoad;
    }

    public void setLaundryLoad(int laundryLoad) {
        this.laundryLoad = laundryLoad;
    }
    
//Other Methods
    public static WashingMachine createWashingMachine(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        HomeAppliance homeAppliance;
           
        homeAppliance = createHomeAppliance();
        
        System.out.println("Enter max laundry load (Kg): ");
        int laundryLoad;
        do{
            laundryLoad = input.nextInt();
            if(laundryLoad<=0){
                System.err.println("Laundry load may have a positive value, enter the weight again: ");
            }
        }while(laundryLoad<=0);
        
        return new WashingMachine(laundryLoad, homeAppliance.getColor(), homeAppliance.getEnergyEfficiency(),homeAppliance.weight);   
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        double aux = 0;
        System.out.println(price);
        System.out.println(laundryLoad);
        if(laundryLoad>30){
            aux = 500;
        }
        //sumar lo de la apacidad de carga
        price += aux;   
        System.out.println(price);
    }
    
    

    @Override
    public String toString() {
        return "WashingMachine{" + "price=" + price + ", weight=" + weight + "laundryLoad=" + laundryLoad + '}';
    }

    

}
