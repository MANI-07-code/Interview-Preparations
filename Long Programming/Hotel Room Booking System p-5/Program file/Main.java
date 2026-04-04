import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Customer> customerList =new ArrayList<>();
        Customer c1= new Customer(1, "1234567891","twoBedRoom", 2,"01-01-2025");
        Customer c2= new Customer(2, "4763654634","fourBedRoom", 3,"02-01-2025");
        Customer c3= new Customer(3, "4566778678","fourBedRoom", 2,"02-01-2025");
        Customer c4= new Customer(4, "6746256376","fourBedRoom", 1,"02-01-2025");
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        Management m =new Management();
        for(Customer c:customerList){
            Rooms room = m.roomsAllocation(c);
            if(room != null){
                String freeDate = m.setfreedate(c.getArraivalDay(), c.getDaysOfLiving());
            room.setRoomFreeDate(freeDate);

             System.out.println(
                "Customer " + c.getCustomerId()
                + " booked Room " + room.getRoomId()
                + " Free on " + freeDate
        );

         }else{
        System.out.println(
                "Customer " + c.getCustomerId()
                + " No room available"
        );
            
        }
    }
    
}
}
