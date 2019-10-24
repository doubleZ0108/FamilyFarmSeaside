package com.familyFarmSeaside.scene.residence;

import com.familyFarmSeaside.person.visitor.Visitor;

import java.util.List;

public class ReceptionCenter extends Residence {
    public ReceptionCenter(){
        super(30000);
    }
    public int getReceptionCenterNumber(){
        return ReceptionCenterNumber;
    }

    @Override
    public String getDescription() {
        return "这是一栋接待中心";
    }

    private int ReceptionCenterNumber;
    private List<Visitor> Visitors;
}
