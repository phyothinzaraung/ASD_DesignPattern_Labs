package state;

import java.util.Random;

public abstract class LevelState {
    protected Game game;
    LevelState(Game game){
        this.game = game;
    }

    public abstract void addPoints(int newPoints);

    public abstract int getLevel();
}
