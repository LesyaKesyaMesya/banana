package enums;

public enum StatusOfSea {
    CALM("спокойное"),
    TROUBLED("взволнованное"),
    STORMY("штормовое"),
    RAGING("бушующее");
    private final String description;
    StatusOfSea(String description){
        this.description = description;
    }
    @Override
    public  String toString(){
        return description;
    }
}
