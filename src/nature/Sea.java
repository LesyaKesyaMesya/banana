package nature;

import creature.Cthulhu;
import enums.StatusOfSea;
import yacht.Yacht;

public class Sea {
    private StatusOfSea statusOfSea;
    private int coordinateYacht;
    private final Yacht yacht;
    private int coordinateCthulhu;
    private Cthulhu cthulhu;

    public Sea(Yacht yacht){
        statusOfSea = StatusOfSea.CALM;
        this.yacht = yacht;
    }
    public void setCoordinateCthulhu(int coordinateCthulhu) {
        this.coordinateCthulhu = coordinateCthulhu;
        System.out.printf("Координата ктулху: %s.%n", coordinateCthulhu );
        if (coordinateCthulhu == coordinateYacht) {
            System.out.printf("%s столкнулась с %s.%n", yacht, cthulhu);
            cthulhu.explode();
        }
    }

    public void setCoordinateYacht(int coordinateYacht){
        this.coordinateYacht = coordinateYacht;
        System.out.printf("Координата яхты: %s.%n", coordinateYacht );
        if (coordinateYacht == coordinateCthulhu) {
            System.out.printf("%s столкнулась с %s.%n", yacht, cthulhu);
            cthulhu.explode();
        }
    }
    public void setCthulhu(Cthulhu cthulhu){
        this.cthulhu = cthulhu;
    }
    public void setStatusOfSea(StatusOfSea statusOfSea){
        this.statusOfSea = statusOfSea;
    }
    public int getCoordinateYacht(){
        return coordinateYacht;
    }
    public int getCoordinateCthulhu(){
        return coordinateCthulhu;
    }
    public void createWaves(){
        if(statusOfSea == StatusOfSea.CALM) statusOfSea = StatusOfSea.TROUBLED;
        else if(statusOfSea == StatusOfSea.TROUBLED) statusOfSea = StatusOfSea.STORMY;
        else statusOfSea = StatusOfSea.RAGING;
    }
    @Override
    public  String toString(){
        return String.format("%s море", statusOfSea);
    }

}
