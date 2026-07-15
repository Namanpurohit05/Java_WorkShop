class Exp1 {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500)
            bill += bill * 0.10;

        return bill;
    }
}

public class Exp2 {
    public static void main(String[] args) {
        Exp1 e = new Exp1();

        e.setCustomerName("Rohan");
        e.setUnitsConsumed(600);
        e.setPricePerUnit(8);

        System.out.println("Final Bill: " + e.getTotalBill());
    }
}