package command;

import java.awt.*;

public class DrawLineCommand implements Command{
    private Graphics g;
    private int x;
    private int y;
    private int width;
    private int height;

    public DrawLineCommand(Graphics g, int x, int y, int width, int height){
        this.g = g;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        g.drawLine(x, y, width, height);
    }

    @Override
    public void unExecute() {
        g.clearRect(0, 0, 600, 600);
    }
}
