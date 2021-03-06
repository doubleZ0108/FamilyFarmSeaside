package main.java.com.familyFarmSeaside.Animal.Action.Shower;

/**
 * @program: FamilyFarmSeaside
 * @description: The concrete pattern of Shower.
 * @author: stern
 * @create: 2019/10/27
 **/
public class ShowerPattern extends Shower {
    public ShowerPattern() { super(); }
    public ShowerPattern(String name) { super("Pattern " + name); }
    public void makeAction() {
        System.out.println("Showering with " + this.getName());
    }

    public void selectPattern(String animalName)
    /**
     * @description: scan through the chain until certain node find the animal's name is suitable and give reaction.
     *
     * @return : void
     **/
    {
        if (nameListOfAnimal.contains(animalName)) {
            System.out.println("Animal " + animalName + " is showering.");
            makeAction();
        }
        else if (getSuccessor() == null) {
            System.out.println("Animal " + animalName + " has no suitable Shower Pattern, cannot shower now.");
        }
        else {
            getSuccessor().selectPattern(animalName);
        }
    }

    @Override
    public void addAnimalName(String name) {
        this.nameListOfAnimal.add(name);
    }

    @Override
    public boolean removeAnimalName(String name) {
        return this.nameListOfAnimal.remove(name);
    }

    @Override
    public void showAnimalName() {
        System.out.print("The suitable animals' names are:");
        for (String name : this.nameListOfAnimal) {
            System.out.print(" " + name);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "class ShowerPattern extends Shower";
    }
}