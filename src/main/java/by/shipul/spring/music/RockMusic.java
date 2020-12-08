package by.shipul.spring.music;

import org.springframework.stereotype.Component;


public class RockMusic extends AbstractMusic implements IMusic {
    public RockMusic(String song) {
        super(song);
    }
}
