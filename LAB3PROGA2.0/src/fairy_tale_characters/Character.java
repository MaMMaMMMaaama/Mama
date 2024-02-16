package fairy_tale_characters;

import world.*;

public class Character {
    private final String name;

    public Character(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void located(Location location) {
        System.out.println("> " + getName() + " находится в локации " + location.getDescription());
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
}
