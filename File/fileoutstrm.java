package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutstrm {
    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");

        if(f.exists()){
            f.delete();

        }
        f.createNewFile();
        FileOutputStream fc = new FileOutputStream(f);

        String text = "arun kumar";

        for( char ch:text.toCharArray()){
fc.write((int)ch);
}
        System.out.println(" Data inserted");
        fc.close();;

    }
}
