package main.java.com.familyFarmSeaside.scene.breedScene;

import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.Tract;
import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.TractFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The scene for raising crops.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Farmland extends BreedScene {
    private final int length = 4;
    private final int width = 3;
    private Tract[][] tracts;       //Wasteland, ordinary land, black land

    public Farmland() {
        /**
         * @description: The default land block number is 2*3, and all land is wasteland.
         *
         * @return : null
         **/
        tracts = new Tract[width][length];
        TractFactory tractFactory = TractFactory.getInstance();

        //In the initial state, all the land is wasteland.
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                //Put all Tract as wasteland
                tracts[i][j] = tractFactory.getTract("WasteTract");
        }
    }

    public void setTract(int loc_x, int loc_y, String TractType){
        TractFactory tractFactory = TractFactory.getInstance();
        tracts[loc_y][loc_x] = tractFactory.getTract(TractType);
    }

    public Character[][] getCanvas(){
        Character[][] canvas = new Character[width*Tract.sideLength][length*Tract.sideLength];

        //Empty the canvas first
        for(int i = 0; i < width*Tract.sideLength; i++){
            for(int j = 0; j < length*Tract.sideLength; j++){
                canvas[i][j] = ' ';
            }
        }

        //Rendering the canvas
        for(int j = 0; j < width; j++) {
            for (int i = 0; i < length; i++)
                tracts[j][i].draw(i, j, canvas);
        }
        return canvas;
    }

    public Tract[][] getTracts() {
        return tracts;
    }

    public void setTracts(Tract[][] tracts) {
        this.tracts = tracts;
    }

    public int getLength(){return length;}

    public int getWidth(){return width;}

    @Override
    public String toString() {
        return "class Farmland extends BreedScene";
    }
}
