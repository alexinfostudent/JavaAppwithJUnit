import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Objects {

    @Test // Проверка создания пользователя
    public void AddPlayer() {

        int collVo = 10;

        Polimorf.GameObject player = new Polimorf.GameObject();

        while (collVo > 0) {

            Polimorf.gameObjects.remove(player);

            player.image = "@";
            player.posX = (int) (Math.random() * 450);
            player.posY = (int) (Math.random() * 450);
            Polimorf.gameObjects.add(player);
            collVo--;
        }
        assertEquals("Количество созданных игроков " + Polimorf.gameObjects.size(), 1, Polimorf.gameObjects.size());

        while (collVo < 10) { // Чистим список
            Polimorf.gameObjects.remove(player);
            collVo++;
        }

    }
    @Test // Проверка создания объектов
    public void AddObjects() {

        int collVo = 10000;

        Polimorf.GameObject obj = new Polimorf.GameObject();

        obj.image = "v";

        while (collVo > 0) {
            obj.posX = (int) (Math.random() * 500);
            obj.posY = (int) (Math.random() * 500);
            Polimorf.gameObjects.add(obj);
            collVo--;
        }

        assertEquals("Количество созданных объектов " + Polimorf.gameObjects.size(), 10000, Polimorf.gameObjects.size());

        while (collVo < 10000) { // Чистим список
            Polimorf.gameObjects.remove(obj);
            collVo++;
        }

    }





}