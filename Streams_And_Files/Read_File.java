import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_File {

    public static void main(String[] args) {

        String path = "C:\\Users\\laptop\\IdeaProjects\\Streams_And_Files\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {

            int oneByte = fileInputStream.read();

            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}