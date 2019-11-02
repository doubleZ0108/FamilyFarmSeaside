package test;
import main.java.com.familyFarmSeaside.Supply.Proxy.*;

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

        ToolProxy toolProxy=new ToolProxy();

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

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}