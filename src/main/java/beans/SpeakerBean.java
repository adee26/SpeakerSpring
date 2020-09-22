package beans;

import interfaces.Speaker;
import interfaces.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpeakerBean {
    private Speaker speaker;

    public SpeakerBean(@Qualifier("frenchSpeaker") Speaker speaker) /*,@Qualifier("consoleWriter") Writer writer) */{
        this.speaker = speaker;
        //this.writer = writer;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void sayHello(){
        speaker.sayHello();
    }

    @PostConstruct
    public void init(){
        System.out.println("The bean is initialized.");
    }
}
