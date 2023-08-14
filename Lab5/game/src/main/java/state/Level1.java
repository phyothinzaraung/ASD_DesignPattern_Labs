package state;

public class Level1 extends LevelState{

    Level1(Game game) {
        super(game);
    }

    @Override
    public void addPoints(int newPoints) {
        game.setTotalPoints(game.getTotalPoints() + newPoints);
        checkForUpdate();
    }

    private void checkForUpdate(){
        if (game.getTotalPoints() > 10) { // move to level 2
            LevelState level2 = new Level2(game);
            level2.addPoints(game.getTotalPoints() + 1);//add 1 bonus point
            game.setState(level2);
        }
    }

    @Override
    public int getLevel() {
        return 1;
    }
}
