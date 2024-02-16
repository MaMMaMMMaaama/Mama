package world;

public enum Songs {
    VLADIMIRSKY_CENTRAL("'Владимирский централ'"),
    SHUMELKA("'Шумелка'"),
    GRUPPA_KROVI("'Группа крови'");
    private final String description;
    Songs (String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
