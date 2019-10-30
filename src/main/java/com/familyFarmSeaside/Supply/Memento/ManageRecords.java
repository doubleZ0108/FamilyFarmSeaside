package main.java.com.familyFarmSeaside.Supply.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: manage records: Caretaker in Memento Pattern
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class ManageRecords {
    //存储交易记录的链表
    List<TransationRecords> transationRecordsList=new ArrayList<>();

    public void addRecords(TransationRecords transationRecords){
        transationRecordsList.add(transationRecords);
    }

    public  void  printRecords(){
        int i=0;
        for (TransationRecords transationRecords: transationRecordsList){
            System.out.println("订单ID："+i);
            i++;
            transationRecords.printRecordsInfo();;
            System.out.println("\n");
        }
    }


}
