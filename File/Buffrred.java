package File;

import java.io.*;

public class Buffrred {
    public static void main(String[] args) throws IOException {


       FileReader ff = new FileReader("./test.txt");

        BufferedReader fd = new BufferedReader(ff);

        String line;
        String text = "";
        while((line=fd.readLine())!=null){
text+=line;

        }
        System.out.println(text);
        ff.close();
        fd.close();;
    }
}
