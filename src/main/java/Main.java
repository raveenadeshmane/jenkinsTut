import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Job is working " + new Random().nextInt();
        FileOutputStream outputStream = new FileOutputStream("OpenL.txt");
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
        System.out.println("Job is working ");
    }
}
