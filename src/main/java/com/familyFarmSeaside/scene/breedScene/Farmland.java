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
    private Tract[][] tracts; //荒地，普通土地，黑土地

    public Farmland() //默认土地块数为 2*3，且所有土地皆为荒地
    {
        tracts = new Tract[width][length];
        TractFactory tractFactory = TractFactory.getInstance();
        //初始状态下所有土地都为荒地
        for(int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++)
                //将所有Tract置为荒地
                tracts[i][j] = tractFactory.getTract("WasteTract");
        }
    }

    public int getLength(){return length;}

    public int getWidth(){return width;}

    public void setTract(int loc_x, int loc_y, String TractType){
        TractFactory tractFactory = TractFactory.getInstance();
        tracts[loc_y][loc_x] = tractFactory.getTract(TractType);
    }

    public Character[][] getCanvas(){
        Character[][] canvas = new Character[width*Tract.sideLength][length*Tract.sideLength];
        //先将画布清空
        for(int i = 0; i < width*Tract.sideLength; i++){
            for(int j = 0; j < length*Tract.sideLength; j++){
                canvas[i][j] = ' ';
            }
        }
        //渲染画布
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

    @Override
    public String toString() {
        return "class Farmland extends BreedScene";
    }
}
