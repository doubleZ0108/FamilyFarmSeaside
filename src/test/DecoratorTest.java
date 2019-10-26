package test;

import main.java.com.familyFarmSeaside.scene.residence.ReceptionCenter;
import main.java.com.familyFarmSeaside.scene.residence.Residence;
import main.java.com.familyFarmSeaside.scene.residence.Villa;
import main.java.com.familyFarmSeaside.scene.residence.decorator.CentralAirCondition;
import main.java.com.familyFarmSeaside.scene.residence.decorator.InfraredAlarm;
import main.java.com.familyFarmSeaside.scene.residence.decorator.Monitor;

public class DecoratorTest {
    public static void main(String[] args){
        //尽量不要用Dormitory来测试，因为在创建Dormitory时会同时创建内部的room，会在孔氏台产生大量输出，妨碍观察

        System.out.println("------------测试装饰模式------------");

        //创建一个未加装饰地接待中心
        Residence receptionCenter = new ReceptionCenter();
        System.out.print(receptionCenter.getDescription());
        System.out.println("，其价格为" + receptionCenter.getCost());
        //给接待中心添加红外报警器
        receptionCenter = new InfraredAlarm(receptionCenter);
        System.out.print(receptionCenter.getDescription());
        System.out.println("，其价格为" + receptionCenter.getCost() + '\n');


        //创建一个未加装饰的豪宅
        Residence villa = new Villa();
        System.out.print(villa.getDescription());
        System.out.println("，其价格为" + villa.getCost());
        //给豪宅添加中央空调
        villa = new CentralAirCondition(villa);
        //给豪宅添加监视器
        villa = new Monitor(villa);
        System.out.print(villa.getDescription());
        System.out.println("，其价格为" + villa.getCost() + '\n');
        System.out.println("---------------------------------");

    }
}
