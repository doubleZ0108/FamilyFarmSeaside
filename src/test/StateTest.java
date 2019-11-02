package test;
import main.java.com.familyFarmSeaside.Supply.*;
import main.java.com.familyFarmSeaside.Supply.State.ToolContext;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class StateTest {
    public static void stateChanges()
    {
        Tool TestTool=new Tool();
        System.out.println("Create a new tool! And its state is: "+TestTool.getContext().getState().getStateName());

        ToolContext toolContext=TestTool.getContext();

        //To Minimal Wear
        toolContext.alter(-6);
        //To field Tested
        toolContext.alter(-10);
        //To Well Worn
        toolContext.alter(-35);
        //To Battle Scarred
        toolContext.alter(-30);

        //Below 0
        toolContext.alter(-50);

        //To Well Worn
        toolContext.alter(21);
        //To Field Tested
        toolContext.alter(30);
        //To Minimal Wear
        toolContext.alter(35);
        //To Factory New
        toolContext.alter(10);

        //above 100
        toolContext.alter(80);
    }

    public static void main(String []args){
        System.out.println("—————————————-------------------------------------———— Test[State]Pattern —————————————-------------------------------------————");

        System.out.println("Tool : tool() : Inherited from Supply, create instance of Tool.");
        System.out.println("Tool : getContext() : Inherited from Supply, get the context of this Tool");
        System.out.println("ToolContext : getState() : Get the state of this context of this Tool");
        System.out.println("ToolContext : alter() : Alter the value of durability of this context, which may lead to the changing of the state.");
        System.out.println("AbstractToolState : getStateName() : Get the name of this very State.");
        System.out.println("");

        StateTest.stateChanges();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}