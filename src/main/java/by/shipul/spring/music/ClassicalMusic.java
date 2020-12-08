package by.shipul.spring.music;

import by.shipul.spring.TestSpring;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements IMusic {

    public void doMyInit() {
        TestSpring.LOG("Classical music  : do my init");
    }
    public void doMyDestroy() {
        TestSpring.LOG("Classical music  : do my destroy");
    }

    @Override
    public String getSong() {
        return "Classic music";
    }
}
