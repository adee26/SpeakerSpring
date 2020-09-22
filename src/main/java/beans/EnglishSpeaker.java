package beans;

import interfaces.Speaker;
import interfaces.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishSpeaker implements Speaker {
    Writer writer;

    public EnglishSpeaker(@Qualifier("consoleWriter") Writer writer) {
        this.writer = writer;
    }

    public void sayHello() {
        writer.writeText("Hello!");
    }
}
