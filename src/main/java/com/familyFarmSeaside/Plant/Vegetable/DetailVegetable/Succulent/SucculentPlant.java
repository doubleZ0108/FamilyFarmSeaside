package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Succulent;

/**
 * @program: FamilyFarmSeaside
 * @description: The single part of SucculentBonsai, which can be contained in SucculentCluster.
 * @author: stern
 * @create: 2019/10/27
 **/
public class SucculentPlant extends SucculentBonsai {
    public SucculentPlant(String species){
        super(species);
    }
    public SucculentPlant() {}

    @Override
    protected void add(SucculentBonsai succulentBonsai){
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getSpecies());
    }
}
