package by.shipul.spring.music;

import by.shipul.spring.TestSpring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<IMusic> listMusic = new ArrayList<>();
    private String name;
    private Integer volume;

    public void setListMusic(List<IMusic> listMusic) {
        this.listMusic = listMusic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<IMusic> listMusic) {
        this.listMusic = listMusic;
    }

    public void playMusic() {
        for(IMusic sing : listMusic) {
            TestSpring.LOG(sing.getSong());
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + listMusic +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
