//package main.java.com.familyFarmSeaside.Supply.Mediator;
//
//import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Flower;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @program: FamilyFarmSeaside
// * @description: person mediator, help pollination
// * @author: Xuefei Lv
// * @create: 2019/10/29
// **/
//
//public class PersonMediator implements Mediator{
//    private List<Flower>flowers = new ArrayList<Flower>();
//    public void register(Flower flower){
//        if(!flowers.contains(flower))
//        {
//            flowers.add(flower);
//            flower.setMedium(this);
//        }
//    }
//    public  void reply(Flower fl){
//        for(Flower ob:flowers)
//        {
//            if(!ob.equals(fl) && !(ob.getSex()==fl.getSex()))
//            {
//                if(ob.getSex()== Flower.Sex.FEMALE) {
//                    if(!ob.getHasPollen()) {
//                        ((Flower) ob).receiveMessage();
//                        return;
//                    }
//                    ((Flower) ob).receiveMessage();
//                }
//                else {
//                    if(ob.getHasPollen()) {
//                        ((Flower) ob).receiveMessage();
//                        return;
//                    }
//                    ((Flower) ob).receiveMessage();
//                }
//            }
//        }
//    }
//
//}
