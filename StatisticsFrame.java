import javax.swing.*;
import java.awt.GridLayout;

public class StatisticsFrame extends JFrame {
    public StatisticsFrame(Player player) {
        setTitle("My Statistics");
        setSize(300,250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,1));
        add(new JLabel("Username : " + player.getUsername()));
        add(new JLabel("Wins : " + player.getWins()));
        add(new JLabel("Losses : " + player.getLosses()));
        add(new JLabel("Draws : " + player.getDraws()));
        add(new JLabel("Score : " + player.getScore()));
    }
}