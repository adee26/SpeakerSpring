package beans;

import interfaces.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileWriter implements Writer {
    private File file;

    @Autowired
    public void setFile(File file) {
        this.file = file;
    }

    public void writeText(String text) {
        try(java.io.FileWriter fileWriter = new java.io.FileWriter(file)){
            fileWriter.write(text);
            System.out.println("The text was written in the file.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeTextInAFile(String text){
        try(java.io.FileWriter fileWriter = new java.io.FileWriter(file)){
            fileWriter.write(text);
            System.out.println("The text was written in the file.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
