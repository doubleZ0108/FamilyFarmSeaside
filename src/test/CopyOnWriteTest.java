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
        System.out.println("----------Test Copy On Write、Reference Counting、Sharable----------");
        Dormitory dormitory = new Dormitory();  //新建宿舍楼，这时只会创建一套家具对象

        Room room = dormitory.getRoomById(0);  //获取第一间宿舍
        room.moveFurniture(FurnitureKind.Bed);  //移动第一间宿舍的床，这时会创建备份，在备份上移动。

        room.moveFurniture(FurnitureKind.Bed);  //再次移动第一间宿舍的床，这时直接移动，不会创建备份。
        System.out.println("--------------------------------------------------------------------");

    }
}
