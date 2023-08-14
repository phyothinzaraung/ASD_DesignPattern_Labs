package state;

public class Level2 extends LevelState{

    Level2(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + 2 * newPoints);
        checkForUpdate();
    }

    private void checkForUpdate(){
        if (game.getTotalPoints() > 20) { // move to level 3
            LevelState level3 = new Level3(game);
            level3.addPoints(game.getTotalPoints() + 2);//add 2 bonus points
            game.setState(level3);
        }
    }

    @Override
    public int getLevel() {
        return 2;
    }
}
