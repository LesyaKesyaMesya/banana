package yacht.technique;

import yacht.Yacht;

public class Motor extends Detail{
    private boolean isWork;
    public Motor(Yacht yacht){
        super(yacht);
    }
    public void work(){
        if (getYacht().getEngineRoom().getGenerator().getOn()) {
            isWork = true;
            System.out.printf("Мотор заработал.%n");
        }
    }
    public boolean getIsWork(){
        return isWork;
    }
}
