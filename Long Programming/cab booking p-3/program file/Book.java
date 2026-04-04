public class Book {
     private int bookingId;
    private int dropTime;
    private int amout;
    private Cab t;
    private Customer c;
    public Book(int bookingId, int dropTime, int amout, Cab t, Customer c) {
        this.bookingId = bookingId;
        this.dropTime = dropTime;
        this.amout = amout;
        this.t = t;
        this.c = c;
    }
    public int getBookingId() {
        return bookingId;
    }
    public int getDropTime() {
        return dropTime;
    }
    public int getAmout() {
        return amout;
    }
    public Cab getT() {
        return t;
    }
    public Customer getC() {
        return c;
    }
    

}
