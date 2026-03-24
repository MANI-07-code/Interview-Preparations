import java.util.*;
public class Parkinglot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Slot st=new Slot();
        while(true){
        System.out.println("Enter your choice:");
        System.out.println("1. park a vechicle.");
        System.out.println("2. remove a vechicle.");
        System.out.println("3.exit");
        int cho = sc.nextInt();
        sc.nextLine();
        switch (cho) {
            case 1:
               // Slot st=new Slot();
                int as=st.availableslots();
                if(as<=10)
                {
                System.out.println("There are "+ as + "slots are available");
                System.out.println("Enter the vechicle number:");
                String vechiclenumber=sc.nextLine();
                System.out.println("Enter  customer name:");
                String customername=sc.nextLine();
                Vehicle v1=new Vehicle(vechiclenumber,customername);
                st.parkvechicle(v1);
                break;
                }
                else{
                  System.out.println("parking slots are unavailable!!");
                  return;
                  
                }
            case 2:
                System.out.println("Enter your slot number:");
                int slotnum=sc.nextInt();
               // Slot s =new Slot();
                st.removevechicle(slotnum);

            case 3:
                return;
        }
        }
        
    }

}
