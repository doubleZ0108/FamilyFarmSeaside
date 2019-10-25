package com.familyFarmSeaside.test;

import com.familyFarmSeaside.scene.residence.dormitory.Dormitory;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for flyweightMethod
 * @author: saturn
 * @create: 2019/10/25
 **/
public class FlyweightMethodTest {
    public static void main(String[] args){
        /**
         * @description: 测试享元模式, 具体为一栋宿舍楼的所有的寝室共享桌子、椅子、床的对象，这三个对象只创建一次。在创建
         * Dormitory对象时会创建所有寝室对象，这些寝室对象的家具对象都是共享的。
         *
         * @param args : 命令行参数
         *
         * @return : void
         **/
        System.out.println("------------测试享元模式------------");
        Dormitory dormitory = new Dormitory();
        System.out.println("---------------------------------");

    }
}
