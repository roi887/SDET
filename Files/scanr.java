package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scanr {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("./test.txt");

        Scanner sc = new Scanner(f);

        while(sc.hasNext()){
            System.out.println(sc.nextLine());

        }
    }
}
