package test.DesignPatternTest;

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
        System.out.println("—————————————-------------------------------------———— Test[Copy On Write]Pattern —————————————-------------------------------------————");
        System.out.println("Dormitory : getRoomById() : Get the corresponding room by id.");
        System.out.println("Room : moveFurniture() : Move the furniture to somewhere.");


        Dormitory dormitory = new Dormitory();  //新建宿舍楼，这时只会创建一套家具对象

        System.out.println("\nNow let's move the bed of the first room");
        Room room = dormitory.getRoomById(0);  //获取第一间宿舍
        room.moveFurniture(FurnitureKind.Bed);  //移动第一间宿舍的床，这时会创建备份，在备份上移动。

        System.out.println("\nAgain, let's move the bed of the first room");
        room.moveFurniture(FurnitureKind.Bed);  //再次移动第一间宿舍的床，这时直接移动，不会创建备份。

        System.out.println("\nNow let's move the bed of every room");
        for(int i = 0; i < Dormitory.ROON_NUM; i++){
            System.out.println("Room " + i + ": ");
            dormitory.getRoomById(i).moveFurniture(FurnitureKind.Bed);
            System.out.println("\n");
        }
        System.out.println("--------------------------------------------------------------------");
    }
}
