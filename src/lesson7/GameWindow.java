package lesson7;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int winWidth;
    private int winHeight;
    private int winX;
    private int winY;

    private JButton startGameButton;
    private JButton endGameButton;

    private GameField gameField;
    private JPanel settingsPanel;
    private JPanel controlPanel;


    GameWindow() {
        setUpWindow();
        createSettingsPanel();
        createButtons();
        createControlPanel();


        gameField = new GameField();
        settingsPanel.add(controlPanel, BorderLayout.NORTH);
        add(settingsPanel, BorderLayout.EAST);
        add(gameField);
        setVisible(true);
    }

    public void setUpWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chess App");
        this.winWidth = 1024;
        this.winHeight = 768;
        this.winX = 400;
        this.winY = 450;
        setSize(winWidth, winHeight);
        setLocation(winX, winY);
        setVisible(true);

    }

    private void createButtons() {
         startGameButton = new JButton("Start");
         endGameButton = new JButton("End");
    }

    private void createSettingsPanel() {
        settingsPanel = new JPanel();
        settingsPanel.setLayout(new GridLayout(2, 1));
    }

    private void createControlPanel() {
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(6, 1));
        controlPanel.add(startGameButton);
        controlPanel.add(endGameButton);
    }

}
