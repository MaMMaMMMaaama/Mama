package world;

import java.util.Random;

public class RandomEnum{
    public static Songs getRandomSongs() {
        Songs[] values = Songs.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
    public static Shoes getRandomShoes() {
        Shoes[] values = Shoes.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }
}
