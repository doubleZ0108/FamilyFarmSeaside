package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.State.HarvestableState;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;
import main.java.com.familyFarmSeaside.Product.ProductList;
import main.java.com.familyFarmSeaside.Supply.Memento.ManageRecords;
import main.java.com.familyFarmSeaside.Supply.Memento.Traders;
import main.java.com.familyFarmSeaside.Supply.Memento.TransationRecords;
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
        System.out.println("—————————————-------------------------------------———— Test[Memento]Pattern —————————————-------------------------------------————");
        System.out.println("Traders : buyProduct() : Trader buys products and creates an order as a memento");
        System.out.println("Traders : sellProduct() : Trader buys products and creates an order as a memento");
        System.out.println("Traders : restoreRecords() : Restores to the specified history state");
        System.out.println("ManageRecords : addRecords() : Add memento to linked lists for administration.");
        System.out.println("");

        MementoTest mementoTest = new MementoTest();
        mementoTest.traders.setFarmOwner(FarmOwner.getInstance());
        System.out.println("------------------------Command List-----------------------");
        System.out.println("**              1 --- Buy the product                    **");
        System.out.println("**              2 --- Buy the product                    **");
        System.out.println("**              3 --- View order list                    **");
        System.out.println("**              4 --- View product information           **");
        System.out.println("**              5 --- A key mature                       **");
        System.out.println("**              6 --- Restore historical state           **");
        System.out.println("**              7 --- Exit test                          **");
        System.out.println("-----------------------------------------------------------");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter command：");
            int command = 0;
            try {
                command = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("The command does 233 not exist. Please retype it！\n");
                continue;
            }
            switch (command){
                case 1:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Product:[CHICKNE,DOG,PERCH,APPLE,CHERRY,TOMATO.POTATO]");
                    System.out.print("Please enter the name of the product you want to buy：");
                    String name = sc1.nextLine();
                    name=name.toUpperCase();
                    if(!(name.equals("CHICKEN")||name.equals("DOG")||name.equals("PERCH")||name.equals("APPLE")||name.equals("CHERRY")||name.equals("TOMATO")||name.equals("POTATO")))
                        {System.out.println("The product name does not exist!");break;}
                    System.out.print("Please enter the quantity：");
                    int number = sc1.nextInt();
                    mementoTest.buy(name,number);
                    break;
                }
                case 2:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Product:[CHICKNE,DOG,PERCH,APPLE,CHERRY,TOMATO.POTATO]");
                    System.out.print("Please enter the name of the product you want to sell(capital)：");
                    String name = sc1.nextLine();
                    name=name.toUpperCase();
                    if(!(name.equals("CHICKEN")||name.equals("DOG")||name.equals("PERCH")||name.equals("APPLE")||name.equals("CHERRY")||name.equals("TOMATO")||name.equals("POTATO")))
                        {System.out.println("The product name does not exist!");break;}
                    System.out.print("Please enter the quantity：");
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
                    System.out.println("All living things are now mature！\n");
                    break;
                }
                case 6:{
                    Scanner sc1 = new Scanner(System.in);
                    mementoTest.viewTransationRecords();
                    System.out.print("Please enter the ORDER_ID you want to restore：");
                    int number = sc1.nextInt();
                    mementoTest.restoreHistoryState(number);
                    System.out.println("Restore success！\n");
                    break;
                }
                case 7:{
                    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
                    return;
                }
                default:{
                    System.out.println("The command does not exist. Please retype it！\n");
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
        System.out.println("");
        System.out.println("Buy: "+species+"  Number："+number);
        manageRecords.addRecords(transationRecords);
        System.out.println("Order created successfully！");
        transationRecords.printRecordsInfo();
        System.out.println("");
    }

    public void sell(String species, int number){
        TransationRecords transationRecords = traders.sellProduct(species,number);
        if (transationRecords !=NullPointerException) {
            System.out.println("Sell: " + species + "  Number：" + number);
            manageRecords.addRecords(transationRecords);
            System.out.println("Order created successfully！");
            transationRecords.printRecordsInfo();
            System.out.println("");
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
            apple.setPlantState(new HarvestableState());
        }
        for (Cherry cherry: productList.cherryList){
            cherry.setPlantState(new HarvestableState());
        }
        for (Tomato tomato: productList.tomatoList){
            tomato.setPlantState(new HarvestableState());
        }
        for (Potato potato: productList.potatoList){
            potato.setPlantState(new HarvestableState());
        }
    }

    public  void  restoreHistoryState(int number){
        traders.restoreRecords(manageRecords, number);
    }
}
