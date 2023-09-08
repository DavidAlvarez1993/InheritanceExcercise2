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
public class HomeAppliance {
//ATTRIBUTES    
    
    private ColorEnum color;
    private EnergyEfficiencyEnum energyEfficiency;
    protected double weight;
    protected static final int BASE_PRICE = 1000;
    protected static double price = BASE_PRICE;;
    
//CONSTRUCTORS
    public HomeAppliance() {
    }

    public HomeAppliance(ColorEnum color, EnergyEfficiencyEnum energyEfficiency, double weight) {
        this.color = color;
        this.energyEfficiency = energyEfficiency;
        this.weight = weight;
    }
//GETTERS & SETTERS
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public EnergyEfficiencyEnum getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(EnergyEfficiencyEnum energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static int getBASE_PRICE() {
        return BASE_PRICE;
    }
    
//Other METHODS
    private static EnergyEfficiencyEnum checkEnergyEfficiency(String letter){
        EnergyEfficiencyEnum energyEffcy;
        try {
            energyEffcy = EnergyEfficiencyEnum.valueOf(letter.toUpperCase());
        } catch (IllegalArgumentException e) {
            energyEffcy = EnergyEfficiencyEnum.F;
            System.err.println("Wrong energy Efficiency rank. Settled by default as " + energyEffcy);
        }
        return energyEffcy;
    }
    
    private static ColorEnum checkColor(String colorInput){
        ColorEnum color1;
        try {
            color1 = ColorEnum.valueOf(colorInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            color1 = ColorEnum.WHITE;
            System.err.println("Wrong color. Settled by default as " + color1);
        }
        
        return color1;
    }
    
    public void finalPrice(){
        int priceOffset;
        
        if (weight < 20)
            priceOffset = 100;
        else if (weight < 50)
            priceOffset = 500;
        else if (weight < 80)
            priceOffset = 800;
        else
            priceOffset = 1000;
        
        price = BASE_PRICE + this.energyEfficiency.getPriceOffset() + priceOffset;
    }
    
    public static HomeAppliance createHomeAppliance(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Enter the energy efficiency category (A-F): ");
        EnergyEfficiencyEnum energyEffcy;
        energyEffcy = checkEnergyEfficiency(input.next());
        
        System.out.println("Enter the color of the home appliance(white, black, blue, red, grey):");
        ColorEnum color;
        color = checkColor(input.next());
        
        System.out.println("Enter weight (Kg): ");
        double weight;
        do{
            weight = input.nextDouble();
            if(weight<=0){
                System.err.println("Weight may have a positive value, enter the weight again: ");
            }
        }while(weight <= 0);   
        
        
        return new HomeAppliance(color, energyEffcy, weight);
    }
    

    @Override
    public String toString() {
        return "HomeAppliance{" + "price=" + price + ", color=" + color + ", energyEfficiency=" + energyEfficiency + ", weight=" + weight + '}';
    }

    
}
