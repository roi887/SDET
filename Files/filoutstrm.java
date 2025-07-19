package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class filoutstrm {
    public static void main(String[] args) throws IOException {

        File f = new File("./test.txt");
        FileOutputStream ft = new FileOutputStream(f);
        if(f.exists()){

            f.delete();
        }
        f.createNewFile();

        String test ="ar9494949494949944 ";

        for( char c:test.toCharArray()){

        ft.write((int)c);
        }
        System.out.println("data pushed");
        ft.close();
    }
}
