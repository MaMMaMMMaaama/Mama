package world;

public enum Shoes {
    TRAVEL_SHOES("Походные сапоги"),
    FLIP_FLOPS("Шлёпки"),
    RUNNING_SHOES("Кроссовки для бега");

    private final String description;
    private
    Shoes (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
