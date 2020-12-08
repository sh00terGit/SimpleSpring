package by.shipul.spring;

import by.shipul.spring.music.Computer;
import by.shipul.spring.music.MusicPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        //player.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        LOG(computer.toString());
       // context.close();

    }

    public static void LOG(String str) {
        System.out.println(str);
    }
}
