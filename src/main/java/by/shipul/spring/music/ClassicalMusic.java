package by.shipul.spring.music;

import by.shipul.spring.TestSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class ClassicalMusic extends AbstractMusic implements IMusic {

    public ClassicalMusic(String song) {
        super(song);
    }

    public void doMyInit() {
        TestSpring.LOG("Classical music  : do my init");
    }
    public void doMyDestroy() {
        TestSpring.LOG("Classical music  : do my destroy");
    }

}
