package test;

import main.java.com.familyFarmSeaside.person.worker.longTerm.ResidenceAdministrator;
import main.java.com.familyFarmSeaside.person.worker.longTerm.buyer.Buyer;
import main.java.com.familyFarmSeaside.person.worker.longTerm.buyer.BuyerFactory;
import main.java.com.familyFarmSeaside.scene.residence.ReceptionCenter;
import main.java.com.familyFarmSeaside.scene.residence.Villa;
import main.java.com.familyFarmSeaside.scene.residence.dormitory.Dormitory;
import main.java.com.familyFarmSeaside.scene.residence.facade.ResidenceTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the facade pattern.
 * @author: Yimin Li
 * @create: 2019/10/19
 **/
public class FacadeTest {
    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Facade]Pattern —————————————-------------------------------------————");
        System.out.println("以下是系统初始化阶段：");

        System.out.println("Dormitory : setDormNumber() : Set the dormitory number.");
        System.out.println("Dormitory : addLongTermWorker() : Add a long term worker to dormitory.");
        System.out.println("BuyerFactory : newWorker() : Create a new worker in buyer factory.");
        System.out.println("");

        /**
         * create two dormitories
         */
        List<Dormitory> dormitoryList = new ArrayList<Dormitory>();
        Dormitory dormitory1 = new Dormitory();
        Dormitory dormitory2 = new Dormitory();
        dormitory1.setDormNumber(1);
        dormitory2.setDormNumber(2);
        dormitoryList.add(dormitory1);
        dormitoryList.add(dormitory2);

        /**
         * Create 10 long-term workers. To make the test expilicit, all the workers are buyer.
         * By default, 4 buyers are added to No.1 dormitory, and the 6 buyers left are added to No.2 dormitory.
         */
        BuyerFactory buyerFactory = new BuyerFactory();
        for(int i = 1 ; i <= 10 ; i ++){
            Buyer temp = (Buyer) buyerFactory.newWorker();
            temp.setWorkerID(i);
            if(i <= 4)
                dormitory1.addLongTermWorker(temp);
            else
                dormitory2.addLongTermWorker(temp);
        }

        /**
         * create 2 acception centers
         */
        List<ReceptionCenter> receptionCenterList = new ArrayList<ReceptionCenter>();
        ReceptionCenter receptionCenter1 = new ReceptionCenter();
        ReceptionCenter receptionCenter2 = new ReceptionCenter();
        receptionCenter1.setReceptionCenterNumber(1);
        receptionCenter2.setReceptionCenterNumber(2);
        receptionCenterList.add(receptionCenter1);
        receptionCenterList.add(receptionCenter2);

        /**
         * create 2 villas
         */
        List<Villa> villaList = new ArrayList<Villa>();
        Villa villa1 = new Villa();
        Villa villa2 = new Villa();
        villa1.setVillaNumber(1);
        villa2.setVillaNumber(2);
        villaList.add(villa1);
        villaList.add(villa2);


        /**
         * create a residence administrator
         */
        ResidenceAdministrator residenceAdministrator = new ResidenceAdministrator();

        /**
         * assign a task to the residence administrator
         */
        ResidenceTask residenceTask = new ResidenceTask(dormitoryList, receptionCenterList, villaList);
        residenceAdministrator.setResidenceTask(residenceTask);

        System.out.println("\n***************以下是住宅管理员工作的内容*****************");
        System.out.println("系统已经为您创建好一个住宅管理员，他将负责两个宿舍，两个接待中心，两个豪宅的工作。");
        System.out.println("请选择住宅管理员要执行的工作[1 叫床 | 2 打扫内务 | 3 运走垃圾 | 4 关灯 | 5 退出]");
        Scanner scanner = new Scanner(System.in);
        int i;
        while(true){
            i = scanner.nextInt();
            if(i == 1)
                residenceAdministrator.wakeUp();
            else if(i == 2)
                residenceAdministrator.sweep();
            else if(i == 3)
                residenceAdministrator.takeTrash();
            else if(i == 4)
                residenceAdministrator.lightOff();
            else if(i == 5)
                break;
            else
                System.out.print("输入的数字无效，");
            System.out.println("请选择住宅管理员要执行的工作[1 叫床 | 2 打扫内务 | 3 运走垃圾 | 4 关灯 | 5 退出]");
        }
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
