public class Component {
    private String name;
    private double price;
    private String characteristics;

    public Component(String name, double price, String characteristics) {
        this.name = name;
        this.price = price;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCharacteristics() {
        return characteristics;
    }

}