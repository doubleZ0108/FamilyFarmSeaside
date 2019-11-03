package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

/**
 * @program: FamilyFarmSeaside
 * @description: Each tract represent a unit of the farmland.
 * @author: Yimin Li
 * @create: 2019/10/28
 **/
public abstract class Tract
{
    public static int sideLength = 9;   //the side length of the tract
    String tractType;   //the type of the tract

    /**
     * to show itself in the canvas
     * loc_x, loc_y represent the location of the Tract in the Farmland.
     */
    public abstract void draw(int loc_x, int loc_y, Character[][] canvas);

    public Tract(){

    }

    public Tract(String tractType) {
        this.tractType = tractType;
    }

    public static int getSideLength() {
        return sideLength;
    }

    public static void setSideLength(int sideLength) {
        Tract.sideLength = sideLength;
    }

    public String getTractType() {
        return tractType;
    }

    public void setTractType(String tractType) {
        this.tractType = tractType;
    }

    @Override
    public String toString() {
        return "abstract class Tract";
    }
}
