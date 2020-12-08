package by.shipul.spring.music;

import org.springframework.stereotype.Component;

@Component
public class JassMusic implements IMusic{

    @Override
    public String getSong() {
        return "Jass music";
    }
}
