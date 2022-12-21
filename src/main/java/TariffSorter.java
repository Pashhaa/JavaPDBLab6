import java.util.*;

public class TariffSorter {
    public static Tariff[] sortTariffs(Tariff[] tariffs){
        Arrays.sort(tariffs, Comparator.comparingInt(Tariff::getPrice));
        return tariffs;
    }

    public static List<Tariff> findTariff(Tariff[] tariffs, int min, int max){
        List<Tariff> suitedTariffs = new ArrayList<>();
        for (Tariff tariff: tariffs) {
            if(tariff.price <= max && tariff.price >= min){
                suitedTariffs.add(tariff);
            }
        }
        if(suitedTariffs.isEmpty()){
            throw new NoSuchElementException();
        }
        return suitedTariffs;
    }
}
