import java.io.File;

public class List_Files {

    public static void main(String[] args) {

        File file=new File("C:\\Users\\laptop\\IdeaProjects\\Streams_And_Files\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if(file.exists()){
            File[] files = file.listFiles();
            for (File f : files) {
                if(!f.isDirectory()){
                    System.out.println(f.getName()+": ["+ f.length()+"]");
                }
            }


        }
    }
}