
import world.*;
import fairy_tale_characters.*;

public class Main {
    public static void main(String[] args) {
        Puh puh = new Puh("Пух");
        Shoes shoes = RandomEnum.getRandomShoes();
        Robin robin = new Robin("Кристофер Робин", shoes);
        Songs favSong = RandomEnum.getRandomSongs();

        puh.located(Location.FOREST);

        puh.sing(favSong, () -> {
            puh.likeTheSong(favSong);
        });

        puh.thinkAbout(() -> {
            Tense tense = Tense.FUTURE;
            puh.sing(favSong, tense);
            puh.wantToEat(tense);
            LastString.setCorrect(false);
        });

        puh.thinkAbout(() -> {
            puh.purr();
        });

        robin.located(Location.THRESHOLD);
        robin.whatDidYouPutOn();

        puh.understand(() -> {
            puh.see(shoes);
        });

        puh.setWhatOnFace("остатки мёда");
        puh.cleanMuzzle();
        puh.setReady(true);
        puh.stretch();
    }
}