//package test;
//
//import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Flower;
//import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
//import main.java.com.familyFarmSeaside.Supply.Mediator.Mediator;
//import main.java.com.familyFarmSeaside.Supply.Mediator.PersonMediator;
//
//import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: mediator test
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

//public class MediatorTest {
//
//    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.flowering();
//        List<Flower> femaleFlowerList = apple.getFemaleFlowerList();
//        List<Flower> maleFlowerList = apple.getMaleFlowerList();
//        Mediator personMediator = new PersonMediator();
//        for (Flower flower : femaleFlowerList) {
//            personMediator.register(flower);
//        }
//        for (Flower flower : maleFlowerList) {
//            personMediator.register(flower);
//        }
//
//        System.out.println("-----雌花1发送受粉请求-----");
//        femaleFlowerList.get(0).sendMessage();
//        System.out.println("-----雄花1发送传粉请求-----");
//        maleFlowerList.get(0).sendMessage();
//        System.out.println("-----雌花2发送受粉请求-----");
//        femaleFlowerList.get(1).sendMessage();
//        System.out.println("-----雄花2发送传粉请求-----");
//        maleFlowerList.get(1).sendMessage();
//
//    }
//}
