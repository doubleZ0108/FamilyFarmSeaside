package main.java.com.familyFarmSeaside.scene.residence;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for farm owner.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Villa extends Residence {
    public Villa(){
        super(50000);
        System.out.println("一栋豪宅被创建");
    }

    @Override
    public String getDescription() {
        return "这是一栋豪宅";
    }

    public int getVillaNumber(){
        return villaNumber;
    }
    public void setVillaNumber(int id){
        villaNumber = id;
    }

    private int villaNumber;

    public Villa(int villaNumber) {
        this.villaNumber = villaNumber;
    }

    public Villa(double x, int villaNumber) {
        super(x);
        this.villaNumber = villaNumber;
    }

    @Override
    public String toString() {
        return "class Villa extends Residence";
    }
}
