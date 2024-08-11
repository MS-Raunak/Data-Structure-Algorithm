package sorting.comparator;

public class Mobile {

    String brand;
    double price;
    int ram;

    public Mobile(String brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
