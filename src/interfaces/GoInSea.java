package interfaces;

import enums.Speed;
import nature.Sea;

public interface GoInSea {
    void go(Sea sea, Speed speed, int time, boolean isForward);
}
