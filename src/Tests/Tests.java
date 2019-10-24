package Tests;
import Classes.Supply;
import Classes.Consumable;
import Classes.Tool;

/**
 * @program: Farm
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/24
 **/
public class Tests {
    public static void main(String arg[]){
        System.out.println("Create a Tool!");
        Tool toolNo1 = new Tool();

        System.out.println(toolNo1.getToolId());

        System.out.println("Create another Tool!");
        Tool toolNo2 = new Tool();
        System.out.println(toolNo2.getToolId());
    }
}