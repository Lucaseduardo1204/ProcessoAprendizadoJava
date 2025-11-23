package CursoModuloPOO.Entities;

public class Product {
    public String name;
    public Double price;
    public int quantity;


    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ",\n$" + price + ",\n" + quantity + "units, \nTotal $: " + TotalValueInStock();
    }

}


//  MAIN.JAVA
//        Product product1 = new Product();
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Name of product: ");
//        product1.name = scan.nextLine();
//        System.out.println("Price of product");
//        product1.price = scan.nextDouble();
//        System.out.println("Quantity in stock: ");
//        product1.quantity = scan.nextInt();
//
//        System.out.println("\n************************PRODUCT DATA*********************************************");
//        System.out.println(product1.toString());
//
//        System.out.println("\nEnter the number of products to be added in stock: ");
//        int numberForAdd = scan.nextInt();
//        product1.AddProducts(numberForAdd);
//
//        System.out.println("\n************************ NEW PRODUCT DATA*****************************************");
//        System.out.printf("name: %s \nPrice: %.2f \nOrigin quantity: %d ", product1.name, product1.price, product1.quantity);
//        System.out.println("\n************************TOTAL VALUE IN STOCK: ***********************************");
//        System.out.printf("$: %.2f",  product1.TotalValueInStock());
//
//        System.out.println("\nEnter the number of products to be removed from stock: ");
//        int numberForRemove = scan.nextInt();
//        product1.RemoveProducts(numberForRemove);
//
//        System.out.println("\n************************ NEW PRODUCT DATA*****************************************");
//        System.out.printf("name: %s \nPrice: %.2f \nOrigin quantity: %d ", product1.name, product1.price, product1.quantity);
//        System.out.println("\n************************TOTAL VALUE IN STOCK: ***********************************");
//        System.out.printf("$: %.2f",  product1.TotalValueInStock());
