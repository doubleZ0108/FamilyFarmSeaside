package main.java.com.familyFarmSeaside.Plant.Flower;

import main.java.com.familyFarmSeaside.Plant.Mediator.Mediator;
import main.java.com.familyFarmSeaside.Plant.Mediator.PersonMediator;

/**
 * @program: FamilyFarmSeaside
 * @description: Flower class （Colleague），植物分为异花授粉与自花受粉
 *                       自花授粉无需人工帮助，异花授粉需人工帮助，在目前拥有的植物中
 *                       苹果、樱桃为异花授粉植物，土豆、马铃薯为自花授粉植物
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

 public abstract class Flower {
    static public enum Sex {MALE, FEMALE}      //雄花 雌花

    protected Mediator mediator;
    protected Sex sex;                                             //花的性别
    protected boolean hasPollen;                            //是否拥有花粉

    abstract public Sex getSex();
    abstract public boolean getHasPollen();
    abstract public void sendMessage();                           //对于雄花，送出花粉；对于雌花，送出需要花粉的信息
    abstract public void receiveMessage();                         //对于雄花，接收需要花粉的请求；对于雌花，接收花粉
    public void setMedium(Mediator mediator)
    {
       this.mediator=mediator;
    }
}
