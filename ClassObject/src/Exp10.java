class Ride {
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public double getFinalFare() {
        double baseFare = distanceTravelled * pricePerKm;
        double finalFare = baseFare * surgeMultiplier;

        if (distanceTravelled > 20)
            finalFare -= finalFare * 0.10;

        if (surgeMultiplier > 1.5)
            finalFare += 50;

        return finalFare;
    }

    public String getCustomerName() {
        return customerName;
    }
}

public class Exp10 {
    public static void main(String[] args) {
        Ride r = new Ride();

        r.setCustomerName("Himanshu");
        r.setDistanceTravelled(25);
        r.setPricePerKm(15);
        r.setSurgeMultiplier(2);

        System.out.println("Customer: " + r.getCustomerName());
        System.out.println("Final Fare: " + r.getFinalFare());
    }
}