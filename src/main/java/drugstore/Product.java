package drugstore;

public class Product {
    private String name;
    private Manufacturer manufacturer;

    public Product(String name, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString(){
        return "Product: " + name + " Manufacturer: " + manufacturer.getName() + " Country: " + manufacturer.getCountry();
    }
}
