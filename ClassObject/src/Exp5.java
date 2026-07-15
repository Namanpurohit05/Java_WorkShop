class ShoppingCart {
    private String productName;
    private double price;
    private int quantity;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        double total = price * quantity;

        if (total > 5000)
            total -= total * 0.10;

        return total;
    }
}

public class Exp5 {
    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();

        s.setProductName("Laptop");
        s.setPrice(6000);
        s.setQuantity(1);

        System.out.println("Final Amount: " + s.getTotalCost());
    }
}