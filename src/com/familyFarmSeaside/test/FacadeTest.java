package com.familyFarmSeaside.test;

import com.familyFarmSeaside.person.worker.longTerm.ResidenceAdministrator;
import com.familyFarmSeaside.person.worker.longTerm.buyer.Buyer;
import com.familyFarmSeaside.person.worker.longTerm.buyer.BuyerFactory;
import com.familyFarmSeaside.scene.residence.ReceptionCenter;
import com.familyFarmSeaside.scene.residence.Villa;
import com.familyFarmSeaside.scene.residence.dormitory.Dormitory;
import com.familyFarmSeaside.scene.residence.facade.ResidenceTask;

import java.util.ArrayList;
import java.util.List;

public class FacadeTest {
    public static void main(String[] args){
        System.out.println("------------测试外观模式------------");

        //新建两个宿舍
        List<Dormitory> dormitoryList = new ArrayList<Dormitory>();
        Dormitory dormitory1 = new Dormitory();
        Dormitory dormitory2 = new Dormitory();
        dormitory1.setDormNumber(1);
        dormitory2.setDormNumber(2);
        dormitoryList.add(dormitory1);
        dormitoryList.add(dormitory2);

        //新建十个LongTermWorker，为方便起见全部创建为Buyer，前四个加入一号寝室，后六个加入二号寝室
        BuyerFactory buyerFactory = new BuyerFactory();
        for(int i = 1 ; i <= 10 ; i ++){
            Buyer temp = (Buyer) buyerFactory.newWorker();
            temp.setWorkerID(i);
            if(i <= 4)
                dormitory1.addLongTermWorker(temp);
            else
                dormitory2.addLongTermWorker(temp);
        }

        //新建两个接待中心
        List<ReceptionCenter> receptionCenterList = new ArrayList<ReceptionCenter>();
        ReceptionCenter receptionCenter1 = new ReceptionCenter();
        ReceptionCenter receptionCenter2 = new ReceptionCenter();
        receptionCenter1.setReceptionCenterNumber(1);
        receptionCenter2.setReceptionCenterNumber(2);
        receptionCenterList.add(receptionCenter1);
        receptionCenterList.add(receptionCenter2);

        //创建两个豪宅
        List<Villa> villaList = new ArrayList<Villa>();
        Villa villa1 = new Villa();
        Villa villa2 = new Villa();
        villa1.setVillaNumber(1);
        villa2.setVillaNumber(2);

        //创建一个住宅管理员
        ResidenceAdministrator residenceAdministrator = new ResidenceAdministrator();

        //给住宿管理员分配工作
        ResidenceTask residenceTask = new ResidenceTask(dormitoryList, receptionCenterList, villaList);
        residenceAdministrator.setResidenceTask(residenceTask);

        //宿舍管理员开始工作
        System.out.println("\n***************以下是住宅管理员工作的内容*****************");
        residenceAdministrator.wakeUp();
        residenceAdministrator.sweep();
        residenceAdministrator.takeTrash();
        residenceAdministrator.lightOff();

        System.out.println("---------------------------------");
    }
}
