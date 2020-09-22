import beans.FileWriter;
import beans.SpeakerBean;
import beans.WriterImpl;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        File newFile = new File("TextFile.txt");
        File testFile = new File("testFile.txt");
        SpeakerBean speaker = (SpeakerBean)context.getBean("speakerBean");
        speaker.sayHello();


    }
}
