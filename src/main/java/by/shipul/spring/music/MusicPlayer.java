package by.shipul.spring.music;

import by.shipul.spring.TestSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
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
    @Autowired
    public MusicPlayer(List<IMusic> listMusic) {
        this.listMusic = listMusic;
    }

    //@Autowired
    public MusicPlayer(@Qualifier("rockMusic") IMusic music) {
        listMusic.add(music);
    }

    public void playMusic() {
        for(IMusic sing : listMusic) {
            TestSpring.LOG(sing.getSong());
        }
    }


    public void playShuffleMusic() {
        int i=1;
        Random random = new Random();
        while (i<=9) {
            TestSpring.LOG(listMusic.get(random.nextInt(6)).getSong());
            i++;
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
