package main.java.com.familyFarmSeaside.Transaction;

import main.java.com.familyFarmSeaside.Animal.Animal;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Plant;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;
import main.java.com.familyFarmSeaside.Product.Product;
import main.java.com.familyFarmSeaside.Product.ProductList;
import main.java.com.familyFarmSeaside.person.owner.FarmOwner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: trader: Originator in Memento pattern
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class Traders {
    FarmOwner farmOwner;
    private ProductList productList = new ProductList();
    private TransationRecords emptyRecords;

    public void setFarmOwner(FarmOwner farmOwner){
        this.farmOwner=farmOwner;
    }

    public  ProductList getProductList(){return productList;}
    public void updateProductList(ProductList productList){this.productList=productList;}

    public TransationRecords buyProduct(String species, int number){
        ProductList productList1 = new ProductList();
        productList1 = productList;
        if (species .equals("CHICKEN")) {
            for (int i = 0; i < number; i++) {
                Chicken chicken = new Chicken();
                productList.chickenList.add(chicken);
                this.farmOwner.minusMoney(chicken.getBuyValue());
            }
            return new TransationRecords("CHICKEN", TransationRecords.SellOrBuy.BUY,
                    number, new Chicken().getBuyValue(), (int) this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("DOG")){
            for (int i = 0; i < number; i++) {
                Dog dog = new Dog();
                productList.dogList.add(dog);
                this.farmOwner.minusMoney(dog.getBuyValue());
            }
            return new TransationRecords("DOG",TransationRecords.SellOrBuy.BUY,
                    number, new Dog().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("PERCH")){
            for (int i = 0; i < number; i++) {
                Perch perch = new Perch();
                productList.perchList.add(perch);
                this.farmOwner.minusMoney(perch.getBuyValue());
            }
            return new TransationRecords("PERCH",TransationRecords.SellOrBuy.BUY,
                    number,  new Perch().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("APPLE")){
            for (int i = 0; i < number; i++) {
                Apple apple = new Apple();
                productList.appleList.add(apple);
                this.farmOwner.minusMoney(apple.getBuyValue());
            }
            return new TransationRecords("APPLE",TransationRecords.SellOrBuy.BUY,
                    number,  new Apple().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("CHERRY")){
            for (int i = 0; i < number; i++) {
                Cherry cherry = new Cherry();
                productList.cherryList.add(cherry);
                this.farmOwner.minusMoney(cherry.getBuyValue());
            }
            return new TransationRecords("CHERRY",TransationRecords.SellOrBuy.BUY,
                    number,  new Cherry().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("POTATO")){
            for (int i = 0; i < number; i++) {
                Potato potato = new Potato();
                productList.potatoList.add(potato);
                this.farmOwner.minusMoney(potato.getBuyValue());
            }
            return new TransationRecords("POTATO",TransationRecords.SellOrBuy.BUY,
                    number, new Potato().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        else if(species .equals("TOMATO")){
            for (int i = 0; i < number; i++) {
                Tomato tomato = new Tomato();
                productList.tomatoList.add(tomato);
                this.farmOwner.minusMoney(tomato.getBuyValue());
            }
            return new TransationRecords("TOMATO",TransationRecords.SellOrBuy.BUY,
                    number, new Tomato().getBuyValue(), (int)this.farmOwner.getMoney(), productList1);
        }
        return emptyRecords;
    }

    public TransationRecords sellProduct(String species, int number) {
        ProductList productList1 = new ProductList();
        productList1 = productList;
        if (species.equals("CHICKEN")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.chickenList.size(); i++) {
                if (productList.chickenList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.chickenList.size(); i++) {
                int value = new Chicken().getSellValue();
                if (productList.chickenList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.chickenList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("CHICKEN", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("DOG")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.dogList.size(); i++) {
                if (productList.dogList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.dogList.size(); i++) {
                int value = new Dog().getSellValue();
                if (productList.dogList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.dogList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("DOG", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("PERCH")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.perchList.size(); i++) {
                if (productList.perchList.get(number).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.perchList.size(); i++) {
                int value = new Perch().getSellValue();
                if (productList.perchList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.perchList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("PERCH", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("APPLE")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.appleList.size(); i++) {
                if (productList.appleList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.appleList.size(); i++) {
                int value = new Apple().getSellValue();
                if (productList.appleList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    hasSoldNumber++;
                    productList.appleList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("APPLE", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("CHERRY")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.cherryList.size(); i++) {
                if (productList.cherryList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.cherryList.size(); i++) {
                int value = new Cherry().getSellValue();
                if (productList.cherryList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    hasSoldNumber++;
                    productList.cherryList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("CHERRY", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("POTATO")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.potatoList.size(); i++) {
                if (productList.potatoList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.potatoList.size(); i++) {
                int value = new Potato().getSellValue();
                if (productList.potatoList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    hasSoldNumber++;
                    productList.potatoList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("POTATO", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        else if (species.equals("TOMATO")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.tomatoList.size(); i++) {
                if (productList.tomatoList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("超出可售卖的最大数量！");
                return emptyRecords;
            }
            int hasSoldNumber=0;
            for (int i = 0; i < productList.tomatoList.size(); i++) {
                int value = new Tomato().getSellValue();
                if (productList.tomatoList.get(i).getLifestage() == Plant.LifeStage.MATURE) {
                    hasSoldNumber++;
                    productList.tomatoList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if(hasSoldNumber==number) {
                    return new TransationRecords("TOMATO", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productList1);
                }
            }
        }
        return emptyRecords;
    }
}
