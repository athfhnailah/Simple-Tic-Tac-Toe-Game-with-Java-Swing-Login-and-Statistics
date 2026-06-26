import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private Player currentPlayer;
    private PlayerService playerService;
    private GameLogic gameLogic;

    private JButton[] buttons;
    private JLabel lblStatus;

    public GameFrame(Player player) {

        this.currentPlayer = player;
        this.playerService = new PlayerService();
        this.gameLogic = new GameLogic();

        setTitle("Tic Tac Toe");
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        lblStatus = new JLabel(
                "Player : " + player.getUsername(),
                SwingConstants.CENTER
        );

        add(lblStatus, BorderLayout.NORTH);

        JPanel boardPanel =
                new JPanel(new GridLayout(3,3));

        buttons = new JButton[9];

        for(int i=0;i<9;i++){

            buttons[i] = new JButton("");

            buttons[i].setFont(
                    new Font("Arial",
                            Font.BOLD,
                            40)
            );

            final int index = i;

            buttons[i].addActionListener(
                    e -> handlePlayerMove(index)
            );

            boardPanel.add(buttons[i]);
        }

        add(boardPanel, BorderLayout.CENTER);
    }

    private void handlePlayerMove(int index) {

        boolean success =
                gameLogic.makeMove(index,'X');

        if(!success){
            return;
        }

        buttons[index].setText("X");

        if(gameLogic.checkWinner('X')){

            finishGame("WIN");
            return;
        }

        if(gameLogic.isDraw()){

            finishGame("DRAW");
            return;
        }

        int computerIndex =
                gameLogic.computerMove();

        if(computerIndex != -1){

            buttons[computerIndex]
                    .setText("O");
        }

        if(gameLogic.checkWinner('O')){

            finishGame("LOSE");
            return;
        }

        if(gameLogic.isDraw()){

            finishGame("DRAW");
        }
    }

   private void finishGame(String result) {

    playerService.updateStatistics(
            currentPlayer,
            result
    );

    currentPlayer =
            playerService.getPlayerById(
                    currentPlayer.getId()
            );

    JOptionPane.showMessageDialog(
            this,
            "Game Result : " + result
    );

    MainMenuFrame menuFrame =
            new MainMenuFrame(currentPlayer);

    menuFrame.setVisible(true);

    dispose();
}
}
