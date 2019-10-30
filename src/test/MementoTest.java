package test;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;
import main.java.com.familyFarmSeaside.Product.ProductList;
import main.java.com.familyFarmSeaside.person.worker.longTerm.Transaction.ManageRecords;
import main.java.com.familyFarmSeaside.person.worker.longTerm.Transaction.Traders;
import main.java.com.familyFarmSeaside.person.worker.longTerm.Transaction.TransationRecords;
import main.java.com.familyFarmSeaside.person.owner.FarmOwner;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: memento pattern test
 * @author: Xuefei Lv
 * @create: 2019/10/30
 **/

public class MementoTest {
    public Traders traders = new Traders();
    public ManageRecords manageRecords = new ManageRecords();
    private Object NullPointerException;


    public static void main(String[] args) {
        MementoTest mementoTest = new MementoTest();
        mementoTest.traders.setFarmOwner(FarmOwner.getInstance());
        System.out.println("--------------备忘录模式测试--------------");
        System.out.println("**                 1 --- 买入产品                   **");
        System.out.println("**                 2 --- 卖出产品                   **");
        System.out.println("**                 3 --- 查看订单列表             **");
        System.out.println("**                 4 --- 查看产品信息             **");
        System.out.println("**                 5 --- 使目前生物生长          **");
        System.out.println("**                 6 --- 退出测试                   **");
        System.out.println("--------------------------------------------");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            int order = sc.nextInt();
            switch (order){
                case 1:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("请输入要买入的产品名称：");
                    String name = sc1.nextLine();
                    System.out.println("请输入数量：");
                    int number = sc1.nextInt();
                    mementoTest.buy(name,number);
                    break;
                }
                case 2:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("请输入要卖出的产品名称：");
                    String name = sc1.nextLine();
                    System.out.println("请输入数量：");
                    int number = sc1.nextInt();
                    mementoTest.sell(name,number);
                    break;
                }
                case 3:{
                    mementoTest.viewTransationRecords();
                    break;
                }
                case 4:{
                    mementoTest.viewProductInfo();
                    break;
                }
                case 5:{
                    mementoTest.grow();
                    System.out.println("当前生物已生长！");
                    break;
                }
                case 6:{
                    return;
                }
                default:{
                    System.out.println("命令不存在，请重新输入！\n");
                }
            }
        }
    }


    public  void viewTransationRecords(){
        manageRecords.printRecords();
    }

    public  void viewProductInfo(){
        traders.getProductList().printProductInfo();
    }

    public void buy(String species, int number){
        TransationRecords transationRecords = traders.buyProduct(species,number);
        System.out.println("买入"+species+"  数量："+number+"\n");
        manageRecords.addRecords(transationRecords);
        System.out.println("创建订单成功！\n");
        transationRecords.printRecordsInfo();
    }

    public void sell(String species, int number){
        TransationRecords transationRecords = traders.sellProduct(species,number);
        if (transationRecords !=NullPointerException) {
            System.out.println("卖出" + species + "  数量：" + number + "\n");
            manageRecords.addRecords(transationRecords);
            System.out.println("创建订单成功！\n");
            transationRecords.printRecordsInfo();
        }
    }

    public void grow(){
        ProductList productList = traders.getProductList();
        for (Chicken chicken: productList.chickenList){
            chicken.grow();
        }
        for (Dog dog: productList.dogList){
            dog.grow();
        }
        for (Perch perch: productList.perchList){
            perch.grow();
        }
        for (Apple apple: productList.appleList){
            apple.grow1();
            apple.grow2();
        }
        for (Cherry cherry: productList.cherryList){
            cherry.grow1();
            cherry.grow2();
        }
        for (Tomato tomato: productList.tomatoList){
            tomato.grow1();
            tomato.grow2();
        }
        for (Potato potato: productList.potatoList){
            potato.grow1();
            potato.grow2();
        }
    }
}
