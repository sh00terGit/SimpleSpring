package by.shipul.spring.music;

public abstract class AbstractMusic {

    private String song;

    public AbstractMusic(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
