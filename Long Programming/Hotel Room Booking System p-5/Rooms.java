public class Rooms{
    private int roomId;
    private String roomType;
    private float roomCost;
    private String roomFreeDate;
    public Rooms(int roomId, String roomType, float roomCost) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomCost = roomCost;
        this.roomFreeDate=null;
    }
    public int getRoomId() {
        return roomId;
    }
    public String getRoomType() {
        return roomType;
    }
    public float getRoomCost() {
        return roomCost;
    }
    void setRoomFreeDate(String freeDate){
        this.roomFreeDate=freeDate;
    }

    public String getRoomFreeDate(){
    return roomFreeDate;
}
    

}