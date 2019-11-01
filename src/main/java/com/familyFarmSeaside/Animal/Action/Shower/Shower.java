package main.java.com.familyFarmSeaside.Animal.Action.Shower;

import main.java.com.familyFarmSeaside.Animal.Action.Action;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: FamilyFarmSeaside
 * @description: The shower action.
 * @author: stern
 * @create: 2019/10/27
 **/
public abstract class Shower extends Action {
    protected Shower successor; //持有后继的责任对象
    protected Set<String> nameListOfAnimal = new HashSet<String>();

    public Shower() {
        super("Shower");
    }
    public Shower(String name) {
        super("shower" + name);
    }

    public abstract void selectPattern(String animalName);
    public Shower getSuccessor() {
        return successor;
    }
    public void setSuccessor(Shower successor)
    {
        this.successor = successor;
    }

    public abstract void addAnimalName(String name);
    public abstract void removeAnimalName(String name);
    public abstract void showAnimalName();

    public Set<String> getNameListOfAnimal() {
        return nameListOfAnimal;
    }

    public void setNameListOfAnimal(Set<String> nameListOfAnimal) {
        this.nameListOfAnimal = nameListOfAnimal;
    }

    @Override
    public String toString() {
        return "abstract class Shower extends Action";
    }
}