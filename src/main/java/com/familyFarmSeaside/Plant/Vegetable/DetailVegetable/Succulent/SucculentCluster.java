package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Succulent;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The Container part of SucculentBonsai, meaning the mutiple plants of Succulent.
 * @author: stern
 * @create: 2019/10/27
 **/
public class SucculentCluster extends SucculentBonsai {
    private List<SucculentBonsai> succulents = new ArrayList<SucculentBonsai>();
    public SucculentCluster(String species){
        super(species);
    }
    public SucculentCluster() {}

    @Override
    public void add(SucculentBonsai succulentBonsai){
        succulents.add(succulentBonsai);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getSpecies() + " Cluster:");
        for (SucculentBonsai suc : succulents) {
            suc.show(depth + 2);
        }
    }
}