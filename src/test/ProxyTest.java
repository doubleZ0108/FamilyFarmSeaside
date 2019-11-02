package test;
import main.java.com.familyFarmSeaside.Supply.Proxy.*;
import main.java.com.familyFarmSeaside.Supply.Tool.*;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class ProxyTest {
    public static void runTest()
    {
        System.out.println("—————————————-------------------------------------———— 测试[Proxy]模式 —————————————-------------------------------------————");

        Tool tool = new Tool();
        ToolProxy toolProxy=new ToolProxy(tool);

        System.out.println("Try taking a Tool.");
        toolProxy.take();
        System.out.println();

        System.out.println("Try taking this Tool again.");
        toolProxy.take();
        System.out.println();

        System.out.println("Try returning This Tool.");
        toolProxy.returnTool();
        System.out.println();

        System.out.println("Try returning This Tool again");
        toolProxy.returnTool();
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("Tool : Tool() : Inherited from Supply, create an instance of Tool.");
        System.out.println("ToolProxy : ToolProxy() : Implements ToolSubjects, create an instance of ToolProxy and bind it to an Tool.");
        System.out.println("ToolProxy : take() : Implements ToolSubjects, take the tool through the proxy.");
        System.out.println("ToolProxy : returnTool() : Implements ToolSubjects, return the tool to the proxy.");
        System.out.println("");


        ProxyTest.runTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}