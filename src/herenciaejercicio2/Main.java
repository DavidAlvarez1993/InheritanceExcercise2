/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import Entity.HomeAppliance;
import Entity.Television;
import Entity.WashingMachine;
import Enum.ColorEnum;
import Enum.EnergyEfficiencyEnum;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Main {

    /**
     * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
     * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
     * televisores, con valores ya asignados. Luego, recorrer este array y
     * ejecutar el método precioFinal() en cada electrodoméstico. Se deberá
     * también mostrar el precio de cada tipo de objeto, es decir, el precio de
     * todos los televisores y el de las lavadoras. Una vez hecho eso, también
     * deberemos mostrar, la suma del precio de todos los Electrodomésticos. Por
     * ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de
     * 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos,
     * 2000 para lavadora y 5000 para televisor.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<HomeAppliance> appliances = new ArrayList<>();
        Television tv1 = new Television(42, false, ColorEnum.RED, EnergyEfficiencyEnum.A, 55.5);
        Television tv2 = new Television(35, true, ColorEnum.GREY, EnergyEfficiencyEnum.D, 47.5);
        WashingMachine wm1 = new WashingMachine(40, ColorEnum.WHITE, EnergyEfficiencyEnum.D, 89.7);
        WashingMachine wm2 = new WashingMachine(50, ColorEnum.BLUE, EnergyEfficiencyEnum.C, 109.9);

        appliances.add(tv1);
        appliances.add(tv2);
        appliances.add(wm1);
        appliances.add(wm2);

        for (HomeAppliance appliance : appliances) {
            appliance.finalPrice();
            System.out.println(appliance + " precio final: " + appliance.getPrice());
        }

        double sumatv = 0;
        System.out.println("-------------Television----------------");
        for (HomeAppliance appliance : appliances) {
            if (appliance instanceof Television) {
                
                System.out.println(appliance + " precio final: " + appliance.getPrice());
                sumatv += appliance.getPrice();
            }
        }
        
        System.out.println("Total tv's: " + sumatv);

        double sumawm = 0;
        System.out.println("-------------Washing-Machines----------");
        for (HomeAppliance appliance : appliances) {
            if (appliance instanceof WashingMachine) {
                
                System.out.println(appliance + " precio final: " + appliance.getPrice());
                sumawm += appliance.getPrice();
            }
        }

        System.out.println("Total wm's: " + sumawm);
//        Another way
//        appliances.stream().map((appliance) -> {
//            appliance.finalPrice();
//            return appliance;
//        }).forEachOrdered((appliance) -> {
//            System.out.println(appliance.getPrice());
//        });
    }

}
