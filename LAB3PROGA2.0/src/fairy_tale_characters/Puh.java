package fairy_tale_characters;


import actions.*;
import world.*;

public class Puh extends AnimalCharacter {


    public Puh(String name) {
        super(name);
    }

    public void likeTheSong(Songs song) {
        System.out.print("Персонажу " + getName() + " понравилась песня " + song.getDescription());
    }
    public void sing(Songs song, Reason reason) {
        reason.call();
        System.out.print(", поэтому ");
        System.out.println(getName() + " запел песню " + song.getDescription());
    }
    @Override
    public void sing(Songs song, Tense tense) {
        switch (tense) {
            case PRESENT -> System.out.print(getName() + " распевает всю дорогу песню " + song.getDescription() + ", тогда ");
            case PAST -> System.out.print(getName() + " распевал всю дорогу песню " + song.getDescription() + ", тогда ");
            case FUTURE -> System.out.print(getName() + " будет распевать песню " + song.getDescription() + ", тогда ");
        }
    }
    @Override
    public void purr() {
        System.out.print(LastString.desription());
        if (!LastString.getCorrect()) {
            System.out.println(getName() + " замурлыкает песню без слов");
        } else {
            System.out.println(getName() + " замурлыкает песню вслух");
        }
    }
    public void understand(Reason reason) {
        System.out.print(getName() + " понял, что предстоит приключение, так как ");
        reason.call();
    }
    public void see(Shoes shoes) {
        System.out.println(getName() + " увидел " + shoes.getDescription());
    }
    public void thinkAbout(Reason reason) {
        System.out.print(getName() + " подумал: Если ");
        reason.call();
    }
    public void wantToEat(Tense tense) {
        switch (tense) {
            case PAST -> System.out.println(getName() + " хотел подкрепиться");
            case FUTURE -> System.out.println(getName() + " захочет подкрепиться");
            case PRESENT -> System.out.println(getName() + " хочет подкрепиться");
        }
    }
    @Override
    public void cleanMuzzle() {
        System.out.println(getName() + " смахнул лапкой " + getWhatOnFace() + " с мордочки");
        setWhatOnFace("NOTHING");
    }
    @Override
    public void stretch() {
        if (getReady()) {
            System.out.println(getName() + " потянулся, чтобы показать, что ко всему готов");
        } else {
            System.out.println(getName() + " потянулся от скуки");
        }
    }
}