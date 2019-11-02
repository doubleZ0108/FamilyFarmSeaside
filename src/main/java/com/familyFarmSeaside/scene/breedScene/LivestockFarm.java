package main.java.com.familyFarmSeaside.scene.breedScene;

/**
 * @program: FamilyFarmSeaside
 * @description: The scene to raise livestock except fish.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class LivestockFarm extends BreedScene {
    public LivestockFarm() {
    }

    public LivestockFarm(double cost) {
        super(cost);
    }

    public LivestockFarm(double cost, String location) {
        super(cost, location);
    }

    @Override
    public String toString() {
        return "class LivestockFarm extends BreedScene";
    }
}
