package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

//荒地
public class WasteTract extends Tract{
    public WasteTract(){
        tractType = "WasteTract";
    }

    @Override
    public void draw(int loc_x, int loc_y, Character[][] canvas) {
        for(int i = loc_x*sideLength; i < loc_x*sideLength + sideLength - 1; i++)//上排
            canvas[loc_y*sideLength][i] = '#';
        for(int i = loc_y*sideLength; i < loc_y*sideLength + sideLength - 1; i++)//右列
            canvas[i][loc_x*sideLength + sideLength - 1] = '#';
        for(int i = loc_y*sideLength + 1; i < loc_y*sideLength + sideLength; i++)//左列
            canvas[i][loc_x*sideLength] = '#';
        for(int i = loc_x*sideLength + 1; i < loc_x*sideLength + sideLength; i++)//下排
            canvas[loc_y*sideLength + sideLength - 1][i] = '#';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2] = '?';
    }
}
