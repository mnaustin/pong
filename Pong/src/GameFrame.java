import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame
{
    public GameFrame(GamePanel gamePanel){
        add(gamePanel);
        setTitle("Pong");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        //game loop
        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ball.move();
                gamePanel.repaint();
            }
        });
        timer.start();
    }
    public static void main(String[] args)
    {
        Ball ball = new Ball(50,50,5,3);
        GamePanel gamePanel = new GamePanel(ball);
        GameFrame gameFrame = new GameFrame(gamePanel);
    }
}
