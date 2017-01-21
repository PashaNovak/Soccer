package model;

import com.sun.javafx.scene.traversal.Direction;
import utils.Sound;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MainScene extends Scene {
    private Pitch pitch;
    private Player player;
    PlayerDirection playerDirection;

    public MainScene(Game game) {
        super(game);
        player = new Player();
        pitch = new Pitch();
    }

    @Override
    public void update(long nanosPassed) {
        processInput();
    }

    @Override
    public void draw(Graphics2D g) {
        System.out.println("hhh");
        int x = player.getX();
        int y = player.getY();
        System.out.println(x + " " + y);
        String teamName1 = "TeamA";
        String teamName2 = "TeamB";
        String team1Scored = "0";
        String team2Scored = "0";
        g.setFont(new Font("Default", Font.BOLD, 36));
        pitch.getPitch().render(g, 0, 0);
        player.getPlayerSprite().render(g, player.getX(), player.getY());
        g.setColor(Color.white);
        FontMetrics fm = g.getFontMetrics();
        g.drawString(teamName1, pitch.tpPopapsLeftX + pitch.tvPopapsWidth / 2 - fm.stringWidth(teamName1) / 2, 80);
        g.drawString(teamName2, pitch.tpPopapsRightX + pitch.tvPopapsWidth / 2 - fm.stringWidth(teamName2) / 2, 80);
        g.setFont(new Font("Default", Font.BOLD, 46));
        g.drawString(team1Scored, pitch.tabloX + pitch.tabloWidth / 4 - fm.stringWidth(team1Scored) / 2, pitch.tabloY + 50 + pitch.tabloHeight / 2 - 46 / 2);
        g.drawString(team2Scored, pitch.tabloX + pitch.tabloWidth * 3 / 4 - fm.stringWidth(team2Scored) / 2, pitch.tabloY + 50 + pitch.tabloHeight / 2 - 46 / 2);
    }

    @Override
    public void playMusic(String path) {
        Sound.playSound(path);
    }

    private void processInput() {
        for (KeyEvent event : game.getInput().getKeyPressedEvents()) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_UP:
                    player.setDirection(PlayerDirection.UP);
                    player.move(0, -3);
                    break;
                case KeyEvent.VK_RIGHT:
                    player.setDirection(PlayerDirection.RIGHT);
                    player.move(3, 0);
                    break;
                case KeyEvent.VK_DOWN:
                    player.setDirection(PlayerDirection.DOWN);
                    player.move(0, 3);
                    break;
                case KeyEvent.VK_LEFT:
                    player.setDirection(PlayerDirection.LEFT);
                    player.move(-3, 0);
                    break;
            }
        }
    }
}
