package com.familyFarmSeaside.Animal.DetailSpecies;

import com.familyFarmSeaside.Animal.Clone;
import com.familyFarmSeaside.Animal.Species.Poultry;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Chicken extends Poultry implements Clone {
    public Chicken() {
        super();
        detailedSpecies = "CHICKEN";
    }

    public Chicken(Chicken chicken) {
        species = chicken.species;
        detailedSpecies = chicken.detailedSpecies;
        sex = chicken.sex;
        age = chicken.age;
    }

    public Chicken clone(){
        return new Chicken(this);
    }
}
