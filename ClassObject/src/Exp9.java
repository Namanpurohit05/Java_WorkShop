class LibraryBook {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    public double getTotalFine() {
        double fine = daysLate * finePerDay;

        if (daysLate > 10)
            fine += 100;

        return fine;
    }
}

public class Exp9 {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook();

        b.setBookName("Java Programming");
        b.setDaysLate(12);
        b.setFinePerDay(10);

        System.out.println("Total Fine: " + b.getTotalFine());
    }
}