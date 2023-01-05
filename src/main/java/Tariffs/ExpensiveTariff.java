package Tariffs;

import Tariffs.Tariff;

public class ExpensiveTariff extends Tariff {

    public ExpensiveTariff(String name, int price, int callMinutes,int smsQuantity, int gbQuantity) {
        super(name, price, callMinutes);
        this.callMinutes = callMinutes;
        this.smsQuantitty = smsQuantity;
        this.gbQuantity = gbQuantity;
    }
}
