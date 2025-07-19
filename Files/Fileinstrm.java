package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileinstrm {

    public static void main(String[] args) throws IOException {

        File f = new File("./test.txt");

//        if(f.exists()){
//
//            f.delete();
//        }
//        f.createNewFile();


        FileInputStream fi= new FileInputStream(f);

        int asci;
        while((asci=fi.read())!=-1){
            System.out.print((char)asci);
        }


        fi.close();

    }
}
