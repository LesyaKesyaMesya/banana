package nature;

import people.Johansen;

public class World {
    private String date;
    private final Sea sea;
    public World(Sea sea){
        this.sea = sea;
        date = "неизвестный день";
    }
    public void setDate(String date){
        this.date = date;
    }
    public void createStorm(Johansen johansen){
        if (date.equals("2 апреля")) sea.createWaves();
        johansen.setMentalState("в сознании сгустилась тьма");
        System.out.printf("%s разразилась буря.%n", date);
        System.out.printf("Состояние %s: %s.%n", johansen, johansen.getMentalState());
    }
}
