import javax.swing.*;
import java.awt.*;

public class Tetris extends JFrame {
    private JLabel statusbar;

    public Tetris(){
        initUI();
    }

    public void initUI(){
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusbar(){
        return statusbar;
    }

    public static void main(String[] agrs){
        EventQueue.invokeLater( () ->{
            var game = new Tetris();
            game.setVisible(true);
        });
    }
}
