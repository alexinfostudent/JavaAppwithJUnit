import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Polimorf {
    static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

    static class GameObject {
        public String image;
        public int posX;
        public int posY;
    }

    public static class World extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (GameObject obj : gameObjects) {
                g.drawString(obj.image, obj.posX, obj.posY);
            }
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Generaciya");
        World world = new World();
        for  (int i = 0; i < 100; i++){
            GameObject obj = new GameObject();
            obj.image = "v";
            obj.posX = (int) (Math.random() * 500);
            obj.posY = (int) (Math.random() * 500);
            gameObjects.add(obj);
            GameObject player = new GameObject();
            player.image = "@";
            player.posX = (40);
            player.posY = (30);
            gameObjects.add(player);
        }
        window.setContentPane(world);
        window.setSize(530, 530);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}