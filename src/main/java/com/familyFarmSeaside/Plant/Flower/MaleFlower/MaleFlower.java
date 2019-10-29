package main.java.com.familyFarmSeaside.Plant.Flower.MaleFlower;

import main.java.com.familyFarmSeaside.Plant.Flower.Flower;

/**
 * @program: FamilyFarmSeaside
 * @description: male flower
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class MaleFlower extends Flower {
    public MaleFlower(){
        super();
        sex = Sex.MALE;
        hasPollen=true;
    }

    public Sex getSex(){
        return sex;
    }

    public boolean getHasPollen(){
        return hasPollen;
    }


    public void sendMessage(){
        System.out.println("雄花当前拥有花粉，可以人工传粉...");
        hasPollen = false;
        mediator.reply(this);
    }
    public void receiveMessage(){
        if(hasPollen) {
            System.out.println("雄花收到传粉请求，进行人工传粉...");
        }
        else {
            System.out.println("雄花没有花粉...");
        }
    }
}
