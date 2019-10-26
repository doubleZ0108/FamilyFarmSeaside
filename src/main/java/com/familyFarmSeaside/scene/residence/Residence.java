package main.java.com.familyFarmSeaside.scene.residence;

import main.java.com.familyFarmSeaside.scene.Scene;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class for residence.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Residence extends Scene {
    public Residence(){}
    public Residence(double x){
        super(x);
    }

    public abstract String getDescription();
}
