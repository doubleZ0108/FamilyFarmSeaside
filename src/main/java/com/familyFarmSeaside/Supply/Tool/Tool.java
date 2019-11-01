package main.java.com.familyFarmSeaside.Supply.Tool;
import main.java.com.familyFarmSeaside.Supply.Supply;
import main.java.com.familyFarmSeaside.Supply.Element;
import main.java.com.familyFarmSeaside.Supply.Proxy.ToolSubject;
import main.java.com.familyFarmSeaside.Supply.State.ToolContext;
import main.java.com.familyFarmSeaside.Supply.Visitor.SupplyVisitor;

/**
 * @program: Farm
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/24
 **/
public class Tool extends Supply implements ToolSubject, Element {
    private static int id_count=100000;
    protected int id;
    protected ToolContext context;
    protected boolean isOccupied;

    @Override
    public void accept(SupplyVisitor visitor) {
        visitor.visitTool(this);
    }

    public Tool(){
        this.id = id_count++;
        this.context = new ToolContext();
        this.isOccupied = false;
    }

    public boolean take(){
        if(this.isOccupied)
        {
            System.out.println("This tool has been taken!");
            return false;
        }

        System.out.println("Take this tool!");
        this.isOccupied = true;
        return true;
    }

    public boolean returnTool(){
        if(!this.isOccupied)
        {
            System.out.println("This tool hasn't been taken!");
            return false;
        }

        System.out.println("Return this tool!");
        this.isOccupied = false;
        return true;
    }

    public void repire(float val){
        this.context.alter(val);
    }

    public void abrase(float val){
        this.context.alter(-val);
    }

    public ToolContext getContext()
    {
        return this.context;
    }

    public int getToolId(){
        return this.id;
    }

    public static int getId_count() {
        return id_count;
    }

    public static void setId_count(int id_count) {
        Tool.id_count = id_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContext(ToolContext context) {
        this.context = context;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "class Tool extends Supply implements ToolSubject, Element";
    }
}
