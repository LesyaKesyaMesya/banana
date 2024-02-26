import  creature.Cthulhu;
import enums.Speed;
import enums.StatusOfSea;
import interfaces.Laugh;
import nature.Coast;
import nature.Sea;
import nature.World;
import people.Briden;
import people.Johansen;
import things.Noise;
import yacht.Yacht;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Johansen johansen = new Johansen();
        Briden briden = new Briden();
        Yacht yacht = new Yacht(johansen, briden);
        Sea sea = new Sea(yacht);
        Coast coast = new Coast("Каменный");
        World world = new World(sea, coast);
        Cthulhu cthulhu = new Cthulhu();

        johansen.run(yacht.getEngineRoom(), yacht.getDeck());
        yacht.go(sea, Speed.SLOW, 7, true);
        cthulhu.beOnCoast(coast);
        cthulhu.slideDown(coast, sea);
        briden.lookBack(cthulhu, johansen);
        johansen.beBrave(yacht, sea);
        sea.setStatusOfSea(StatusOfSea.CALM);
        yacht.go(sea, Speed.NORMAL, 4, true);

        johansen.think(yacht.getCabin());
        Laugh maniac = new Laugh() {
            public void laughNextToJohansen(Johansen johansen){
                Noise laugh = new Noise("ахахахахаха");
                System.out.printf("%s издал звук: %s. %n",this, laugh);
                johansen.createFood(this);
                System.out.printf("Маньяк заткнулся.%n");
            }
            @Override
            public String toString(){
                return "Маньяк";
            }
        };
        maniac.laughNextToJohansen(johansen);
        johansen.beDepressed(yacht);
        world.setDate("2 апреля");
        world.createStorm(johansen);
        johansen.feel("ощущение призрачного круговорота в водной пучине бесконечности",  "головокружительная гонка через мятущиеся вселенные на хвосте кометы и отчаянные прыжки из бездны до луны и с луны обратно в бездну");
        Laugh demons = new Laugh() {
            public void laughNextToJohansen(Johansen johansen){
                Noise laugh = new Noise("ахахахахаха");
                System.out.printf("%s издал звук: %s. %n",this, laugh);
                johansen.feel("ощущения усилились");
            }

            @Override
            public String toString(){
                return "Древние боги и зеленые насмешливые бесы";
            }
        };
        demons.laughNextToJohansen(johansen);
    }
}