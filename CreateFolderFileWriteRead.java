package corejava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFolderFileWriteRead {

    public static void main(String[] args) throws IOException {
        
        // ****************Create file in Test folder********************
        File folder = new File("I:\\java\\Core Java\\Test\\IO");
        folder.mkdir();
        
        // ****************Create file in OI folder**********************
        File file = new File("I:\\java\\Core Java\\Test\\IO\\fileTest.txt");
        file.createNewFile();
        
        //****************Write something  in file**********************
        PrintWriter pw = new PrintWriter(file);
        pw.write("Hello Java, how are you?\n");

        // ***********Write arry values in file using for each loop************
        int[] age = {10, 20, 45, 65, 98, 24, 35, 12, 41, 65};
        for (int a : age) {
            pw.write(a + "\n");
        }
        pw.close();
        
        //**********Replecing text in file using for each loop****************
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            String val = s.nextLine();
            String[] arr = val.split("\\. ");
            for (String b : arr) {
                System.out.println(b + ".");
            }
        }
        s.close();

        System.out.println("Result: " + file.exists());

    }

}
