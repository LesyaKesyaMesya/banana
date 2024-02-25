package enums;

public enum Speed {
    SLOW(2),
    NORMAL(4),
    FAST(6);
    private final int amount;
    Speed(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
