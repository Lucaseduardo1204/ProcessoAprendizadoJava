package memoriaarrayslistas;

public class Product {
    public String name;
    public double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name + "\nR$ " + price;
    }
}
