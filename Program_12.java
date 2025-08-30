import java.io.*;
public class Program_12 {
    public static void main(String[] args) {
        listFiles(new File("C:\\Users\\safir\\OneDrive - Jain University Incubation Centre\\Photos\\Documents\\Desktop\\MCA"));
    }
    static void listFiles(File dir)
    {
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Cannot access: " + dir.getAbsolutePath());
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                listFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());

            }
        }
    }
}
