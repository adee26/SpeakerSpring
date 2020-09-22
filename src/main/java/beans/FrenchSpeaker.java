package beans;

import interfaces.Speaker;
import interfaces.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchSpeaker implements Speaker {
    Writer writer;

    public FrenchSpeaker(@Qualifier("fileWriter") Writer writer) {
        this.writer = writer;
    }


    public void sayHello() {
        writer.writeText("Bonjour!");
    }
}
