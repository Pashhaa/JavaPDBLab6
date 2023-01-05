import Tariffs.CheapTariff;
import Tariffs.ExpensiveTariff;
import Tariffs.MediumTariff;
import Tariffs.Tariff;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Tariff[] tariffs = {
                new CheapTariff("cheap", 100,1500),
                new MediumTariff("medium", 120, 2000, 10),
                new ExpensiveTariff("expensive", 150, 2500, 454, 20)};


        System.out.println(Arrays.toString(TariffSorter.sortTariffs(tariffs)));
        System.out.println(TariffSorter.findTariff(tariffs,160, 160));


    }
}
