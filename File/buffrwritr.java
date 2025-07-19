package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class buffrwritr {
    public static void main(String[] args) throws Exception {


        File f = new File("./test.txt");

        BufferedWriter br = new BufferedWriter(new FileWriter(f));
        br.newLine();
      
        br.write("get the hell out  of here ");

        System.out.println("new data passed ");
        br.close();


    }

}
