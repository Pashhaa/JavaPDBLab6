package Tariffs;

import Tariffs.Tariff;

public class MediumTariff extends Tariff {

    public MediumTariff(String name, int price, int callMinutes, int smsQuantity) {
        super(name, price, callMinutes);
        this.smsQuantitty = smsQuantity;
    }

}
