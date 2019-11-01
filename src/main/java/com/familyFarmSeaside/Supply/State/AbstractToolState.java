package main.java.com.familyFarmSeaside.Supply.State;
import main.java.com.familyFarmSeaside.Supply.State.ToolContext;
/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/29
 **/
public class AbstractToolState {
    protected ToolContext env;  //环境
    protected String stateName; //状态名
    protected float durability; //耐久

    void checkState() {
        System.out.println("Now, check the state!");
        System.out.println("The current state is "+this.stateName);
        if(this.durability<20)
        {
            System.out.println("Since the durability is "+this.durability+", we change the state to Battle Scarred");
            this.env.setState(new BattleScarred(this.env,this.durability));
        }
        else if(this.durability<50)
        {
            System.out.println("Since the durability is "+this.durability+", we change the state to Well Worn");
            this.env.setState(new WellWorn(this.env,this.durability));
        }
        else if(this.durability<85)
        {
            System.out.println("Since the durability is "+this.durability+", we change the state to Field Tested");
            this.env.setState(new FieldTested(this.env,this.durability));
        }
        else if(this.durability<95)
        {
            System.out.println("Since the durability is "+this.durability+", we change the state to Minimal Wear");
            this.env.setState(new MinimalWear(this.env,this.durability));
        }
        else
        {
            System.out.println("Since the durability is "+this.durability+", we change the state to Factory New");
            this.env.setState(new FactoryNew(this.env,this.durability));
        }
    }

    public void alterDurability(float x) {
        System.out.println("The current durability is "+this.durability);
        System.out.println("Now we alter it by "+x);
        this.durability+=x;
        if(this.durability<0)
        {
            System.out.println("It's below 0, so we set it to 0!");
            this.durability=0;
        }
        else if(this.durability>100)
        {
            System.out.println("It's above 100, so we set it to 100!");
            this.durability=100;
        }
        System.out.println("The final durability is "+this.durability);
        checkState();
    }

    public String getStateName(){
        return this.stateName;
    }

    public ToolContext getEnv() {
        return env;
    }

    public void setEnv(ToolContext env) {
        this.env = env;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "class AbstractToolState";
    }
}


class FactoryNew extends AbstractToolState
{
    public FactoryNew(ToolContext para_env)
    {
        env=para_env;
        stateName="Factory New";
        durability=(float)100.0;
    }

    public FactoryNew(ToolContext para_env, float dura)
    {
        env=para_env;
        stateName="Factory new";
        this.durability=dura;
    }

    @Override
    public String toString() {
        return "class FactoryNew extends AbstractToolState";
    }
}

class MinimalWear extends AbstractToolState
{
    public MinimalWear(ToolContext para_env)
    {
        env=para_env;
        stateName="Minimal Wear";
    }

    public MinimalWear(ToolContext para_env, float dura)
    {
        env=para_env;
        stateName="Minimal wear";
        this.durability=dura;
    }

    @Override
    public String toString() {
        return "class MinimalWear extends AbstractToolState";
    }
}

class FieldTested extends AbstractToolState
{
    public FieldTested(ToolContext para_env)
    {
        env=para_env;
        stateName="Field Tested";
    }

    public FieldTested(ToolContext para_env, float dura)
    {
        env=para_env;
        stateName="Field Tested";
        this.durability=dura;
    }

    @Override
    public String toString() {
        return "class FieldTested extends AbstractToolState";
    }
}

class WellWorn extends AbstractToolState
{
    public WellWorn(ToolContext para_env)
    {
        env=para_env;
        stateName="Well Worn";
    }

    public WellWorn(ToolContext para_env, float dura)
    {
        env=para_env;
        stateName="Well Worn";
        this.durability=dura;
    }

    @Override
    public String toString() {
        return "class WellWorn extends AbstractToolState";
    }
}

class BattleScarred extends AbstractToolState
{
    public BattleScarred(ToolContext para_env)
    {
        env=para_env;
        stateName="Battle Scarred";
    }

    public BattleScarred(ToolContext para_env, float dura)
    {
        env=para_env;
        stateName="Battle Scarred";
        this.durability=dura;
    }

    @Override
    public String toString() {
        return "class BattleScarred extends AbstractToolState";
    }
}