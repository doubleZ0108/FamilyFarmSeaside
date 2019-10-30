package main.java.com.familyFarmSeaside.Supply.State;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/29
 **/
public class ToolContext {
    private AbstractToolState state;
    public ToolContext()
    {
        state=new FactoryNew(this);
    }
    public void setState(AbstractToolState state)
    {
        this.state=state;
    }
    public AbstractToolState getState()
    {
        return this.state;
    }
    public void alter(float val)
    {
        state.alterDurability(val);
    }
}