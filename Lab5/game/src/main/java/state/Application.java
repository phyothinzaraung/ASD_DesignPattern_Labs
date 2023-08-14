package state;

public class Application {

    public static void main(String[] args) {
        Game game = new Game();
        LevelState levelState = new Level1(game);
        game.setState(levelState);
        game.play();
        //System.out.println("points="+game.getTotalPoints()+" level="+game.state.getLevel());
        game.play();
        //System.out.println("points="+game.getTotalPoints()+" level="+game.state.getLevel());
        game.play();
        //System.out.println("points="+game.getTotalPoints()+" level="+game.state.getLevel());
        game.play();
        //System.out.println("points="+game.getTotalPoints()+" level="+game.state.getLevel());
        game.play();
        //System.out.println("points="+game.getTotalPoints()+" level="+game.state.getLevel());
    }
}
