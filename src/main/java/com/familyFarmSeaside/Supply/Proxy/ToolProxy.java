package main.java.com.familyFarmSeaside.Supply.Proxy;
import main.java.com.familyFarmSeaside.Supply.Proxy.ToolSubject;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class ToolProxy implements ToolSubject{

    private Tool toolInstance;

    @Override
    public boolean take() {
        if (toolInstance==null)
        {
            toolInstance=new Tool();
        }
        preTake();
        boolean out=toolInstance.take();
        postTake();

        return out;
    }
    public void preTake()
    {
        System.out.println("Doing preTake functions");
    }
    public void postTake()
    {
        System.out.println("Doing postTake functions");
    }

    @Override
    public boolean returnTool() {
        if (toolInstance==null)
        {
            toolInstance=new Tool();
        }
        preReturn();
        boolean out=toolInstance.returnTool();
        postReturn();

        return out;
    }
    public void preReturn()
    {
        System.out.println("Doing preReturn functions");
    }
    public void postReturn()
    {
        System.out.println("Doing postReturn functions");
    }

    public Tool getToolInstance() {
        return toolInstance;
    }

    public void setToolInstance(Tool toolInstance) {
        this.toolInstance = toolInstance;
    }

    @Override
    public String toString() {
        return "class ToolProxy implements ToolSubject";
    }
}