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
public class Television extends HomeAppliance {

    private int resolution;
    private boolean DTTTuner;

    public Television() {
    }

    public Television(int resolution, boolean DTTTuner, ColorEnum color, EnergyEfficiencyEnum energyEfficiency, double weight) {
        super(color, energyEfficiency, weight);
        this.resolution = resolution;
        this.DTTTuner = DTTTuner;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isDTTTuner() {
        return DTTTuner;
    }

    public void setDTTTuner(boolean DTTTuner) {
        this.DTTTuner = DTTTuner;
    }
    
    

    protected static int checkResolution() {
        System.out.println("Enter the resolution of the TV: ");
        int res;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        do {
            res = input.nextInt();
            if (res <= 0) {
                System.err.println("Laundry load may have a positive value, please enter it again: ");
            }
        } while (res <= 0);

        return res;
    }

    protected static boolean checkDTT() {
        System.out.println("Does the TV have a DTT tuner?: (y-n)");
        String DTT;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        do {
            DTT = input.next();
            if (DTT.equalsIgnoreCase("y")) {
                return true;
            } else if (DTT.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.err.println("Laundry load may have a positive value, please enter it again: ");
            }
        } while (true);
    }

    public static HomeAppliance createTV() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        HomeAppliance homeAppliance;

        homeAppliance = createHomeAppliance();
        int res = checkResolution();
        boolean DTT = checkDTT();

        return new Television(res, DTT, homeAppliance.getColor(), homeAppliance.getEnergyEfficiency(), homeAppliance.weight);
    }

    @Override
    public void finalPrice() {
        if (!hasCalculated) {

            finalPriceCalc();

            if (resolution >= 40) {
                price *= 1.3;
            }
            if (DTTTuner) {
                price += 500;
            }
            
            hasCalculated = true;
        }
    }

    @Override
    public String toString() {
        return "Television{" + "price=" + price + ", weight=" + weight + "resolution=" + resolution + ", DTTTuner=" + DTTTuner + '}';
    }

}
