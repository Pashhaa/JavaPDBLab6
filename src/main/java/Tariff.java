public abstract class Tariff {
    public String name;
    public int price;

    public int gbQuantity;

    public int smsQuantitty;

    public int callMinutes;

    public Tariff(String name, int price, int callMinutes){
        this.name = name;
        this.price = price;
        this.callMinutes = callMinutes;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tariff\s" + name +
                "\sprice=" + price ;
    }
}
