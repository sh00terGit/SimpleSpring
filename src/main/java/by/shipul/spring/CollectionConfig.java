package by.shipul.spring;

import by.shipul.spring.music.ClassicalMusic;
import by.shipul.spring.music.IMusic;
import by.shipul.spring.music.JassMusic;
import by.shipul.spring.music.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("by.shipul.spring")
public class CollectionConfig {

    @Bean
    public List<IMusic> musicList() {
        ArrayList<IMusic> music = new ArrayList<>();
        music.add(new ClassicalMusic("classic1"));
        music.add(new ClassicalMusic("classic2"));
        music.add(new ClassicalMusic("classic3"));

        music.add(new JassMusic("jass1"));
        music.add(new JassMusic("jass2"));
        music.add(new JassMusic("jass3"));

        music.add(new RockMusic("rock1"));
        music.add(new RockMusic("rock2"));
        music.add(new RockMusic("rock3"));
        return music;
    }
}
