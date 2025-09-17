//Done

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program_11 {
    public static void main(String args[]) throws IOException {

        FileInputStream fin = new FileInputStream("sample.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        int ch;
        while ((ch = fin.read()) != -1) {
            fout.write(ch);
        }

        fin.close();
        fout.close();
        System.out.println("File copied successfully.");
    }
}
