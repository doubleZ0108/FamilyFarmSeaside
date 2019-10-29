package main.java.com.familyFarmSeaside.scene.residence.dormitory;

import main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture.*;

/**
 * @program: FamilyFarmSeaside
 * @description: The class of room
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Room {
    public Desk getDesk() {
        return desk;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }

    public int getRoomId() {
        return roomId;
    }

    private Desk desk;
    private Bed bed;
    private Chair chair;
    private int roomId;

    public Room(int i){
        roomId = i;
        FurnitureFactory furnitureFactory = FurnitureFactory.getInstance();
        bed = (Bed)furnitureFactory.getFurnitureByKind(FurnitureKind.Bed);
        chair = (Chair)furnitureFactory.getFurnitureByKind(FurnitureKind.Chair);
        desk = (Desk)furnitureFactory.getFurnitureByKind(FurnitureKind.Desk);
    }

    public void moveFurniture(FurnitureKind kind){
        switch (kind){
            case Bed:
                if(bed.isSharable()) {
                    bed = new Bed();
                }
                bed.move();
                break;
            case Desk:
                if(desk.isSharable()) {
                    desk = new Desk();
                }
                desk.move();
                break;
            case Chair:
                if(chair.isSharable()) {
                    chair = new Chair();
                }
                chair.move();
                break;
        }
    }
}
