package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

//文土地
public class BlackTract extends Tract{
    public BlackTract(){
        tractType = "BlackTract";
    }

    @Override
    public void draw(int loc_x, int loc_y, Character[][] canvas) {
        for(int i = loc_y*sideLength; i < loc_y*sideLength + sideLength; i ++){
            for (int j = loc_x*sideLength; j < loc_x*sideLength + sideLength; j ++){
                canvas[i][j] = '^';
            }
        }
        for(int i = loc_x*sideLength + (sideLength - 1)/2 - 3; i < loc_x*sideLength + (sideLength - 1)/2 + 4; i++) {
            canvas[loc_y * sideLength + (sideLength - 1) / 2 - 1][i] = ' ';
            canvas[loc_y * sideLength + (sideLength - 1) / 2 + 1][i] = ' ';
        }
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 - 3] = ' ';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 - 2] = 'B';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 - 1] = 'L';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2] = 'A';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 + 1] = 'C';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 + 2] = 'K';
        canvas[loc_y*sideLength + (sideLength - 1)/2][loc_x*sideLength + (sideLength - 1)/2 + 3] = ' ';
    }

    @Override
    public String toString() {
        return "class BlackTract extends Tract";
    }
}
