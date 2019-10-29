package test;

import main.java.com.familyFarmSeaside.Plant.Flower.FemaleFlower.FemaleFlower;
import main.java.com.familyFarmSeaside.Plant.Flower.MaleFlower.MaleFlower;
import main.java.com.familyFarmSeaside.Plant.Mediator.Mediator;
import main.java.com.familyFarmSeaside.Plant.Mediator.PersonMediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: mediator test
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class MediatorTest {

    public static void main(String[] args) {
        Mediator personMediator = new PersonMediator();
        List<FemaleFlower> femaleFlowers=new ArrayList<FemaleFlower>();
        List<MaleFlower>maleFlowers=new ArrayList<MaleFlower>();
        for (int i =0; i<5; i++) {
            FemaleFlower flower = new FemaleFlower();
            femaleFlowers.add(flower);
            personMediator.register(flower);
        }
        for (int i =0; i<5; i++) {
            MaleFlower flower = new MaleFlower();
            maleFlowers.add(flower);
            personMediator.register(flower);
        }

        System.out.println("-----雌花1发送受粉请求-----");
        femaleFlowers.get(0).sendMessage();
        System.out.println("-----雄花1发送传粉请求-----");
        maleFlowers.get(0).sendMessage();
        System.out.println("-----雌花2发送受粉请求-----");
        femaleFlowers.get(1).sendMessage();
        System.out.println("-----雄花2发送传粉请求-----");
        maleFlowers.get(1).sendMessage();

    }
}
