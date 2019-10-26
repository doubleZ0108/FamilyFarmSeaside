package main.java.com.familyFarmSeaside.scene.residence.facade;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.scene.residence.dormitory.Dormitory;
import main.java.com.familyFarmSeaside.scene.residence.Villa;
import main.java.com.familyFarmSeaside.scene.residence.ReceptionCenter;

import java.util.List;

public class ResidenceTask {
    private List<Dormitory> dormitories;
    private List<ReceptionCenter> receptionCenters;
    private List<Villa> villas;
    public ResidenceTask(List<Dormitory> ld, List<ReceptionCenter> lr, List<Villa> lv){
        dormitories = ld;
        receptionCenters = lr;
        villas = lv;
    }
    public void wakeUp(){
        for(Dormitory dormitory : dormitories){
            System.out.println("正在叫醒第" + dormitory.getDormNumber() +"号宿舍...");
            for(LongTermWorker longTermWorker : dormitory.getLongTermWorkers()){
                longTermWorker.getUp();
            }
        }
    }
    public void lightOff(){
        for(Dormitory dormitory : dormitories){
            System.out.println("正在关闭第" + dormitory.getDormNumber() +"号宿舍的灯...");
            for(LongTermWorker longTermWorker : dormitory.getLongTermWorkers()){
                longTermWorker.goToSleep();
            }
        }
    }
    public void sweep(){
        for(Dormitory dormitory : dormitories){
            System.out.println("正在打扫第" + dormitory.getDormNumber() + "号宿舍...");
        }
        for(ReceptionCenter receptionCenter : receptionCenters){
            System.out.println("正在打扫第" + receptionCenter.getReceptionCenterNumber() + "号接待中心...");
        }
    }
    public void takeTrash(){
        for(Dormitory dormitory : dormitories){
            System.out.println("正在运走第" + dormitory.getDormNumber() + "号宿舍的垃圾...");
        }
        for(ReceptionCenter receptionCenter : receptionCenters){
            System.out.println("正在运走第" + receptionCenter.getReceptionCenterNumber() + "号接待中心的垃圾...");
        }
        for(Villa villa : villas)
            System.out.println("正在运走第" + villa.getVillaNumber() + "号豪宅的垃圾...");
    }
}