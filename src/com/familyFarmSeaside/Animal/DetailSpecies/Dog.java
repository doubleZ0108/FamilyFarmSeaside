package com.familyFarmSeaside.Animal.DetailSpecies;

import com.familyFarmSeaside.Animal.Clone;
import com.familyFarmSeaside.Animal.Species.Mammals;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Dog extends Mammals implements Clone {
    public Dog() {
        super();
        detailedSpecies = "DOG";
    }

    public Dog(Dog dog) {
        species = dog.species;
        detailedSpecies = dog.detailedSpecies;
        sex = dog.sex;
        age = dog.age;
    }

    public Dog clone(){
        return new Dog(this);
    }
}
