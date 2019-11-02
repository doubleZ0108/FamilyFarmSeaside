package test;

import main.java.com.familyFarmSeaside.Plant.Color.Color;
import main.java.com.familyFarmSeaside.Plant.Color.Green;
import main.java.com.familyFarmSeaside.Plant.Color.Yellow;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea.Pea;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea.SmoothPea;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea.WrinkledPea;

/**
 * @program: FamilyFarmSeaside
 * @description: test for bridge pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class BridgeTest {
    static public void testBridge(){

        System.out.println("新建一个color对象...");
        System.out.println("绿色...");
        Color green=new Green();
        System.out.println("新建一个pea对象...");
        System.out.println("圆粒豌豆...");
        Pea greenSmoothPea=new SmoothPea(green);
        System.out.println("输出pea的名字："+greenSmoothPea.getName());
        System.out.println("新建另一个pea对象...");
        Pea greenWrinkledPea=new WrinkledPea(green);
        System.out.println("皱粒豌豆...");
        System.out.println("输出pea的名字："+greenWrinkledPea.getName());
        System.out.println("新建另一个color对象...");
        Color yellow=new Yellow();
        System.out.println("黄色...");
        System.out.println("再新建一个pea对象...");
        Pea yellowSmoothPea=new SmoothPea(yellow);
        System.out.println("圆粒豌豆...");
        System.out.println("输出pea的名字："+yellowSmoothPea.getName());
        System.out.println("最后新建一个pea对象...");
        Pea yellowWrinkledPea=new WrinkledPea(yellow);
        System.out.println("皱粒豌豆...");
        System.out.println("输出pea的名字："+yellowWrinkledPea.getName());

    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— 测试[Bridge]模式 —————————————-------------------------------------————");

        testBridge();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}