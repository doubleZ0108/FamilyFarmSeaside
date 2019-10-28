package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Succulent;

import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

/**
 * @program: FamilyFarmSeaside
 * @description: Bonsai is a selling pattern of Succulent, take this as a abstract class.
 * @author: stern
 * @create: 2019/10/27
 **/
public abstract class SucculentBonsai extends Vegetable {
    private String species;
    public SucculentBonsai(String species){
        this.species = species;
    }
    public SucculentBonsai() {}
    protected abstract void add(SucculentBonsai succulentBonsai);
    public void show() { this.show(0); }
    protected abstract void show(int depth);

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }
}