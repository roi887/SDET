package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fileinputstrem {

    public static void main(String[] args) throws IOException {

        File f = new File("./test.txt");
        if(!f.exists()){
            System.out.println(f.createNewFile());
        }

       // FileInputStream fs = new FileInputStream(f);//  fileinput stream reading
        FileReader fe= new FileReader("./test.txt");// filereader
//
//        int ascii;
//
//        while((ascii=fs.read())!=-1){
//            System.out.print((char)ascii);
//        }
//
//fs.close();

        Scanner sc = new Scanner(fe);//scanner reading

        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

fe.close();
    }
}
