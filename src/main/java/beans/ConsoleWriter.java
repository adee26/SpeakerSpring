package beans;

import interfaces.Writer;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements Writer {
    public void writeText(String text) {
        System.out.println(text);
    }
}
