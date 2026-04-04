import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Management {
    List<Rooms> roomsList =new ArrayList<>();
    Management(){
    Rooms r1 =new Rooms(101,"twoBedRoom",1000);
    Rooms r2 =new Rooms(102,"twoBedRoom",1000);
    Rooms r3 =new Rooms(103,"fourBedRoom",2000);
    Rooms r4 =new Rooms(104,"fourBedRoom",2000);
     roomsList.add(r1);
     roomsList.add(r2);
     roomsList.add(r3);
     roomsList.add(r4);
    }

    String setfreedate(String ArraivalDate,int DaysofLiving){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date=LocalDate.parse(ArraivalDate,formatter);
        LocalDate newDate=date.plusDays(DaysofLiving);
        return newDate.format(formatter);

    }
    public Rooms roomsAllocation(Customer c){
        for(Rooms r:roomsList){
            if(r.getRoomType().equals(c.getTypeOfRoomNeeded()))
            {
                 if(r.getRoomFreeDate() == null){
                return r;
            }

            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate Arraival = LocalDate.parse(c.getArraivalDay(),formatter);
            LocalDate freeDate = LocalDate.parse(r.getRoomFreeDate(),formatter);
            if(Arraival.isAfter(freeDate)||Arraival.equals(freeDate)){
                return r;
            }
        }
    }
        return null;
    }




}
