package Files;

import java.io.*;

public class Buffrder {

    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");


        BufferedReader br = new BufferedReader(new FileReader(f));

       int asci;

       while((asci=br.read())!=-1){
           System.out.print((char)asci);

        }
br.close();


    }
}
