import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Job is working " + new Random().nextInt();
        System.out.println("String is: " + str);
        FileOutputStream outputStream = new FileOutputStream("OpenL.txt");
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
        System.out.println("Job is working ");


       readFile("OpenL.txt");


    }

    private static void readFile(String fileName) {
        System.out.println();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int content;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = fis.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}
