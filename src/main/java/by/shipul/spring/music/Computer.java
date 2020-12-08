package by.shipul.spring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Computer {

    private MusicPlayer player;
    private int id;

    @Autowired
    public Computer(MusicPlayer player) {
        this.player = player;
        this.id=1;
    }

    public void playPlayer() {
        player.playMusic();
    }

    public void playPlayerShuffle() {
        player.playShuffleMusic();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "player=" + player +
                ", id=" + id +
                '}';
    }
}
