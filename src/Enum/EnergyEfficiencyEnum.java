/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author David
 */
public enum EnergyEfficiencyEnum {
    A(1000),
    B(800),
    C(600),
    D(500),
    E(300),
    F(100);

    public final int priceOffset;

    EnergyEfficiencyEnum (int price) {
        this.priceOffset = price;
    }

    public int getPriceOffset() {
        return priceOffset;
    }

}
