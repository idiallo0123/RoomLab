package Rooms;

import Game.Runner;
import People.Person;

public class TrapRoom extends Room {

    public TrapRoom(int xx, int yy)
    {
        super(xx, yy);
    }

    //This class also triggers game ending conditions
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Unfortunately you've stumbled into a trap room. GAME OVER.");
        Runner.gameOff();
    }
}
