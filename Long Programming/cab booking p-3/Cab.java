

public class Cab {
    // private int car01=101;
    // private int car02=102;
    // private int bike1=1001;
    // private int bike2=1002;
    private int cabid;
    private int freetime;
    private int earned;
    private char currentspot;
    //private List<Cab> booking;
    Cab(int id){
        this.cabid=id;
        this.currentspot='A';
        this.freetime=0;
        this.earned=0;
       // booking=new ArrayList<>();

       
    }
    boolean isFree(int pickupTime,char pickupPlace){
        int distance=Math.abs(currentspot-pickupPlace);
        return distance+freetime<=pickupTime;
    }

    public int getcabid(){
        return cabid;
    }

    public char getCurrentspot(){
        return currentspot;
    }

    public int getFreetime(){
        return freetime;
    }
    public int getCabid() {
        return cabid;
    }
    public int getEarned() {
        return earned;
    }
    
    public void setFreetime(int freetime) {
        this.freetime = freetime;
    }
    public void setEarned(int earned) {
        this.earned = earned;
    }
    public void setCurrentspot(char currentspot) {
        this.currentspot = currentspot;
    }
    
    
    
    
}
