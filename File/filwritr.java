package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filwritr {
    public static void main(String[] args) throws IOException {

        File fu = new File("./test.txt");

        if(fu.exists()){
            fu.delete();
        }
            fu.createNewFile();
        FileWriter fw = new FileWriter(fu);



        fw.write("hello hai how are you");

//        for( char ch : text.toCharArray()){
//            fw.write((int)ch);
//        }
        System.out.println("inserted");


        fw.flush();
    }
}
