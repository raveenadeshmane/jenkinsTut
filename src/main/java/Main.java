import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Job is working " + new Random().nextInt();
        System.out.println("String is: " + str);
        File file =new File("../OpenL/Openl.txt");
        System.out.println(file.getAbsolutePath());
        if (!file.exists()) {
            file.createNewFile();
        }
        readFile(file);
        FileOutputStream outputStream = new FileOutputStream(file);

        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
        System.out.println("Done");


       readFile(file);


    }

    private static void readFile(File file) {
        System.out.println("Read File _______");
        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = fis.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("________");
    }

}
