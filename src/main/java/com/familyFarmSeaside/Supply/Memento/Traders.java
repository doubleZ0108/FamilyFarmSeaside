package main.java.com.familyFarmSeaside.Supply.Memento;

import main.java.com.familyFarmSeaside.Animal.Animal;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Plant;
import main.java.com.familyFarmSeaside.Plant.State.HarvestableState;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;
import main.java.com.familyFarmSeaside.Product.ProductList;
import main.java.com.familyFarmSeaside.person.owner.FarmOwner;

import java.util.HashMap;
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

    public void setFarmOwner(FarmOwner farmOwner) {
        this.farmOwner = farmOwner;
    }

    public ProductList getProductList() {
        return productList;
    }

    //It is used to restore the historical state
    public void updateProductList(ProductList productList) {
        this.productList = productList;
    }

    //Buy the product and create a memento
    public TransationRecords buyProduct(String species, int number) {
        HashMap<String , List<HashMap<String,String >>> productInfo = new HashMap<>();
        productInfo = productList.getProductInfo();
        if (species.equals("CHICKEN")) {
            for (int i = 0; i < number; i++) {
                Chicken chicken = new Chicken();
                productList.chickenList.add(chicken);
                this.farmOwner.minusMoney(chicken.getBuyValue());
            }
            return new TransationRecords("CHICKEN", TransationRecords.SellOrBuy.BUY,
                    number, new Chicken().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("DOG")) {
            for (int i = 0; i < number; i++) {
                Dog dog = new Dog();
                productList.dogList.add(dog);
                this.farmOwner.minusMoney(dog.getBuyValue());
            }
            return new TransationRecords("DOG", TransationRecords.SellOrBuy.BUY,
                    number, new Dog().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("PERCH")) {
            for (int i = 0; i < number; i++) {
                Perch perch = new Perch();
                productList.perchList.add(perch);
                this.farmOwner.minusMoney(perch.getBuyValue());
            }
            return new TransationRecords("PERCH", TransationRecords.SellOrBuy.BUY,
                    number, new Perch().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("APPLE")) {
            for (int i = 0; i < number; i++) {
                Apple apple = new Apple();
                productList.appleList.add(apple);
                this.farmOwner.minusMoney(apple.getBuyValue());
            }
            return new TransationRecords("APPLE", TransationRecords.SellOrBuy.BUY,
                    number, new Apple().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("CHERRY")) {
            for (int i = 0; i < number; i++) {
                Cherry cherry = new Cherry();
                productList.cherryList.add(cherry);
                this.farmOwner.minusMoney(cherry.getBuyValue());
            }
            return new TransationRecords("CHERRY", TransationRecords.SellOrBuy.BUY,
                    number, new Cherry().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("POTATO")) {
            for (int i = 0; i < number; i++) {
                Potato potato = new Potato();
                productList.potatoList.add(potato);
                this.farmOwner.minusMoney(potato.getBuyValue());
            }
            return new TransationRecords("POTATO", TransationRecords.SellOrBuy.BUY,
                    number, new Potato().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        } else if (species.equals("TOMATO")) {
            for (int i = 0; i < number; i++) {
                Tomato tomato = new Tomato();
                productList.tomatoList.add(tomato);
                this.farmOwner.minusMoney(tomato.getBuyValue());
            }
            return new TransationRecords("TOMATO", TransationRecords.SellOrBuy.BUY,
                    number, new Tomato().getBuyValue(), (int) this.farmOwner.getMoney(), productInfo);
        }
        return emptyRecords;
    }

    //Sell the product and create a memento
    public TransationRecords sellProduct(String species, int number) {
        HashMap<String , List<HashMap<String,String >>> productInfo = new HashMap<>();
        productInfo = productList.getProductInfo();
        if (species.equals("CHICKEN")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.chickenList.size(); i++) {
                if (productList.chickenList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.chickenList.size(); i++) {
                int value = new Chicken().getSellValue();
                if (productList.chickenList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.chickenList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("CHICKEN", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("DOG")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.dogList.size(); i++) {
                if (productList.dogList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.dogList.size(); i++) {
                int value = new Dog().getSellValue();
                if (productList.dogList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.dogList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("DOG", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("PERCH")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.perchList.size(); i++) {
                if (productList.perchList.get(number).getLifestage() == Animal.LifeStage.ADULT) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.perchList.size(); i++) {
                int value = new Perch().getSellValue();
                if (productList.perchList.get(i).getLifestage() == Animal.LifeStage.ADULT) {
                    hasSoldNumber++;
                    productList.perchList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("PERCH", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("APPLE")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.appleList.size(); i++) {
                if (productList.appleList.get(i).getPlantState().equals("Harvestable")) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.appleList.size(); i++) {
                int value = new Apple().getSellValue();
                if (productList.appleList.get(i).getPlantState().equals("Harvestable")) {
                    hasSoldNumber++;
                    productList.appleList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("APPLE", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("CHERRY")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.cherryList.size(); i++) {
                if (productList.cherryList.get(i).getPlantState().equals("Harvestable")) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.cherryList.size(); i++) {
                int value = new Cherry().getSellValue();
                if (productList.cherryList.get(i).getPlantState().equals("Harvestable")) {
                    hasSoldNumber++;
                    productList.cherryList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("CHERRY", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("POTATO")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.potatoList.size(); i++) {
                if (productList.potatoList.get(i).getPlantState().equals("Harvestable")) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.potatoList.size(); i++) {
                int value = new Potato().getSellValue();
                if (productList.potatoList.get(i).getPlantState().equals("Harvestable")) {
                    hasSoldNumber++;
                    productList.potatoList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("POTATO", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        } else if (species.equals("TOMATO")) {
            int numberBeSold = 0;
            for (int i = 0; i < productList.tomatoList.size(); i++) {
                if (productList.tomatoList.get(i).getPlantState().equals("Harvestable")) {
                    numberBeSold++;
                }
            }
            if (numberBeSold < number) {
                System.out.println("Exceeding the maximum quantity available for sale！");
                return emptyRecords;
            }
            int hasSoldNumber = 0;
            for (int i = 0; i < productList.tomatoList.size(); i++) {
                int value = new Tomato().getSellValue();
                if (productList.tomatoList.get(i).getPlantState().equals("Harvestable")) {
                    hasSoldNumber++;
                    productList.tomatoList.remove(i);
                    this.farmOwner.addMoney(value);
                }
                if (hasSoldNumber == number) {
                    return new TransationRecords("TOMATO", TransationRecords.SellOrBuy.SELL,
                            number, value, (int) this.farmOwner.getMoney(), productInfo);
                }
            }
        }
        return emptyRecords;
    }

    //Restore the historical state
    public void restoreRecords(ManageRecords manageRecords, int num) {
        TransationRecords transationRecords = manageRecords.getTransationRecordsList().get(num);
        ProductList productList = new ProductList();
        HashMap<String, List<HashMap<String, String>>> productInfo = transationRecords.getProductInfo();

        for (String key : productInfo.keySet()) {
            List<HashMap<String, String>> value = productInfo.get(key);
            switch (key) {
                case "Chicken": {
                    for (HashMap<String, String> productHashMap : value) {
                        Chicken chicken = new Chicken();
                        chicken.setAnimalInfo(productHashMap);
                        productList.chickenList.add(chicken);
                    }
                    break;
                }
                case "Dog":{
                    for (HashMap<String, String> productHashMap : value) {
                        Dog dog = new Dog();
                        dog.setAnimalInfo(productHashMap);
                        productList.dogList.add(dog);
                    }
                    break;
                }
                case "Perch": {
                    for (HashMap<String, String> productHashMap : value) {
                        Perch perch = new Perch();
                        perch.setAnimalInfo(productHashMap);
                        productList.perchList.add(perch);
                    }
                    break;
                }
                case "Apple": {
                    for (HashMap<String, String> productHashMap : value) {
                        Apple apple = new Apple();
                        apple.setPlantInfo(productHashMap);
                        productList.appleList.add(apple);
                    }
                    break;
                }
                case "Cherry":{
                    for (HashMap<String, String> productHashMap : value) {
                        Cherry cherry = new Cherry();
                        cherry.setPlantInfo(productHashMap);
                        productList.cherryList.add(cherry);
                    }
                    break;
                }
                case  "Tomato":{
                    for (HashMap<String, String> productHashMap : value) {
                        Tomato tomato = new Tomato();
                        tomato.setPlantInfo(productHashMap);
                        productList.tomatoList.add(tomato);
                    }
                    break;
                }
                case "Potato":{
                    for (HashMap<String, String> productHashMap : value) {
                        Potato potato = new Potato();
                        potato.setPlantInfo(productHashMap);
                        productList.potatoList.add(potato);
                    }
                    break;
                }
            }
        }
        updateProductList(productList);
        if (transationRecords.getSellOrBuy() == TransationRecords.SellOrBuy.SELL) {
            farmOwner.minusMoney(transationRecords.getTransactionAmount());
        } else {
            farmOwner.addMoney(transationRecords.getTransactionAmount());
        }
    }

    public FarmOwner getFarmOwner() {
        return farmOwner;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public TransationRecords getEmptyRecords() {
        return emptyRecords;
    }

    public void setEmptyRecords(TransationRecords emptyRecords) {
        this.emptyRecords = emptyRecords;
    }

    @Override
    public String toString() {
        return "class Traders";
    }
}
