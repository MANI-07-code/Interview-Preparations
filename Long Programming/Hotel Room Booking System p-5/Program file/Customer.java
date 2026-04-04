public class Customer {
    private int customerId;
    private String phoneNumber;
    private String typeOfRoomNeeded;
    private int DaysOfLiving;
    private String arraivalDay;


    
    public Customer(int customerId, String phoneNumber, String typeOfRoomNeeded, int daysOfLiving,String arraivalDay) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.typeOfRoomNeeded = typeOfRoomNeeded;
       this. DaysOfLiving = daysOfLiving;
       this.arraivalDay=arraivalDay;

    }



    public int getCustomerId() {
        return customerId;
    }



    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getTypeOfRoomNeeded() {
        return typeOfRoomNeeded;
    }



    public void setTypeOfRoomNeeded(String typeOfRoomNeeded) {
        this.typeOfRoomNeeded = typeOfRoomNeeded;
    }



    public int getDaysOfLiving() {
        return DaysOfLiving;
    }



    public void setDaysOfLiving(int daysOfLiving) {
        DaysOfLiving = daysOfLiving;
    }
    public String getArraivalDay()
    {
        return arraivalDay;
    }
    
}
