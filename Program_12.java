//Done
import java.io.*;
public class Program_12 {
    public static void main(String[] args) {
        listfiles(new File("D:\\College\\Sem 2\\ADA"));
    }
    static void listfiles(File dir)
    {
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Cannot access: " + dir.getAbsolutePath());
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                listfiles(file);
            } else {
                System.out.println(file.getAbsolutePath());

            }
        }
    }
}
