package fairy_tale_characters;

import world.*;

public abstract class PersonCharacter extends Character {
    private final Shoes shoes;
    public PersonCharacter(String name, Shoes shoes){
        super(name);
        this.shoes = shoes;
    }
    public Shoes getShoes() {
        return shoes;
    }
    public abstract void whatDidYouPutOn ();
}
