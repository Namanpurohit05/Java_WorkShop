class HotelBooking {
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getFinalBill() {
        double bill = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7)
            bill -= bill * 0.15;

        return bill;
    }
}

public class Exp7 {
    public static void main(String[] args) {
        HotelBooking h = new HotelBooking();

        h.setGuestName("Karan");
        h.setRoomPricePerNight(2000);
        h.setNumberOfNights(8);

        System.out.println("Final Bill: " + h.getFinalBill());
    }
}