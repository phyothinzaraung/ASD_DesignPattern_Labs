package state;

import java.util.Random;

public class Game {
    LevelState state;
    private int totalPoints;

    public void setState(LevelState state) {
        this.state = state;
    }

    public void play(){
        Random random = new Random();
        state.addPoints(random.nextInt(7));
        System.out.println("points="+totalPoints+" level="+state.getLevel());
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
