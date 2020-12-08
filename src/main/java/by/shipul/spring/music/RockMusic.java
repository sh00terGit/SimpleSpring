package by.shipul.spring.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements IMusic {
    @Override
    public String getSong() {
        return "RockMusic";
    }
}
