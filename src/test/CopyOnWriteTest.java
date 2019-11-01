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
        Dormitory dormitory = new Dormitory();  //新建宿舍楼
        Room room = dormitory.getRoomById(0);  //获取第一间宿舍
        room.moveFurniture(FurnitureKind.Bed);  //移动第一件宿舍的床
        room.moveFurniture(FurnitureKind.Chair);  //移动第一间宿舍的椅子
        room.moveFurniture(FurnitureKind.Desk);  //移动第一间宿舍的桌子
        System.out.println("------------------------------------------");

    }
}
