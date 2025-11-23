package ConstrutoresThisSobrecargaEncapsulamento;

public class NewProduct {
    public String name;
    public double price;
    public int quantity;


    // Aqui criaremos um construtor para impedir a criação de objetos com valores nulos ou iguais a 0.
    // Ao definir um construtor que recebe parâmetros, somos obrigados a fornecer os valores
    // no momento da instanciação do objeto.
    // Dessa forma, evitamos que atributos recebam valores padrão (como null ou 0),
    // já que o construtor exige que eles sejam informados explicitamente.
    public NewProduct(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // SOBRECARGA – Podemos disponibilizar mais de uma versão de um construtor,
    // desde que apresentem diferenças na lista de parâmetros.
    // Isso permite instanciar objetos de maneiras distintas, conforme a necessidade.
    public NewProduct(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Também é possível incluirmos um constutor padrão
    public NewProduct(){}


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


//TESTES FEITOS NO MAIN.JAVA
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Name of product: ");
//        String name = scan.nextLine();
//        System.out.println("Price of product");
//        double price = scan.nextDouble();
//        System.out.println("Quantity in stock: ");
//        int quantity = scan.nextInt();

//        Product product1 = new Product(name, price, quantity);   //Nova Instanciação do objeto
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
