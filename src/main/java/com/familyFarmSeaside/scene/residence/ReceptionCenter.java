package main.java.com.familyFarmSeaside.scene.residence;

import main.java.com.familyFarmSeaside.person.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ReceptionCenter extends Residence {
    public ReceptionCenter(){
        super(30000);
        visitors = new ArrayList<Visitor>();
        System.out.println("一栋接待中心被创建");
    }
    public int getReceptionCenterNumber(){
        return receptionCenterNumber;
    }
    public void setReceptionCenterNumber(int id){receptionCenterNumber = id;}

    @Override
    public String getDescription() {
        return "这是一栋接待中心";
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    private int receptionCenterNumber;
    private List<Visitor> visitors;

    @Override
    public String toString() {
        return "class ReceptionCenter extends Residence";
    }
}
