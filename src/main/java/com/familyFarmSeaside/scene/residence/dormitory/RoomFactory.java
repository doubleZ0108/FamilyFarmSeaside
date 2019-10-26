package main.java.com.familyFarmSeaside.scene.residence.dormitory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory calss of room
 * @author: saturn
 * @create: 2019/10/24
 **/
public class RoomFactory {
    public Room createRoom(int i){
        System.out.println("\nRoom of number " + i + " created");
        return new Room(i);
    }
}
