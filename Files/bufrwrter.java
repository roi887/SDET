package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufrwrter {

    public static void main(String[] args) throws IOException {

        File f = new File("./test.txt");

        if(f.exists()){
            f.delete();
        }
        f.createNewFile();

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));




            bw.write(" wher are your ");
            bw.flush();

    }

}
