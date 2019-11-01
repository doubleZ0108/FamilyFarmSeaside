package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

public abstract class Tract //BreedScene中的一小块土地
{
    public static int sideLength = 9;   //像素宽度
    String tractType;   //土地种类

    //loc_x, loc_y为Tract在Farmland中的坐标，锚点在左上角
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
