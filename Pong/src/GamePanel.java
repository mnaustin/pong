import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel{
    private Ball ball;
    public GamePanel(Ball ball)
    {
        this.ball = ball;
    }
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(ball.getX(), ball.getY(), 20,20);
    }
}
