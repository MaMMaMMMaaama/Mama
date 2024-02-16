package world;

public enum Location {
    FOREST("лес"),
    THRESHOLD("порог");

    private final String description;
    Location(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
