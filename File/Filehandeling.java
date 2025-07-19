package File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Filehandeling {


    public static void main(String[] args) throws IOException {


        //File f = new File("C:\\Users\\ARUN\\Documents\\AutomationFiles\\Filehandeling\\resume.txt");
        //File f = new File("./resources/test");
        //System.out.println(f.mkdirs());

        File f = new File("C:\\Users\\ARUN\\Documents\\AutomationFiles\\Filehandeling");
        System.out.println(Arrays.toString(f.list()));
        System.out.println(Arrays.toString(new Date[]
                {new Date(f.lastModified())}));

        System.out.println(f.isFile());
        System.out.println(f.isDirectory());









//        if(f.exists()) {
//        System.out.println("successfully deleted and the  status is :"+ f.delete());}
//       System.out.println("new file created and status is :" +f.createNewFile());
        //System.out.println(f.isHidden());
//        System.out.println(f.canWrite());
//        f.setWritable(true);
//        System.out.println(f.canWrite());

    }
}
