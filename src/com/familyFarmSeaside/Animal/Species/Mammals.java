package com.familyFarmSeaside.Animal.Species;

import com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Mammals extends Animal {
    public Mammals() {
        super();
        species = SpeciesName.MAMMALS;
    }

    abstract protected void run();
}
