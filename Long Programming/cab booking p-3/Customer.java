public class Customer {
    private int id;
    private char pickupPlace;
    private char dropPlace;
   private int pickupTime;
    public Customer(int id, char pickupPlace, char dropPlace, int pickupTime) {
        this.id = id;
        this.pickupPlace = pickupPlace;
        this.dropPlace = dropPlace;
        this.pickupTime=pickupTime;
    }
    public int getId() {
        return id;
    }
    public char getPickupPlace() {
        return pickupPlace;
    }
    public char getDropPlace() {
        return dropPlace;
    }
    public int getPickupTime() {
        return pickupTime;
    }
    
   
    
}
