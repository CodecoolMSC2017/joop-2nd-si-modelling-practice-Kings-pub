import java.io.*;

public class Night {
    Place[] mainRoom;
    Place[] gameRoom;
    Place[] smokeArea;
    Place[] counter;
    private int time;

    public Night(Place[] mainRoom,Place[] gameRoom,Place[] smokeArea,Place[] counter) {
        this.mainRoom = mainRoom;
        this.gameRoom = gameRoom;
        this.smokeArea = smokeArea;
        this.counter = counter;
        time = 1080;
    }


    public void setTime(int timeUsed) {
        time += timeUsed;
    }

    public int getTime() {
        return time;
    }



}