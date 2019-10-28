package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

public abstract class Tract //BreedScene中的一小块土地
{
    //像素宽度
    public static int sideLength = 9;
    //土地种类
    String tractType;
    //loc_x, loc_y为Tract在Farmland中的坐标，锚点在左上角
    public abstract void draw(int loc_x, int loc_y, Character[][] canvas);
}
