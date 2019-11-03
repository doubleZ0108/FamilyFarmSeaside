package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

/**
 * @program: FamilyFarmSeaside
 * @description: It is a type of tract - Common tract
 * @author: Yimin Li
 * @create: 2019/10/28
 **/
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

    @Override
    public String toString() {
        return "class CommonTract extends Tract";
    }
}
