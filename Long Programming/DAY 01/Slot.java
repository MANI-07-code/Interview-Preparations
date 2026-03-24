
public class Slot {
    Vehicle[] slots = new Vehicle[10];

     void parkvechicle(Vehicle v) {

        for (int i = 0; i < 10; i++) {

            if (slots[i] == null) {
                slots[i] = v;
                System.out.println("Vehicle parked at slot " + (i + 1));
                return;
            }
        }
    }


    void removevechicle(int slotnumber) {

        if (slotnumber < 1 || slotnumber > 10) {
            System.out.println("Invalid slot number");
            return;
        }

        if (slots[slotnumber - 1] != null) {
            slots[slotnumber - 1] = null;
            System.out.println("Vehicle removed from slot " + slotnumber);
        } else {
            System.out.println("Slot already empty");
        }
    }

    int availableslots() {

        int a = 0;

        for (int i = 0; i < 10; i++) {
            if (slots[i] == null)
                a++;
        }

        return a;
    }

}