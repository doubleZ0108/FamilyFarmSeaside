package test;

import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;
import main.java.com.familyFarmSeaside.Supply.Visitor.ObjectStructure;
import main.java.com.familyFarmSeaside.Supply.Visitor.spv_admin;
import main.java.com.familyFarmSeaside.Supply.Visitor.spv_peasant;
import main.java.com.familyFarmSeaside.person.visitor.Visitor;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class VisitorTest {
    public static void runtest(){
        System.out.println("Add a tool and a consumable to object structure");
        ObjectStructure os=new ObjectStructure();
        os.add(new Tool());
        os.add(new Consumable("consumable", new Date(), 8, false, 80));
        spv_peasant peasant=new spv_peasant();
        spv_admin admin=new spv_admin();

        System.out.println("Peasant visits!");
        os.accept(peasant);
        System.out.println("------------------------");
        System.out.println("Administrator visits!");
        os.accept(admin);
    }

    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— 测试[Visitor]模式 —————————————-------------------------------------————");

        VisitorTest.runtest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}