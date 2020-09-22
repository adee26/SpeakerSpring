package beans;

import interfaces.Writer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WriterImpl {
    private Writer writer;

    public WriterImpl(@Qualifier("fileWriter") Writer writer){
        this.writer = writer;
    }

    public void writeText(String text){
        writer.writeText(text);
    }
}
