package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filwritr {

    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");

        if(f.exists()){
            f.delete();
        }
f.createNewFile();
        FileWriter fw = new FileWriter(f);

        String text = "jeevan kumar gowda yada but i am not sure ";

        for( char c: text.toCharArray()){

            fw.write((int)c);
        }
        fw.flush();
        System.out.println("one more data pusdhed ");
    }
}
