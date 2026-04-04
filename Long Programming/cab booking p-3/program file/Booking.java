import java.util.*;
public class Booking {
   
    



    
private int bookid=1;

     



    private List<Cab> cablist = new ArrayList<>();
    List<Book> listbook =new ArrayList<>();

    Booking(int numberOfCabs){
        for(int i=1;i<=numberOfCabs;i++){
            cablist.add(new Cab(i));
        }
    }





    int chargedForBooking(char pickupPlace,char dropPlace){
        int distance=Math.abs(pickupPlace-dropPlace);
        distance=distance*15;
        int charged=100;
        distance-=5;
        charged+=distance*10;
        return charged;
    }






    Cab findCab(char pickupPlace,int pickupTime){

        List<Cab>freeCab =new ArrayList<>();
        for(Cab c:cablist){
            if(c.isFree(pickupTime,pickupPlace)){
                freeCab.add(c);
            }
        }
        if(freeCab.isEmpty()){
            return null;
        }
        List<Cab> nearestCab =new ArrayList<>();
        int mindis=10;
        for(Cab c:freeCab){
            int distance = Math.abs( c.getCurrentspot() -pickupPlace);
            if(distance<mindis)
                mindis=distance;
        }
        for(Cab c:freeCab){
             int distance = Math.abs( c.getCurrentspot() -pickupPlace);
            if(distance==mindis)
                nearestCab.add(c);
        }
        Cab selected=nearestCab.get(0);
        for(Cab c:nearestCab){
           if(c.getEarned()<selected.getEarned())
            selected=c;
        }
        return selected;
    }

    void bookCab(Customer c){
        Cab selected=findCab(c.getPickupPlace(),c.getPickupTime());
        if(selected==null){
            System.out.println("No cab is Available in this time");
        return ;
        }
        int charge =chargedForBooking(c.getPickupPlace(),c.getDropPlace());

        int droptime=c.getPickupTime()+Math.abs(c.getPickupPlace()-c.getDropPlace());
        Book b1 =new Book(bookid,droptime,charge,selected,c);
        listbook.add(b1);
        bookid++;
        selected.setFreetime(droptime);
        selected.setCurrentspot(c.getDropPlace());
        selected.setEarned(charge + selected.getEarned());
       System.out.println("Cab-"+selected.getCabid()+" is allocated");
    }
    void displayCab(){
        System.out.println("Booking list of cab ");
        System.out.println("BOOKING ID    CUSTOMER ID    FROM    TO     PICKING TIME     DROP TIME     AMOUNT");
        for(Book b: listbook){
            int droptime=b.getC().getPickupTime()+Math.abs(b.getC().getPickupPlace()-b.getC().getDropPlace());
           System.out.printf("%-5d %-5d %-3c %-3c %-5d %-5d %-5d",b.getBookingId(),b.getC().getId(),b.getC().getPickupPlace(),b.getC().getDropPlace(),b.getC().getPickupTime(),droptime,b.getAmout());
           System.out.println();
        }
    }
    
}
