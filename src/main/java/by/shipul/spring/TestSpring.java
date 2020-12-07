package by.shipul.spring;

import by.shipul.spring.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("MusicPlayer", MusicPlayer.class);
        player.playMusic();
        context.close();
    }

    public static void LOG(String str) {
        System.out.println(str);
    }
}
