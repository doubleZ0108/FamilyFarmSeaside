package test;

import main.java.com.familyFarmSeaside.scene.residence.dormitory.Dormitory;
import main.java.com.familyFarmSeaside.scene.residence.dormitory.Room;
import main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture.FurnitureKind;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for flyweightMethod
 * @author: saturn
 * @create: 2019/10/25
 **/
public class CopyOnWriteTest {
    public static void main(String[] args){
        /**
         * @description:
         *
         *
         * @param args : 命令行参数
         *
         * @return : void
         **/
        System.out.println("------------Test Copy On Write------------");
        Dormitory dormitory = new Dormitory();
        Room room = dormitory.getRoomById(0);
        room.moveFurniture(FurnitureKind.Bed);
        room.moveFurniture(FurnitureKind.Chair);
        room.moveFurniture(FurnitureKind.Desk);
        System.out.println("---------------------------------");

    }
}
