package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

//普通土地
public class CommonTract extends Tract{
    public CommonTract(){
        tractType = "CommonTract";
    }

    @Override
    public void draw(int loc_x, int loc_y, Character[][] canvas) {
        for(int i = loc_y*sideLength; i < loc_y*sideLength + sideLength; i++) {
            for (int j = loc_x * sideLength; j < loc_x * sideLength + sideLength; j++) {
                canvas[i][j] = '=';
            }
        }
//        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 - 1] = '普';
//        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2] = '通';
//        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 + 1] = '土';
    }
}
