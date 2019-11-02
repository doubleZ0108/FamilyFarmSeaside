package main.java.com.familyFarmSeaside.scene.breedScene;

import main.java.com.familyFarmSeaside.scene.Scene;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class for breedScene.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class BreedScene extends Scene {
    public BreedScene() {
    }

    public BreedScene(double cost) {
        super(cost);
    }

    public BreedScene(double cost, String location) {
        super(cost, location);
    }

    @Override
    public String toString() {
        return "abstract class BreedScene extends Scene";
    }
}
