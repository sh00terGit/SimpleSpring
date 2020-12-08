package by.shipul.spring.music;

import org.springframework.stereotype.Component;


public class JassMusic extends AbstractMusic implements IMusic{


    public JassMusic(String song) {
        super(song);
    }
}
