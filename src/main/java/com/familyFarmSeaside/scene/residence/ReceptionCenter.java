package main.java.com.familyFarmSeaside.scene.residence;

import main.java.com.familyFarmSeaside.person.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for visitors.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class ReceptionCenter extends Residence {
    private int receptionCenterNumber;
    private List<Visitor> visitors;

    public ReceptionCenter(){
        super(30000);
        visitors = new ArrayList<Visitor>();
        System.out.println("一栋接待中心被创建");
    }

    public ReceptionCenter(int receptionCenterNumber, List<Visitor> visitors) {
        this.receptionCenterNumber = receptionCenterNumber;
        this.visitors = visitors;
    }

    public ReceptionCenter(double x, int receptionCenterNumber, List<Visitor> visitors) {
        super(x);
        this.receptionCenterNumber = receptionCenterNumber;
        this.visitors = visitors;
    }

    @Override
    public String getDescription() {
        return "这是一栋接待中心";
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public int getReceptionCenterNumber(){
        return receptionCenterNumber;
    }

    public void setReceptionCenterNumber(int id){receptionCenterNumber = id;}

    @Override
    public String toString() {
        return "class ReceptionCenter extends Residence";
    }
}
