package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filrder {

    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");


        FileReader fr = new FileReader(f);

        int asci;
        while((asci=fr.read())!=-1){

        System.out.print((char)asci);
    }
}}
