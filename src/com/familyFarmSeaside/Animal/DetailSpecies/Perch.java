package com.familyFarmSeaside.Animal.DetailSpecies;

import com.familyFarmSeaside.Animal.Clone;
import com.familyFarmSeaside.Animal.Species.Fish;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Perch extends Fish implements Clone {
    public Perch() {
        super();
        detailedSpecies = "PERCH";
    }

    public Perch(Perch perch) {
        species = perch.species;
        detailedSpecies = perch.detailedSpecies;
        sex = perch.sex;
        age = perch.age;
    }

    public Perch clone(){
        return new Perch(this);
    }
}
