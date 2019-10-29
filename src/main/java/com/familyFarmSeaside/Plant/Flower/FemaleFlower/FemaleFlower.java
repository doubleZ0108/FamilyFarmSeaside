package main.java.com.familyFarmSeaside.Plant.Flower.FemaleFlower;

import main.java.com.familyFarmSeaside.Plant.Flower.Flower;

/**
 * @program: FamilyFarmSeaside
 * @description: femalflower
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public  class FemaleFlower extends Flower {
    public FemaleFlower(){
        super();
        sex = Sex.FEMALE;
        hasPollen=false;
    }

    public Sex getSex(){
        return sex;
    }

    public boolean getHasPollen(){
        return hasPollen;
    }

    public void sendMessage(){
        System.out.println("雌花当前未授粉，需要人工授粉...");
        mediator.reply(this);
    }
    public void receiveMessage(){
        if(hasPollen) {
            System.out.println("雌花当前已授粉...");
        }
        else {
            System.out.println("雌花授粉成功...");
            hasPollen=true;
        }
    }

}
