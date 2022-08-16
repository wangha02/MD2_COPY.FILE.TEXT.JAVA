import java.io.*;

public class ReadFileTxt {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os =null;

        try {
            File aFile = new File("C:\\Users\\Admin\\IdeaProjects\\TinhKetQuaFizzBuzz\\untitled2\\untitled6\\src\\nownow.txt");
            File bFile = new File("C:\\Users\\Admin\\IdeaProjects\\TinhKetQuaFizzBuzz\\untitled2\\untitled6\\src\\newnew.txt");
            is = new FileInputStream(aFile);
            os = new FileOutputStream(bFile);
            byte[] buffer = new byte[1024];
            int length;
            // copy the file content in bytes
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.close();
            System.out.println("File is copied successfull!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}