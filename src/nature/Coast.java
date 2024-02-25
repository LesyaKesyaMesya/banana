package nature;

import creature.Cthulhu;

public class Coast {
    private final String material;
    private Cthulhu cthulhu;
    public Coast(String material){
        this.material = material;
    }
    public void setCthulhu(Cthulhu cthulhu){
        this.cthulhu = cthulhu;
    }
    public void deleteCthulhu(){
        cthulhu = null;
    }
    @Override
    public String toString(){
        return String.format("%s берег", material);
    }
}

