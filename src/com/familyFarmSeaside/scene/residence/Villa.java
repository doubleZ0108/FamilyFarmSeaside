package com.familyFarmSeaside.scene.residence;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for farm owner.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Villa extends Residence {
    public Villa(){
        super(50000);
    }

    @Override
    public String getDescription() {
        return "这是一栋豪宅";
    }
}
