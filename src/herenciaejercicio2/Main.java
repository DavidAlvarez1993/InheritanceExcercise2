/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import Entity.HomeAppliance;
import Entity.WashingMachine;

/**
 *
 * @author David
 */
public class Main {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeAppliance hA;
//        hA = HomeAppliance.createHomeAppliance();
//        System.out.println(hA);
        hA = WashingMachine.createWashingMachine();
        //System.out.println(hA);
        hA.finalPrice();
    }   
    
}
