package Classes;

/**
 * @program: Farm
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/24
 **/
public class Tool extends Supply{
    private static int id_count=100000;
    protected int id;
    protected float durality;
    protected boolean isOccupied;

    public Tool(){
        this.id = id_count++;
        this.durality = (float)100.0;
        this.isOccupied = false;
    }

    public boolean take(){
        if(this.isOccupied)
        {
            System.out.println("This tool has been taken!");
            return false;
        }

        this.isOccupied = true;
        return true;
    }

    public boolean returnTool(){
        if(!this.isOccupied)
        {
            System.out.println("This tool hasn't been taken!");
            return false;
        }

        this.isOccupied = false;
        return true;
    }

    public void repire(){
        this.durality = (float)100.0;
    }

    public boolean isBroken(){
        if(this.durality<=0)
        {
            return true;
        }
        return false;
    }

    public void abrase(float val){
        this.durality -= val;
    }

    public int getToolId(){
        return this.id;
    }
}