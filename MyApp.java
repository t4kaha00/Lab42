//Author: Anup Satyal

<<<<<<< HEAD
=======

>>>>>>> d8be529a915793c01c2f8ef69bb95f2cf869e965
public class main {
    public static void main(String[] args) {
    Product product = new Product("Edam", 3.3, 120);
    System.out.println("Product value is " + product.countValue());
    product.printProduct();
    changeBalance();
    changePrice();
    }
}

class Product {
    private String name;
    private double price;
    private int amount; //Amount in storage
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    public double countValue() {
        return(amount * price);
    }
    
    public void printProduct() {
        System.out.printf("Product %s, price %4.1f and balance %d pcs",
        name,price,amount);
    }

    public changeBalance(int newvalue){

    }

    public changePrice(){}
}