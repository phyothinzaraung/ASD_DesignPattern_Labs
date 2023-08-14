package state;

public class Level3 extends LevelState{

    Level3(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + 3 * newPoints);
    }

    @Override
    public int getLevel() {
        return 3;
    }
}
