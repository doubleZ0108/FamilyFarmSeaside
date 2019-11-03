package main.java.com.familyFarmSeaside.scene.breedScene;

/**
 * @program: FamilyFarmSeaside
 * @description: The scene for raising fish.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class FishPond extends BreedScene {

    public FishPond() {
    }

    public FishPond(double cost) {
        super(cost);
    }

    public FishPond(double cost, String location) {
        super(cost, location);
    }

    @Override
    public String toString() {
        return "class FishPond extends BreedScene";
    }
}
